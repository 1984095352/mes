package cn.ssm.service;

import java.util.ArrayList;
import java.util.Map;

import cn.ssm.po.Addplan_3Assetnum;
import cn.ssm.po.Person;

public interface AddPlanService {
	ArrayList<Addplan_3Assetnum> selectAdd3(String pro);
	String selectPistdNum(String PIPROFESSION,String DEVICENUM);
	void insertPirecord(Map<String,String> map);
	Person selectByLoginId(String loginid);
	ArrayList<Person> selectByPro(String pro);
}
