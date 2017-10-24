package cn.ssm.service;

import java.util.ArrayList;

import cn.ssm.po.CplandevshowRecord;
import cn.ssm.po.Plandevshowperson;

public interface CplanShowService {
		ArrayList<Plandevshowperson> selectCplanPerson();
	    
	    ArrayList<CplandevshowRecord> selectAllCplanRecord(String STARTDATE,String ENDDATE);
	    
	    ArrayList<CplandevshowRecord> selectCplanRecord(String STARTDATE,String ENDDATE,String EXECUTEBY1);
}
