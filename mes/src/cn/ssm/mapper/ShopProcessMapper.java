package cn.ssm.mapper;

import org.apache.ibatis.annotations.Param;

import cn.ssm.po.ShopProcess;

public interface ShopProcessMapper {
    int deleteByPrimaryKey(Integer processId);

    int insert(ShopProcess record);

    int insertSelective(ShopProcess record);

    ShopProcess selectByPrimaryKey(Integer processId);

    int updateByPrimaryKeySelective(ShopProcess record);

    int updateByPrimaryKey(ShopProcess record);
    
    String selectProcess(@Param("materialNo")String materialNo, @Param("shopName")String shopName);
}