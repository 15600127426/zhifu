package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.model.RpMicroSubmitRecord;
import org.xxpay.dal.dao.model.RpMicroSubmitRecordExample;

public interface RpMicroSubmitRecordMapper {
    int countByExample(RpMicroSubmitRecordExample example);

    int deleteByExample(RpMicroSubmitRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpMicroSubmitRecord record);

    int insertSelective(RpMicroSubmitRecord record);

    List<RpMicroSubmitRecord> selectByExample(RpMicroSubmitRecordExample example);

    RpMicroSubmitRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpMicroSubmitRecord record, @Param("example") RpMicroSubmitRecordExample example);

    int updateByExample(@Param("record") RpMicroSubmitRecord record, @Param("example") RpMicroSubmitRecordExample example);

    int updateByPrimaryKeySelective(RpMicroSubmitRecord record);

    int updateByPrimaryKey(RpMicroSubmitRecord record);
}