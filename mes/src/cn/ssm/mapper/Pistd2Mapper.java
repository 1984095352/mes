package cn.ssm.mapper;

import cn.ssm.po.Pistd2;
import cn.ssm.po.Pistd2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Pistd2Mapper {
    int countByExample(Pistd2Example example);

    int deleteByExample(Pistd2Example example);

    int deleteByPrimaryKey(Long pistdid);

    int insert(Pistd2 record);

    int insertSelective(Pistd2 record);

    List<Pistd2> selectByExample(Pistd2Example example);

    Pistd2 selectByPrimaryKey(Long pistdid);

    int updateByExampleSelective(@Param("record") Pistd2 record, @Param("example") Pistd2Example example);

    int updateByExample(@Param("record") Pistd2 record, @Param("example") Pistd2Example example);

    int updateByPrimaryKeySelective(Pistd2 record);

    int updateByPrimaryKey(Pistd2 record);
    
   
}