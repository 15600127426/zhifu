package org.xxpay.mgr.permission.service;

import com.alibaba.druid.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.xxpay.dal.dao.mapper.PmsMenuRoleMapper;
import org.xxpay.dal.dao.model.PmsMenuRole;
import org.xxpay.dal.dao.model.PmsMenuRoleExample;

@Component
public class PmsMenuRoleService {
    @Autowired
    private PmsMenuRoleMapper pmsMenuRoleMapper;
    /**
     * 根据角色ID统计关联到此角色的菜单数.
     *
     * @param roleId
     *            角色ID.
     * @return count.
     */
    public int countMenuByRoleId(Long roleId){
        PmsMenuRoleExample example = new PmsMenuRoleExample();
        PmsMenuRoleExample.Criteria criteria = example.createCriteria();
        criteria.andRole_idEqualTo(roleId);
        return pmsMenuRoleMapper.countByExample(example);
    }

    /**
     * 根据角色id，删除该角色关联的所有菜单权限
     *
     * @param roleId
     */
    public void deleteByRoleId(Long roleId){
        PmsMenuRoleExample example = new PmsMenuRoleExample();
        PmsMenuRoleExample.Criteria criteria = example.createCriteria();
        criteria.andRole_idEqualTo(roleId);
        pmsMenuRoleMapper.deleteByExample(example);
    }

    @Transactional(rollbackFor = Exception.class)
    public void saveRoleMenu(Long roleId, String roleMenuStr){
        // 删除原来的角色与权限关联
        PmsMenuRoleExample example = new PmsMenuRoleExample();
        PmsMenuRoleExample.Criteria criteria = example.createCriteria();
        criteria.andRole_idEqualTo(roleId);
        pmsMenuRoleMapper.deleteByExample(example);
        if (!StringUtils.isEmpty(roleMenuStr)) {
            // 创建新的关联
            String[] menuIds = roleMenuStr.split(",");
            for (int i = 0; i < menuIds.length; i++) {
                Long menuId = Long.valueOf(menuIds[i]);
                PmsMenuRole item = new PmsMenuRole();
                item.setMenu_id(menuId);
                item.setRole_id(roleId);
                pmsMenuRoleMapper.insert(item);
            }
        }
    }
}

