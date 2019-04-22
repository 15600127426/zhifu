package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.model.PmsMenuRole;
import org.xxpay.dal.dao.model.PmsMenuRoleExample;

public interface PmsMenuRoleMapper {
    int countByExample(PmsMenuRoleExample example);

    int deleteByExample(PmsMenuRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsMenuRole record);

    int insertSelective(PmsMenuRole record);

    List<PmsMenuRole> selectByExample(PmsMenuRoleExample example);

    PmsMenuRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsMenuRole record, @Param("example") PmsMenuRoleExample example);

    int updateByExample(@Param("record") PmsMenuRole record, @Param("example") PmsMenuRoleExample example);

    int updateByPrimaryKeySelective(PmsMenuRole record);

    int updateByPrimaryKey(PmsMenuRole record);
}