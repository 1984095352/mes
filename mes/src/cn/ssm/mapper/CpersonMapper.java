package cn.ssm.mapper;

import cn.ssm.po.Cperson;
import cn.ssm.po.CpersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CpersonMapper {
    int countByExample(CpersonExample example);

    int deleteByExample(CpersonExample example);

    int deleteByPrimaryKey(Integer personuid);

    int insert(Cperson record);

    int insertSelective(Cperson record);

    List<Cperson> selectByExample(CpersonExample example);

    Cperson selectByPrimaryKey(Integer personuid);

    int updateByExampleSelective(@Param("record") Cperson record, @Param("example") CpersonExample example);

    int updateByExample(@Param("record") Cperson record, @Param("example") CpersonExample example);

    int updateByPrimaryKeySelective(Cperson record);

    int updateByPrimaryKey(Cperson record);
}