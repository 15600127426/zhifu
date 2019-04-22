package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.model.PmsRolePermission;
import org.xxpay.dal.dao.model.PmsRolePermissionExample;

public interface PmsRolePermissionMapper {
    int countByExample(PmsRolePermissionExample example);

    int deleteByExample(PmsRolePermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsRolePermission record);

    int insertSelective(PmsRolePermission record);

    List<PmsRolePermission> selectByExample(PmsRolePermissionExample example);

    PmsRolePermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsRolePermission record, @Param("example") PmsRolePermissionExample example);

    int updateByExample(@Param("record") PmsRolePermission record, @Param("example") PmsRolePermissionExample example);

    int updateByPrimaryKeySelective(PmsRolePermission record);

    int updateByPrimaryKey(PmsRolePermission record);
    List<PmsRolePermission> listByRoleIds(List<String> roleIds);
}