package org.xxpay.mgr.permission.service;

import com.alibaba.druid.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.xxpay.dal.dao.mapper.PmsPermissionMapper;
import org.xxpay.dal.dao.mapper.PmsRolePermissionMapper;
import org.xxpay.dal.dao.model.*;

import java.util.*;

@Component
public class PmsRolePermissionService {

    @Autowired
    private PmsRolePermissionMapper pmsRolePermissionDao;

    @Autowired
    private PmsPermissionMapper pmsPermissionDao;
    @Autowired
    private PmsOperatorRoleService pmsOperatorRoleService;

    /**
     * 根据操作员ID，获取所有的功能权限集
     *
     * @param operatorId
     */
    public Set<String> getPermissionsByOperatorId(Long operatorId) {
        // 根据操作员Id查询出关联的所有角色id
        String roleIds = pmsOperatorRoleService.getRoleIdsByOperatorId(operatorId);

        String permissionIds = getActionIdsByRoleIds(roleIds);
        Set<String> permissionSet = new HashSet<String>();

        // 根据角色ID字符串得到该用户的所有权限拼成的字符串
        if (!StringUtils.isEmpty(permissionIds)) {
            List<String> ids =Arrays.asList(permissionIds.split(","));
            List<PmsPermission> permissions = pmsPermissionDao.findByIds(ids);
            for (PmsPermission permission : permissions) {
                permissionSet.add(permission.getPermission());
            }
        }
        return permissionSet;
    }

    /**
     * 根据角色ID集得到所有权限ID集
     *
     * @param roleIds
     * @return actionIds
     */
    private String getActionIdsByRoleIds(String roleIds) {
        // 得到角色－权限表中roleiId在ids中的所有关联对象
        List<String> roldIdsList = Arrays.asList(roleIds.split(","));
        List<PmsRolePermission> listRolePermission = pmsRolePermissionDao.listByRoleIds(roldIdsList); // 构建StringBuffer
        StringBuffer actionIdsBuf = new StringBuffer("");
        // 拼接字符串
        for (PmsRolePermission pmsRolePermission : listRolePermission) {
            actionIdsBuf.append(pmsRolePermission.getPermission_id()).append(",");
        }
        String actionIds = actionIdsBuf.toString();
        // 截取字符串
        if (StringUtils.isEmpty(actionIds) && actionIds.length() > 0) {
            actionIds = actionIds.substring(0, actionIds.length() - 1); // 去掉最后一个逗号
        }
        return actionIds;
    }

    // /////////////////////////////下面：基本操作方法///////////////////////////////////////////////

    /**
     * 创建pmsOperator
     */
    public void saveData(PmsRolePermission pmsRolePermission) {
        pmsRolePermissionDao.insert(pmsRolePermission);
    }

    /**
     * 修改pmsOperator
     */
    public void updateData(PmsRolePermission pmsRolePermission) {
        pmsRolePermissionDao.updateByPrimaryKeySelective(pmsRolePermission);
    }

    /**
     * 根据id获取数据pmsOperator
     *
     * @param id
     * @return
     */
    public PmsRolePermission getDataById(Long id) {
        return pmsRolePermissionDao.selectByPrimaryKey(id);

    }

    /**
     * 分页查询pmsOperator
     *
     * @param pageParam
     * @param ActivityVo PmsOperator
     * @return
     */
    public List<PmsRolePermission> listPage(int limit, int offset, PmsRolePermission pmsRolePermission) {
        PmsRolePermissionExample example =new PmsRolePermissionExample();
        example.setLimit(limit);
        example.setOffset(offset);
        example.setOrderByClause("create_time DESC");
        PmsRolePermissionExample.Criteria criteria =example.createCriteria();
        setCriteria(criteria,pmsRolePermission);
        Map<String, Object> paramMap = new HashMap<String, Object>();
        return pmsRolePermissionDao.selectByExample(example);
    }

    /**
     * 保存角色和权限之间的关联关系
     */
    @Transactional(rollbackFor = Exception.class)
    public void saveRolePermission(Long roleId, String rolePermissionStr) {
        // 删除原来的角色与权限关联
        PmsRolePermissionExample example =new PmsRolePermissionExample();
        PmsRolePermissionExample.Criteria criteria =example.createCriteria();
        criteria.andRole_idEqualTo(roleId);
        pmsRolePermissionDao.selectByExample(example);
        if (!StringUtils.isEmpty(rolePermissionStr)) {
            // 创建新的关联
            String[] permissionIds = rolePermissionStr.split(",");
            for (int i = 0; i < permissionIds.length; i++) {
                Long permissionId = Long.valueOf(permissionIds[i]);
                PmsRolePermission item = new PmsRolePermission();
                item.setPermission_id(permissionId);
                item.setRole_id(roleId);
                pmsRolePermissionDao.insert(item);
            }
        }
    }
    void setCriteria(PmsRolePermissionExample.Criteria criteria, PmsRolePermission pmsRolePermission) {
        if(pmsRolePermission != null) {
            if(org.apache.commons.lang3.StringUtils.isNotBlank(pmsRolePermission.getCreate_time().toString())) criteria.andCreate_timeEqualTo(pmsRolePermission.getCreate_time());
            if(org.apache.commons.lang3.StringUtils.isNotBlank(pmsRolePermission.getRole_id().toString())) criteria.andRole_idEqualTo(pmsRolePermission.getRole_id());
            if(org.apache.commons.lang3.StringUtils.isNotBlank(pmsRolePermission.getEdit_time().toString())) criteria.andEdit_timeEqualTo(pmsRolePermission.getEdit_time());
            if(org.apache.commons.lang3.StringUtils.isNotBlank(pmsRolePermission.getPermission_id().toString())) criteria.andPermission_idEqualTo(pmsRolePermission.getPermission_id());
            if(org.apache.commons.lang3.StringUtils.isNotBlank(pmsRolePermission.getEditor())) criteria.andEditorEqualTo(pmsRolePermission.getEditor());
            if(org.apache.commons.lang3.StringUtils.isNotBlank(pmsRolePermission.getCreater())) criteria.andCreaterEqualTo(pmsRolePermission.getCreater());
            if(org.apache.commons.lang3.StringUtils.isNotBlank(pmsRolePermission.getId().toString())) criteria.andIdEqualTo(pmsRolePermission.getId());
            if(pmsRolePermission.getStatus() != null ) criteria.andStatusEqualTo(pmsRolePermission.getStatus());
        }
    }
}