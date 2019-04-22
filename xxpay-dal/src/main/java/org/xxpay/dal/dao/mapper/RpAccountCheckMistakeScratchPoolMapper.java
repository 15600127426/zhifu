package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.reconciliation.entity.RpAccountCheckMistakeScratchPool;
import org.xxpay.dal.dao.reconciliation.entity.RpAccountCheckMistakeScratchPoolExample;

public interface RpAccountCheckMistakeScratchPoolMapper {
    int countByExample(RpAccountCheckMistakeScratchPoolExample example);

    int deleteByExample(RpAccountCheckMistakeScratchPoolExample example);

    int insert(RpAccountCheckMistakeScratchPool record);

    int insertSelective(RpAccountCheckMistakeScratchPool record);

    List<RpAccountCheckMistakeScratchPool> selectByExample(RpAccountCheckMistakeScratchPoolExample example);

    int updateByExampleSelective(@Param("record") RpAccountCheckMistakeScratchPool record, @Param("example") RpAccountCheckMistakeScratchPoolExample example);

    int updateByExample(@Param("record") RpAccountCheckMistakeScratchPool record, @Param("example") RpAccountCheckMistakeScratchPoolExample example);
}