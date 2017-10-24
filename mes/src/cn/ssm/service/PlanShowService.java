package cn.ssm.service;

import java.util.ArrayList;

import cn.ssm.po.PlandevshowRecord;
import cn.ssm.po.Plandevshowperson;

public interface PlanShowService {
		ArrayList<Plandevshowperson> selectCplanPerson();
	    
	    ArrayList<PlandevshowRecord> selectAllPlanRecord(String STARTDATE,String ENDDATE);
	    
	    ArrayList<PlandevshowRecord> selectPlanRecord(String STARTDATE,String ENDDATE,String EXECUTEBY1);
}
