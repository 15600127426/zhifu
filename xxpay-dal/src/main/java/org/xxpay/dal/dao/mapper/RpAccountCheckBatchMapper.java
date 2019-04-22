package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.reconciliation.entity.RpAccountCheckBatch;
import org.xxpay.dal.dao.reconciliation.entity.RpAccountCheckBatchExample;

public interface RpAccountCheckBatchMapper {
    int countByExample(RpAccountCheckBatchExample example);

    int deleteByExample(RpAccountCheckBatchExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpAccountCheckBatch record);

    int insertSelective(RpAccountCheckBatch record);

    List<RpAccountCheckBatch> selectByExample(RpAccountCheckBatchExample example);

    RpAccountCheckBatch selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpAccountCheckBatch record, @Param("example") RpAccountCheckBatchExample example);

    int updateByExample(@Param("record") RpAccountCheckBatch record, @Param("example") RpAccountCheckBatchExample example);

    int updateByPrimaryKeySelective(RpAccountCheckBatch record);

    int updateByPrimaryKey(RpAccountCheckBatch record);
}