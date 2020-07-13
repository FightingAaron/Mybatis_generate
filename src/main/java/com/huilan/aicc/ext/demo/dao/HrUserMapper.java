package com.huilan.aicc.ext.demo.dao;

import com.huilan.aicc.ext.demo.entity.HrUser;
import com.huilan.aicc.ext.demo.entity.HrUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HrUserMapper {
    long countByExample(HrUserExample example);

    int deleteByExample(HrUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HrUser record);

    int insertSelective(HrUser record);

    List<HrUser> selectByExample(HrUserExample example);

    HrUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HrUser record, @Param("example") HrUserExample example);

    int updateByExample(@Param("record") HrUser record, @Param("example") HrUserExample example);

    int updateByPrimaryKeySelective(HrUser record);

    int updateByPrimaryKey(HrUser record);
}