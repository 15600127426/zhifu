package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.reconciliation.entity.RpAccountCheck_mistake;
import org.xxpay.dal.dao.reconciliation.entity.RpAccountCheck_mistakeExample;

public interface RpAccountCheck_mistakeMapper {
    int countByExample(RpAccountCheck_mistakeExample example);

    int deleteByExample(RpAccountCheck_mistakeExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpAccountCheck_mistake record);

    int insertSelective(RpAccountCheck_mistake record);

    List<RpAccountCheck_mistake> selectByExample(RpAccountCheck_mistakeExample example);

    RpAccountCheck_mistake selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpAccountCheck_mistake record, @Param("example") RpAccountCheck_mistakeExample example);

    int updateByExample(@Param("record") RpAccountCheck_mistake record, @Param("example") RpAccountCheck_mistakeExample example);

    int updateByPrimaryKeySelective(RpAccountCheck_mistake record);

    int updateByPrimaryKey(RpAccountCheck_mistake record);
}