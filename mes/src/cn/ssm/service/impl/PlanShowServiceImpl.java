package cn.ssm.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.mapper.PirecordMapper;
import cn.ssm.po.PlandevshowRecord;
import cn.ssm.po.Plandevshowperson;
import cn.ssm.service.PlanShowService;
@Service
public class PlanShowServiceImpl implements PlanShowService {
	@Autowired
	private PirecordMapper pirecordMapper;

	@Override
	public ArrayList<Plandevshowperson> selectCplanPerson() {
		
		return pirecordMapper.selectPlanPerson();
	}

	@Override
	public ArrayList<PlandevshowRecord> selectAllPlanRecord(String STARTDATE,
			String ENDDATE) {
		
		return pirecordMapper.selectAllPlanRecord(STARTDATE, ENDDATE);
	}

	@Override
	public ArrayList<PlandevshowRecord> selectPlanRecord(String STARTDATE,
			String ENDDATE, String EXECUTEBY1) {
		
		return pirecordMapper.selectPlanRecord(STARTDATE, ENDDATE, EXECUTEBY1);
	}


}
