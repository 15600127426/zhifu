package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.model.PmsMenu;
import org.xxpay.dal.dao.model.PmsMenuExample;

public interface PmsMenuMapper {
    int countByExample(PmsMenuExample example);

    int deleteByExample(PmsMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsMenu record);

    int insertSelective(PmsMenu record);

    List<PmsMenu> selectByExample(PmsMenuExample example);

    PmsMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsMenu record, @Param("example") PmsMenuExample example);

    int updateByExample(@Param("record") PmsMenu record, @Param("example") PmsMenuExample example);

    int updateByPrimaryKeySelective(PmsMenu record);

    int updateByPrimaryKey(PmsMenu record);
    List listByRoleIds(List<String> roleIds);
    List listByParent(Long parent);
}