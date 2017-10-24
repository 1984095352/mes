package cn.ssm.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.mapper.CplanMapper;
import cn.ssm.po.CplandevshowRecord;
import cn.ssm.po.Plandevshowperson;
import cn.ssm.service.CplanShowService;
@Service
public class CplanShowServiceImpl implements CplanShowService {
	@Autowired
	private CplanMapper cplanMapper;
	@Override
	public ArrayList<Plandevshowperson> selectCplanPerson() {
		
		return cplanMapper.selectCplanPerson();
	}

	@Override
	public ArrayList<CplandevshowRecord> selectAllCplanRecord(String STARTDATE,
			String ENDDATE) {
		
		return cplanMapper.selectAllCplanRecord(STARTDATE, ENDDATE);
	}

	@Override
	public ArrayList<CplandevshowRecord> selectCplanRecord(String STARTDATE,
			String ENDDATE, String EXECUTEBY1) {
		
		return cplanMapper.selectCplanRecord(STARTDATE, ENDDATE, EXECUTEBY1);
	}

}
