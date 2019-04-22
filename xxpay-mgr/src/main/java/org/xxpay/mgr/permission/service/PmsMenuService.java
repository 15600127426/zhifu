package org.xxpay.mgr.permission.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xxpay.dal.dao.mapper.PmsMenuMapper;
import org.xxpay.dal.dao.mapper.PmsMenuRoleMapper;
import org.xxpay.dal.dao.model.PmsMenu;
import org.xxpay.dal.dao.model.PmsMenuExample;
import org.xxpay.dal.dao.model.PmsMenuRole;
import org.xxpay.dal.dao.model.PmsMenuRoleExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
@Component
public class PmsMenuService {
    @Autowired
    private PmsMenuMapper pmsMenuDao;
    @Autowired
    private PmsMenuRoleMapper pmsMenuRoleDao;

    /**
     * 保存菜单PmsMenuDao
     *
     * @param menu
     */
    public void savaMenu(PmsMenu menu) {
        pmsMenuDao.insert(menu);
    }

    /**
     * 根据父菜单ID获取该菜单下的所有子孙菜单.<br/>
     *
     * @param parentId
     *            (如果为空，则为获取所有的菜单).<br/>
     * @return menuList.
     */
    @SuppressWarnings("rawtypes")
    public List getListByParent(Long parentId) {

        return pmsMenuDao.listByParent(parentId);
    }

    /**
     * 根据id删除菜单
     */
    public void delete(Long id) {
        this.pmsMenuDao.deleteByPrimaryKey(id);
    }

    /**
     * 根据角色id串获取菜单
     *
     * @param roleIdsStr
     * @return
     */
    @SuppressWarnings("rawtypes")
    public List listByRoleIds(String roleIdsStr) {
        List<String> roldIds = Arrays.asList(roleIdsStr.split(","));
        return this.pmsMenuDao.listByRoleIds(roldIds);
    }

    /**
     * 根据菜单ID查找菜单（可用于判断菜单下是否还有子菜单）.
     *
     * @param parentId
     *            .
     * @return menuList.
     */
    public List<PmsMenu> listByParentId(Long parentId) {
        PmsMenuExample example = new PmsMenuExample();
        PmsMenuExample.Criteria criteria = example.createCriteria();
        criteria.andParent_idEqualTo(parentId);
        return pmsMenuDao.selectByExample(example);
    }

    /***
     * 根据名称和是否叶子节点查询数据
     *
     * @param isLeaf
     *            是否是叶子节点
     * @param name
     *            节点名称
     * @return
     */
    public List<PmsMenu> getMenuByNameAndIsLeaf(Map<String, Object> map) {
        String isLeaf = map.get("isLeaf").toString();
        String name = map.get("name").toString();
        PmsMenuExample example = new PmsMenuExample();
        PmsMenuExample.Criteria criteria = example.createCriteria();
        criteria.andIs_leafEqualTo(isLeaf);
        criteria.andNameEqualTo(name);
        return pmsMenuDao.selectByExample(example);
    }

    /**
     * 根据菜单ID获取菜单.
     *
     * @param pid
     * @return
     */
    public PmsMenu getById(Long pid) {
        return pmsMenuDao.selectByPrimaryKey(pid);
    }

    /**
     * 更新菜单.
     *
     * @param menu
     */
    public void update(PmsMenu menu) {
        pmsMenuDao.updateByPrimaryKeySelective(menu);

    }

    /**
     * 根据角色查找角色对应的菜单ID集
     *
     * @param roleId
     * @return
     */
    public String getMenuIdsByRoleId(Long roleId) {
        PmsMenuRoleExample example = new PmsMenuRoleExample();
        PmsMenuRoleExample.Criteria criteria = example.createCriteria();
        criteria.andRole_idEqualTo(roleId);
        List<PmsMenuRole> menuList = pmsMenuRoleDao.selectByExample(example);
        StringBuffer menuIds = new StringBuffer("");
        if (menuList != null && !menuList.isEmpty()) {
            for (PmsMenuRole rm : menuList) {
                menuIds.append(rm.getMenu_id()).append(",");
            }
        }
        return menuIds.toString();

    }
}
