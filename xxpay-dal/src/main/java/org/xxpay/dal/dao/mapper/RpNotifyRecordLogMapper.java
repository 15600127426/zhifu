package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.model.RpNotifyRecordLog;
import org.xxpay.dal.dao.model.RpNotifyRecordLogExample;

public interface RpNotifyRecordLogMapper {
    int countByExample(RpNotifyRecordLogExample example);

    int deleteByExample(RpNotifyRecordLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpNotifyRecordLog record);

    int insertSelective(RpNotifyRecordLog record);

    List<RpNotifyRecordLog> selectByExample(RpNotifyRecordLogExample example);

    RpNotifyRecordLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpNotifyRecordLog record, @Param("example") RpNotifyRecordLogExample example);

    int updateByExample(@Param("record") RpNotifyRecordLog record, @Param("example") RpNotifyRecordLogExample example);

    int updateByPrimaryKeySelective(RpNotifyRecordLog record);

    int updateByPrimaryKey(RpNotifyRecordLog record);
}