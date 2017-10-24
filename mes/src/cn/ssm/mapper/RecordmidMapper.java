package cn.ssm.mapper;

import cn.ssm.po.Recordmid;
import cn.ssm.po.RecordmidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordmidMapper {
    int countByExample(RecordmidExample example);

    int deleteByExample(RecordmidExample example);

    int deleteByPrimaryKey(Integer recordmidunid);

    int insert(Recordmid record);

    int insertSelective(Recordmid record);

    List<Recordmid> selectByExample(RecordmidExample example);

    Recordmid selectByPrimaryKey(Integer recordmidunid);

    int updateByExampleSelective(@Param("record") Recordmid record, @Param("example") RecordmidExample example);

    int updateByExample(@Param("record") Recordmid record, @Param("example") RecordmidExample example);

    int updateByPrimaryKeySelective(Recordmid record);

    int updateByPrimaryKey(Recordmid record);
}