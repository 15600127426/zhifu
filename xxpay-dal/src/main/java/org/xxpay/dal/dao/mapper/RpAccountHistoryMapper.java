package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.account.entity.RpAccountHistory;
import org.xxpay.dal.dao.account.entity.RpAccountHistoryExample;

public interface RpAccountHistoryMapper {
    int countByExample(RpAccountHistoryExample example);

    int deleteByExample(RpAccountHistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpAccountHistory record);

    int insertSelective(RpAccountHistory record);

    List<RpAccountHistory> selectByExample(RpAccountHistoryExample example);

    RpAccountHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpAccountHistory record, @Param("example") RpAccountHistoryExample example);

    int updateByExample(@Param("record") RpAccountHistory record, @Param("example") RpAccountHistoryExample example);

    int updateByPrimaryKeySelective(RpAccountHistory record);

    int updateByPrimaryKey(RpAccountHistory record);
}