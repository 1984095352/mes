package cn.ssm.mapper;

import java.util.List;

import cn.ssm.po.Person;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer personId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer personId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    
    List<String> selectPersonNames();
}