package cn.ssm.mapper;

import cn.ssm.po.Cplan;
import cn.ssm.po.CplanExample;
import cn.ssm.po.CplandevshowRecord;
import cn.ssm.po.Plandevshowperson;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CplanMapper {
    int countByExample(CplanExample example);

    int deleteByExample(CplanExample example);

    int deleteByPrimaryKey(Integer unidcplan);

    int insert(Cplan record);

    int insertSelective(Cplan record);

    List<Cplan> selectByExample(CplanExample example);

    Cplan selectByPrimaryKey(Integer unidcplan);

    int updateByExampleSelective(@Param("record") Cplan record, @Param("example") CplanExample example);

    int updateByExample(@Param("record") Cplan record, @Param("example") CplanExample example);

    int updateByPrimaryKeySelective(Cplan record);

    int updateByPrimaryKey(Cplan record);
    
    ArrayList<Plandevshowperson> selectCplanPerson();
    
    ArrayList<CplandevshowRecord> selectAllCplanRecord(@Param("STARTDATE")String STARTDATE,@Param("ENDDATE")String ENDDATE);
    
    ArrayList<CplandevshowRecord> selectCplanRecord(@Param("STARTDATE")String STARTDATE,@Param("ENDDATE")String ENDDATE,@Param("EXECUTEBY1")String EXECUTEBY1);
}