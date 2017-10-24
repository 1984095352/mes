package cn.ssm.mapper;

import cn.ssm.po.Pirecord;
import cn.ssm.po.PirecordExample;
import cn.ssm.po.PlandevshowRecord;
import cn.ssm.po.Plandevshowperson;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PirecordMapper {
    int countByExample(PirecordExample example);

    int deleteByExample(PirecordExample example);

    int deleteByPrimaryKey(Long piplanid);

    int insert(Pirecord record);

    int insertSelective(Pirecord record);

    List<Pirecord> selectByExample(PirecordExample example);

    Pirecord selectByPrimaryKey(Long piplanid);

    int updateByExampleSelective(@Param("record") Pirecord record, @Param("example") PirecordExample example);

    int updateByExample(@Param("record") Pirecord record, @Param("example") PirecordExample example);

    int updateByPrimaryKeySelective(Pirecord record);

    int updateByPrimaryKey(Pirecord record);
    
    ArrayList<Plandevshowperson> selectPlanPerson();
    
    ArrayList<PlandevshowRecord> selectAllPlanRecord(String STARTDATE,String ENDDATE);
    
    ArrayList<PlandevshowRecord> selectPlanRecord(String STARTDATE,String ENDDATE,String EXECUTEBY1);
}