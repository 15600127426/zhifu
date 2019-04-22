package org.xxpay.mgr.permission.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xxpay.dal.dao.mapper.PmsPermissionMapper;
import org.xxpay.dal.dao.mapper.PmsRolePermissionMapper;
import org.xxpay.dal.dao.model.PmsPermission;
import org.xxpay.dal.dao.model.PmsPermissionExample;
import org.xxpay.dal.dao.model.PmsRolePermission;
import org.xxpay.dal.dao.model.PmsRolePermissionExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PmsPermissionService {
    @Autowired
    private PmsPermissionMapper pmsPermissionDao;
    @Autowired
    private PmsRolePermissionMapper pmsRolePermissionDao;

    /**
     * 创建pmsOperator
     */
    public void saveData(PmsPermission pmsPermission) {
        pmsPermissionDao.insert(pmsPermission);
    }

    /**
     * 修改pmsOperator
     */
    public void updateData(PmsPermission pmsPermission) {

        pmsPermissionDao.updateByPrimaryKeySelective(pmsPermission);
    }

    /**
     * 根据id获取数据pmsOperator
     *
     * @param id
     * @return
     */
    public PmsPermission getDataById(Long id) {
        return pmsPermissionDao.selectByPrimaryKey(id);

    }

    /**
     * 分页查询pmsOperator
     *
     * @param pageParam
     * @param ActivityVo PmsOperator
     * @return
     */
    public List<PmsPermission> listPage(int limit, int offset, PmsPermission pmsPermission) {
        PmsPermissionExample example =new PmsPermissionExample();
        PmsPermissionExample.Criteria criteria = example.createCriteria();
        criteria.andPermission_nameLike( pmsPermission.getPermission_name());
        criteria.andPermissionEqualTo(pmsPermission.getPermission());
        example.setLimit(limit);
        example.setOffset(offset);
        /*Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("permissionName", pmsPermission.getPermission_name()); // 权限名称（模糊查询）
        paramMap.put("permission", pmsPermission.getPermission()); // 权限（精确查询）*/
        return pmsPermissionDao.selectByExample(example);
    }

    /**
     * 检查权限名称是否已存在
     *
     * @param trim
     * @return
     */
    public PmsPermission getByPermissionName(String permissionName) {
        PmsPermissionExample example =new PmsPermissionExample();
        PmsPermissionExample.Criteria criteria =example.createCriteria();
        criteria.andPermission_nameEqualTo(permissionName);
        return pmsPermissionDao.selectByExample(example).get(0);
    }

    /**
     * 检查权限是否已存在
     *
     * @param permission
     * @return
     */
    public PmsPermission getByPermission(String permission) {
        PmsPermissionExample example =new PmsPermissionExample();
        PmsPermissionExample.Criteria criteria =example.createCriteria();
        criteria.andPermissionEqualTo(permission);
        return pmsPermissionDao.selectByExample(example).get(0);
    }

    /**
     * 检查权限名称是否已存在(其他id)
     *
     * @param permissionName
     * @param id
     * @return
     */
    public PmsPermission getByPermissionNameNotEqId(String permissionName, Long id) {
        return pmsPermissionDao.getByPermissionNameNotEqId(permissionName, id);
    }

    /**
     * pmsPermissionDao 删除
     *
     * @param permission
     */
    public void delete(Long permissionId) {
        pmsPermissionDao.deleteByPrimaryKey(permissionId);
    }

    /**
     * 根据角色查找角色对应的功能权限ID集
     *
     * @param roleId
     * @return
     */
    public String getPermissionIdsByRoleId(Long roleId) {
        PmsRolePermissionExample example =new PmsRolePermissionExample();
        PmsRolePermissionExample.Criteria criteria =example.createCriteria();
        criteria.andRole_idEqualTo(roleId);
        List<PmsRolePermission> rmList = pmsRolePermissionDao.selectByExample(example);
        StringBuffer actionIds = new StringBuffer();
        if (rmList != null && !rmList.isEmpty()) {
            for (PmsRolePermission rm : rmList) {
                actionIds.append(rm.getPermission_id()).append(",");
            }
        }
        return actionIds.toString();
    }

    /**
     * 查询所有的权限
     */
    public List<PmsPermission> listAll() {
        PmsPermissionExample example =new PmsPermissionExample();

        return pmsPermissionDao.selectByExample(example);
    }

}
