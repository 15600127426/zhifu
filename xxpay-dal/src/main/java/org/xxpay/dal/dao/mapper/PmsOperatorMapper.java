package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.model.PmsOperator;
import org.xxpay.dal.dao.model.PmsOperatorExample;

public interface PmsOperatorMapper {
    int countByExample(PmsOperatorExample example);

    int deleteByExample(PmsOperatorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsOperator record);

    int insertSelective(PmsOperator record);

    List<PmsOperator> selectByExample(PmsOperatorExample example);

    PmsOperator selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsOperator record, @Param("example") PmsOperatorExample example);

    int updateByExample(@Param("record") PmsOperator record, @Param("example") PmsOperatorExample example);

    int updateByPrimaryKeySelective(PmsOperator record);

    int updateByPrimaryKey(PmsOperator record);
    List<PmsOperator> listByRoleId(Long roleId);
}