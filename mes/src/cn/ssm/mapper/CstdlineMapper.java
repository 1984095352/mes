package cn.ssm.mapper;

import cn.ssm.po.Cstdline;
import cn.ssm.po.CstdlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstdlineMapper {
    int countByExample(CstdlineExample example);

    int deleteByExample(CstdlineExample example);

    int deleteByPrimaryKey(Integer unid);

    int insert(Cstdline record);

    int insertSelective(Cstdline record);

    List<Cstdline> selectByExample(CstdlineExample example);

    Cstdline selectByPrimaryKey(Integer unid);

    int updateByExampleSelective(@Param("record") Cstdline record, @Param("example") CstdlineExample example);

    int updateByExample(@Param("record") Cstdline record, @Param("example") CstdlineExample example);

    int updateByPrimaryKeySelective(Cstdline record);

    int updateByPrimaryKey(Cstdline record);
    
    List<Cstdline> selectCstdline(String stdnum);
}