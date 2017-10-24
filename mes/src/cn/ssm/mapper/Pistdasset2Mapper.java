package cn.ssm.mapper;

import cn.ssm.po.Pistdasset2;
import cn.ssm.po.Pistdasset2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Pistdasset2Mapper {
    int countByExample(Pistdasset2Example example);

    int deleteByExample(Pistdasset2Example example);

    int deleteByPrimaryKey(Long pistdassetid);

    int insert(Pistdasset2 record);

    int insertSelective(Pistdasset2 record);

    List<Pistdasset2> selectByExample(Pistdasset2Example example);

    Pistdasset2 selectByPrimaryKey(Long pistdassetid);

    int updateByExampleSelective(@Param("record") Pistdasset2 record, @Param("example") Pistdasset2Example example);

    int updateByExample(@Param("record") Pistdasset2 record, @Param("example") Pistdasset2Example example);

    int updateByPrimaryKeySelective(Pistdasset2 record);

    int updateByPrimaryKey(Pistdasset2 record);
   
}