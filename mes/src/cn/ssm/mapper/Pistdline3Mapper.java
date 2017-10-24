package cn.ssm.mapper;

import cn.ssm.po.Pistdline3;
import cn.ssm.po.Pistdline3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Pistdline3Mapper {
    int countByExample(Pistdline3Example example);

    int deleteByExample(Pistdline3Example example);

    int deleteByPrimaryKey(Long pistdlineid);

    int insert(Pistdline3 record);

    int insertSelective(Pistdline3 record);

    List<Pistdline3> selectByExample(Pistdline3Example example);

    Pistdline3 selectByPrimaryKey(Long pistdlineid);

    int updateByExampleSelective(@Param("record") Pistdline3 record, @Param("example") Pistdline3Example example);

    int updateByExample(@Param("record") Pistdline3 record, @Param("example") Pistdline3Example example);

    int updateByPrimaryKeySelective(Pistdline3 record);

    int updateByPrimaryKey(Pistdline3 record);
    
    List<Pistdline3> selectByPistdnum(String stdnum);
}