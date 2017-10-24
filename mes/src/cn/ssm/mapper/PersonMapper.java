package cn.ssm.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.ssm.po.Person;
import cn.ssm.po.PersonExample;

public interface PersonMapper {
    int countByExample(PersonExample example);

    int deleteByExample(PersonExample example);

    int deleteByPrimaryKey(Integer personuid);

    int insert(Person person);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonExample example);

    Person selectByPrimaryKey(Integer personuid);

    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    
    Person selectByLoginidAndPassword(Map<String,String> map);
    
    Person selectByLoginId(String loginid);
    
    Person selectByEmail(String email);
    
    void insertPerson(Map<String,String> map);
    
    ArrayList<Person> selectByPro(String pro);
}