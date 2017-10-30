package cn.ssm.mapper;

import cn.ssm.po.StandardValues;

public interface StandardValuesMapper {
    int deleteByPrimaryKey(Integer valId);

    int insert(StandardValues record);

    int insertSelective(StandardValues record);

    StandardValues selectByPrimaryKey(Integer valId);

    int updateByPrimaryKeySelective(StandardValues record);

    int updateByPrimaryKey(StandardValues record);
}