package org.xxpay.mgr.permission.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.xxpay.common.enumm.PublicStatusEnum;
import org.xxpay.dal.dao.mapper.PmsOperatorMapper;
import org.xxpay.dal.dao.mapper.PmsRoleOperatorMapper;
import org.xxpay.dal.dao.model.PmsOperator;
import org.xxpay.dal.dao.model.PmsOperatorExample;
import org.xxpay.dal.dao.model.PmsRoleOperator;
import org.xxpay.dal.dao.model.PmsRoleOperatorExample;

import java.util.*;

@Component
public class PmsOperatorService {
    @Autowired
    private PmsOperatorMapper pmsOperatorDao;

    @Autowired
    private PmsRoleOperatorMapper pmsOperatorRoleDao;
    /**
     * 创建pmsOperator
     */
    public void saveData(PmsOperator pmsOperator) {
        pmsOperatorDao.insert(pmsOperator);
    }

    /**
     * 修改pmsOperator
     */
    public void updateData(PmsOperator pmsOperator) {
        pmsOperatorDao.updateByPrimaryKeySelective(pmsOperator);
    }

    /**
     * 根据id获取数据pmsOperator
     *
     * @param id
     * @return
     */
    public PmsOperator getDataById(Long id) {
        return pmsOperatorDao.selectByPrimaryKey(id);

    }

    /**
     * 分页查询pmsOperator
     *
     * @param pageParam
     * @param ActivityVo
     *            PmsOperator
     * @return
     */
    public List<PmsOperator> listPage(int offset, int limit, PmsOperator pmsOperator) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        PmsOperatorExample example = new PmsOperatorExample();
        PmsOperatorExample.Criteria criteria = example.createCriteria();
        criteria.andLogin_nameEqualTo( pmsOperator.getLogin_name());
        criteria.andReal_nameLike(pmsOperator.getReal_name());
        criteria.andStatusEqualTo(pmsOperator.getStatus());
        example.setLimit(limit);
        example.setOffset(offset);
        example.setOrderByClause("edit_time DESC");
        paramMap.put("loginName", pmsOperator.getLogin_name()); // 操作员登录名（精确查询）
        paramMap.put("realName", pmsOperator.getReal_name()); // 操作员姓名（模糊查询）
        paramMap.put("status", pmsOperator.getStatus()); // 状态

        return pmsOperatorDao.selectByExample(example);
    }

    /**
     * 根据ID删除一个操作员，同时删除与该操作员关联的角色关联信息. type="1"的超级管理员不能删除.
     *
     * @param id
     *            操作员ID.
     */
    public void deleteOperatorById(Long operatorId) {
        PmsOperator pmsOperator = pmsOperatorDao.selectByPrimaryKey(operatorId);
        if (pmsOperator != null) {
            if ("admin".equals(pmsOperator.getType())) {
                throw new RuntimeException("【" + pmsOperator.getLogin_name() + "】为超级管理员，不能删除！");
            }
            pmsOperatorDao.deleteByPrimaryKey(operatorId);
            // 删除原来的角色与操作员关联
            PmsRoleOperatorExample example =new PmsRoleOperatorExample();
            PmsRoleOperatorExample.Criteria criteria = example.createCriteria();
            criteria.andOperator_idEqualTo(operatorId);
            pmsOperatorRoleDao.deleteByExample(example);
        }
    }

    /**
     * 更新操作员信息.
     *
     * @param operator
     */
    public void update(PmsOperator operator) {
        pmsOperatorDao.updateByPrimaryKeySelective(operator);

    }

    /**
     * 根据操作员ID更新操作员密码.
     *
     * @param operatorId
     * @param newPwd
     *            (已进行SHA1加密)
     */
    public void updateOperatorPwd(Long operatorId, String newPwd) {
        PmsOperator pmsOperator = pmsOperatorDao.selectByPrimaryKey(operatorId);
        pmsOperator.setLogin_pwd(newPwd);
        pmsOperatorDao.updateByPrimaryKeySelective(pmsOperator);
    }

    /**
     * 根据登录名取得操作员对象
     */
    public PmsOperator findOperatorByLoginName(String loginName) {
        PmsOperatorExample example =new PmsOperatorExample();
        PmsOperatorExample.Criteria criteria = example.createCriteria();
        criteria.andLogin_nameEqualTo(loginName);

        return pmsOperatorDao.selectByExample(example).get(0);

    }


    /**
     * 保存操作員信息及其关联的角色.
     *
     * @param pmsOperator
     *            .
     * @param roleOperatorStr
     *            .
     */

    @Transactional
    public void saveOperator(PmsOperator pmsOperator, String roleOperatorStr) {
        // 保存操作员信息
        pmsOperatorDao.insert(pmsOperator);
        // 保存角色关联信息
        if (StringUtils.isNotBlank(roleOperatorStr) && roleOperatorStr.length() > 0) {
            saveOrUpdateOperatorRole(pmsOperator, roleOperatorStr);
        }
    }

    /**
     * 保存用户和角色之间的关联关系
     */
    private void saveOrUpdateOperatorRole(PmsOperator pmsOperator, String roleIdsStr) {
        // 删除原来的角色与操作员关联
        PmsRoleOperatorExample example =new PmsRoleOperatorExample();
        PmsRoleOperatorExample.Criteria criteria = example.createCriteria();
        criteria.andOperator_idEqualTo(pmsOperator.getId());
        List<PmsRoleOperator> listPmsOperatorRoles = pmsOperatorRoleDao.selectByExample(example);
        Map<Long, PmsRoleOperator> delMap = new HashMap<Long, PmsRoleOperator>();
        for (PmsRoleOperator pmsOperatorRole : listPmsOperatorRoles) {
            delMap.put(pmsOperatorRole.getRole_id(), pmsOperatorRole);
        }
        if (StringUtils.isNotBlank(roleIdsStr)) {
            // 创建新的关联
            String[] roleIds = roleIdsStr.split(",");
            for (int i = 0; i < roleIds.length; i++) {
                long roleId = Long.parseLong(roleIds[i]);
                if (delMap.get(roleId) == null) {
                    PmsRoleOperator pmsOperatorRole = new PmsRoleOperator();
                    pmsOperatorRole.setOperator_id(pmsOperator.getId());
                    pmsOperatorRole.setRole_id(roleId);
                    pmsOperatorRole.setCreater(pmsOperator.getCreater());
                    pmsOperatorRole.setCreate_time(new Date());
                    pmsOperatorRole.setStatus(PublicStatusEnum.ACTIVE.name());
                    pmsOperatorRoleDao.insert(pmsOperatorRole);
                } else {
                    delMap.remove(roleId);
                }
            }
        }

        Iterator<Long> iterator = delMap.keySet().iterator();
        while (iterator.hasNext()) {
            long roleId = iterator.next();
            PmsRoleOperatorExample example1 =new PmsRoleOperatorExample();
            PmsRoleOperatorExample.Criteria criteria1 = example.createCriteria();
            criteria1.andRole_idEqualTo(roleId);
            criteria1.andOperator_idEqualTo(pmsOperator.getId());
            pmsOperatorRoleDao.deleteByExample(example1);
        }
    }

    /**
     * 修改操作員信息及其关联的角色.
     *
     * @param pmsOperator
     *            .
     * @param roleOperatorStr
     *            .
     */
    public void updateOperator(PmsOperator pmsOperator, String roleOperatorStr) {
        pmsOperatorDao.updateByPrimaryKeySelective(pmsOperator);
        // 更新角色信息
        this.saveOrUpdateOperatorRole(pmsOperator, roleOperatorStr);
    }

}