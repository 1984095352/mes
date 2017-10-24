package cn.ssm.mapper;

import cn.ssm.po.Cstdasset;
import cn.ssm.po.CstdassetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstdassetMapper {
    int countByExample(CstdassetExample example);

    int deleteByExample(CstdassetExample example);

    int deleteByPrimaryKey(Integer cstdassetid);

    int insert(Cstdasset record);

    int insertSelective(Cstdasset record);

    List<Cstdasset> selectByExample(CstdassetExample example);

    Cstdasset selectByPrimaryKey(Integer cstdassetid);

    int updateByExampleSelective(@Param("record") Cstdasset record, @Param("example") CstdassetExample example);

    int updateByExample(@Param("record") Cstdasset record, @Param("example") CstdassetExample example);

    int updateByPrimaryKeySelective(Cstdasset record);

    int updateByPrimaryKey(Cstdasset record);
}