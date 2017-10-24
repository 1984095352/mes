package cn.ssm.service.impl;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.mapper.AddPlanMapper;
import cn.ssm.mapper.PersonMapper;
import cn.ssm.po.Addplan_3Assetnum;
import cn.ssm.po.Person;
import cn.ssm.service.AddPlanService;
@Service
public class AddPlanServiceImpl implements AddPlanService {
	@Autowired 
	private PersonMapper personMapper;
	@Autowired 
	private AddPlanMapper addPlanMapper;
	@Override
	public ArrayList<Addplan_3Assetnum> selectAdd3(String pro) {
		
		return addPlanMapper.selectAdd3(pro);
	}

	@Override
	public String selectPistdNum(String PIPROFESSION, String DEVICENUM) {
		
		return addPlanMapper.selectPistdNum(PIPROFESSION, DEVICENUM);
	}

	@Override
	public void insertPirecord(Map<String, String> map) {
		addPlanMapper.insertPirecord(map);

	}

	@Override
	public Person selectByLoginId(String loginid) {
		
		return personMapper.selectByLoginId(loginid);
	}

	@Override
	public ArrayList<Person> selectByPro(String pro) {
		
		return personMapper.selectByPro(pro);
	}

}
