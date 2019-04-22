package org.xxpay.mgr.permission.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xxpay.dal.dao.mapper.PmsOperatorMapper;
import org.xxpay.dal.dao.mapper.PmsRoleMapper;
import org.xxpay.dal.dao.mapper.PmsRoleOperatorMapper;
import org.xxpay.dal.dao.model.*;

import java.util.*;

@Component
public class PmsOperatorRoleService {
    @Autowired
    private PmsRoleOperatorMapper pmsOperatorRoleDao;

    @Autowired
    private PmsOperatorMapper pmsOperatorDao;

    @Autowired
    private PmsRoleMapper pmsRoleDao;

    /**
     * 根据操作员ID获得该操作员的所有角色id所拼成的String，每个ID用“,”分隔
     *
     * @param operatorId
     *            操作员ID
     * @return roleIds
     */
    public String getRoleIdsByOperatorId(Long operatorId) {
        // 得到操作员和角色列表
        PmsRoleOperatorExample example =new PmsRoleOperatorExample();
        PmsRoleOperatorExample.Criteria criteria = example.createCriteria();
        criteria.andOperator_idEqualTo(operatorId);
        List<PmsRoleOperator> rpList = pmsOperatorRoleDao.selectByExample(example);
        // 构建StringBuffer来拼字符串
        StringBuffer roleIdsBuf = new StringBuffer("");
        for (PmsRoleOperator rp : rpList) {
            roleIdsBuf.append(rp.getRole_id()).append(",");
        }
        String roleIds = roleIdsBuf.toString();
        // 截取字符串
        if (StringUtils.isNotBlank(roleIds) && roleIds.length() > 0) {
            roleIds = roleIds.substring(0, roleIds.length() - 1);
        }
        return roleIds;
    }

    /**
     * 根据操作员id，获取该操作员所有角色的编码集合
     *
     * @param operatorId
     * @return
     */
    public Set<String> getRoleCodeByOperatorId(Long operatorId) {
        // 得到操作员和角色列表
        PmsRoleOperatorExample example =new PmsRoleOperatorExample();
        PmsRoleOperatorExample.Criteria criteria = example.createCriteria();
        criteria.andOperator_idEqualTo(operatorId);
        List<PmsRoleOperator> rpList = pmsOperatorRoleDao.selectByExample(example);
        Set<String> roleCodeSet = new HashSet<String>();

        for (PmsRoleOperator rp : rpList) {
            Long roleId = rp.getRole_id();
            PmsRole role = pmsRoleDao.selectByPrimaryKey(roleId);
            if (role == null) {
                continue;
            }
            roleCodeSet.add(role.getRole_code());
        }

        return roleCodeSet;

    }

    /**
     * 根据角色ID统计有多少个操作员关联到此角色.
     *
     * @param roleId
     *            .
     * @return count.
     */
    public int countOperatorByRoleId(Long roleId) {
        PmsRoleOperatorExample example =new PmsRoleOperatorExample();
        PmsRoleOperatorExample.Criteria criteria = example.createCriteria();
        criteria.andRole_idEqualTo(roleId);
        List<PmsRoleOperator> operatorList = pmsOperatorRoleDao.selectByExample(example);
        if (operatorList == null || operatorList.isEmpty()) {
            return 0;
        } else {
            return operatorList.size();
        }
    }

    /**
     * 根据操作员ID获得所有操作员－角色关联列表
     */
    public List<PmsRoleOperator> listOperatorRoleByOperatorId(Long operatorId) {
        PmsRoleOperatorExample example =new PmsRoleOperatorExample();
        PmsRoleOperatorExample.Criteria criteria = example.createCriteria();
        criteria.andOperator_idEqualTo(operatorId);
        return pmsOperatorRoleDao.selectByExample(example);
    }

    /**
     * 保存操作員信息及其关联的角色.
     *
     * @param pmsOperator
     *            .
     * @param OperatorRoleStr
     *            .
     */
    public void saveOperator(PmsOperator pmsOperator, String OperatorRoleStr) {
        // 保存操作员信息
        pmsOperatorDao.insert(pmsOperator);
        // 保存角色关联信息
        if (StringUtils.isNotBlank(OperatorRoleStr) && OperatorRoleStr.length() > 0) {
            saveOrUpdateOperatorRole(pmsOperator.getId(), OperatorRoleStr);
        }
    }

    /**
     * 根据角色ID查询用户
     *
     * @param roleId
     * @return
     */
    public List<PmsOperator> listOperatorByRoleId(Long roleId) {
        return pmsOperatorDao.listByRoleId(roleId);
    }

    /**
     * 修改操作員信息及其关联的角色.
     *
     * @param pmsOperator
     *            .
     * @param OperatorRoleStr
     *            .
     */
    public void updateOperator(PmsOperator pmsOperator, String OperatorRoleStr) {
        pmsOperatorDao.updateByPrimaryKeySelective(pmsOperator);
        // 更新角色信息
        saveOrUpdateOperatorRole(pmsOperator.getId(), OperatorRoleStr);
    }

    /**
     * 保存用户和角色之间的关联关系
     */
    private void saveOrUpdateOperatorRole(Long operatorId, String roleIdsStr) {
        // 删除原来的角色与操作员关联
        PmsRoleOperatorExample example = new PmsRoleOperatorExample();
        PmsRoleOperatorExample.Criteria criteria = example.createCriteria();
        criteria.andOperator_idEqualTo(operatorId);
        List<PmsRoleOperator> listPmsOperatorRoles = pmsOperatorRoleDao.selectByExample(example);
        Map<Long, PmsRoleOperator> delMap = new HashMap<Long, PmsRoleOperator>();
        for (PmsRoleOperator pmsOperatorRole : listPmsOperatorRoles) {
            delMap.put(pmsOperatorRole.getRole_id(), pmsOperatorRole);
        }
        if (StringUtils.isNotBlank(roleIdsStr)) {
            // 创建新的关联
            String[] roleIds = roleIdsStr.split(",");
            for (int i = 0; i < roleIds.length; i++) {
                Long roleId = Long.valueOf(roleIds[i]);
                if (delMap.get(roleId) == null) {
                    PmsRoleOperator pmsOperatorRole = new PmsRoleOperator();
                    pmsOperatorRole.setOperator_id(operatorId);
                    pmsOperatorRole.setRole_id(roleId);
                    pmsOperatorRoleDao.insert(pmsOperatorRole);
                } else {
                    delMap.remove(roleId);
                }
            }
        }

        Iterator<Long> iterator = delMap.keySet().iterator();
        while (iterator.hasNext()) {
            Long roleId = iterator.next();
            PmsRoleOperatorExample example1 = new PmsRoleOperatorExample();
            PmsRoleOperatorExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andRole_idEqualTo(roleId);
            criteria.andOperator_idEqualTo(operatorId);
            pmsOperatorRoleDao.deleteByExample(example1);
        }
    }

}
