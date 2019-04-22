package org.xxpay.mgr.permission.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xxpay.dal.dao.mapper.PmsRoleMapper;
import org.xxpay.dal.dao.model.PmsRole;
import org.xxpay.dal.dao.model.PmsRoleExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PmsRoleService {
    @Autowired
    private PmsRoleMapper pmsRoleDao;

    /**
     * 创建pmsOperator
     */
    public void saveData(PmsRole pmsRole) {
        pmsRoleDao.insert(pmsRole);
    }

    /**
     * 修改pmsOperator
     */
    public void updateData(PmsRole pmsRole) {
        pmsRoleDao.updateByPrimaryKeySelective(pmsRole);
    }

    /**
     * 根据id获取数据pmsOperator
     *
     * @param id
     * @return
     */
    public PmsRole getDataById(Long id) {
        return pmsRoleDao.selectByPrimaryKey(id);

    }

    /**
     * 分页查询pmsOperator
     *
     * @param pageParam
     * @param ActivityVo
     *            PmsOperator
     * @return
     */
    public PageBean listPage(PageParam pageParam, PmsRole pmsRole) {
        Map<String, Object> paramMap = new HashMap<String, Object>(); // 业务条件查询参数
        paramMap.put("roleName", pmsRole.getRoleName()); // 角色名称（模糊查询）
        return pmsRoleDao.listPage(pageParam, paramMap);
    }

    /**
     * 获取所有角色列表，以供添加操作员时选择.
     *
     * @return roleList .
     */
    public List<PmsRole> listAllRole() {
        PmsRoleExample example =new PmsRoleExample();
        return pmsRoleDao.selectByExample(example);
    }

    /**
     * 判断此权限是否关联有角色
     *
     * @param permissionId
     * @return
     */
    public List<PmsRole> listByPermissionId(Long permissionId) {
        return pmsRoleDao.listByPermissionId(permissionId);
    }

    /**
     * 根据角色名或者角色编号查询角色
     *
     * @param roleName
     * @param roleCode
     * @return
     */
    public PmsRole getByRoleNameOrRoleCode(String roleName, String roleCode) {
        PmsRoleExample example = new PmsRoleExample();
        PmsRoleExample.Criteria criteria =example.createCriteria();
        criteria.andRole_nameEqualTo(roleName);
        criteria.andRole_codeEqualTo(roleCode);
        return pmsRoleDao.selectByExample(example).get(0);
    }

    /**
     * 删除
     *
     * @param roleId
     */
    public void delete(Long roleId) {
        pmsRoleDao.deleteByPrimaryKey(roleId);
    }
}