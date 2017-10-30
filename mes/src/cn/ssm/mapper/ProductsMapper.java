package cn.ssm.mapper;

import cn.ssm.po.Products;

public interface ProductsMapper {
    int deleteByPrimaryKey(Integer productsId);

    int insert(Products record);

    int insertSelective(Products record);

    Products selectByPrimaryKey(Integer productsId);

    int updateByPrimaryKeySelective(Products record);

    int updateByPrimaryKey(Products record);
}