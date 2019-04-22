package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.account.entity.RpAccount;
import org.xxpay.dal.dao.account.entity.RpAccountExample;

public interface RpAccountMapper {
    int countByExample(RpAccountExample example);

    int deleteByExample(RpAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpAccount record);

    int insertSelective(RpAccount record);

    List<RpAccount> selectByExample(RpAccountExample example);

    RpAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpAccount record, @Param("example") RpAccountExample example);

    int updateByExample(@Param("record") RpAccount record, @Param("example") RpAccountExample example);

    int updateByPrimaryKeySelective(RpAccount record);

    int updateByPrimaryKey(RpAccount record);
}