package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.model.RpUserBankAccount;
import org.xxpay.dal.dao.model.RpUserBankAccountExample;

public interface RpUserBankAccountMapper {
    int countByExample(RpUserBankAccountExample example);

    int deleteByExample(RpUserBankAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpUserBankAccount record);

    int insertSelective(RpUserBankAccount record);

    List<RpUserBankAccount> selectByExample(RpUserBankAccountExample example);

    RpUserBankAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpUserBankAccount record, @Param("example") RpUserBankAccountExample example);

    int updateByExample(@Param("record") RpUserBankAccount record, @Param("example") RpUserBankAccountExample example);

    int updateByPrimaryKeySelective(RpUserBankAccount record);

    int updateByPrimaryKey(RpUserBankAccount record);
}