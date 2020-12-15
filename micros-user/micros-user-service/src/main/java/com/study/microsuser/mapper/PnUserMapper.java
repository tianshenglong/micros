package com.study.microsuser.mapper;

import com.study.microsuser.model.PnUser;
import com.study.microsuser.model.PnUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PnUserMapper {
    int countByExample(PnUserExample example);

    int deleteByExample(PnUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PnUser record);

    int insertSelective(PnUser record);

    List<PnUser> selectByExample(PnUserExample example);

    PnUser selectByPrimaryKey(@Param("id") Integer id);

    int updateByExampleSelective(@Param("record") PnUser record, @Param("example") PnUserExample example);

    int updateByExample(@Param("record") PnUser record, @Param("example") PnUserExample example);

    int updateByPrimaryKeySelective(PnUser record);

    int updateByPrimaryKey(PnUser record);
}