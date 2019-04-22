package org.xxpay.dal.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xxpay.dal.dao.model.RpUserInfo;
import org.xxpay.dal.dao.model.RpUserInfoExample;

public interface RpUserInfoMapper {
    int countByExample(RpUserInfoExample example);

    int deleteByExample(RpUserInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpUserInfo record);

    int insertSelective(RpUserInfo record);

    List<RpUserInfo> selectByExample(RpUserInfoExample example);

    RpUserInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpUserInfo record, @Param("example") RpUserInfoExample example);

    int updateByExample(@Param("record") RpUserInfo record, @Param("example") RpUserInfoExample example);

    int updateByPrimaryKeySelective(RpUserInfo record);

    int updateByPrimaryKey(RpUserInfo record);
}