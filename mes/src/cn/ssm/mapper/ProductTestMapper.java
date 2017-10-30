package cn.ssm.mapper;

import cn.ssm.po.ProductTest;

public interface ProductTestMapper {
    int deleteByPrimaryKey(Integer testId);

    int insert(ProductTest record);

    int insertSelective(ProductTest record);

    ProductTest selectByPrimaryKey(Integer testId);

    int updateByPrimaryKeySelective(ProductTest record);

    int updateByPrimaryKey(ProductTest record);
}