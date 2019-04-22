package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.model.PmsRole;
import org.xxpay.dal.dao.model.PmsRoleExample;

public interface PmsRoleMapper {
    int countByExample(PmsRoleExample example);

    int deleteByExample(PmsRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsRole record);

    int insertSelective(PmsRole record);

    List<PmsRole> selectByExample(PmsRoleExample example);

    PmsRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsRole record, @Param("example") PmsRoleExample example);

    int updateByExample(@Param("record") PmsRole record, @Param("example") PmsRoleExample example);

    int updateByPrimaryKeySelective(PmsRole record);

    int updateByPrimaryKey(PmsRole record);
    List<PmsRole> listByPermissionId(Long permissionId);
}