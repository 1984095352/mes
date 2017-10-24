package cn.ssm.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.mapper.CrecordMapper;
import cn.ssm.po.Abnormal;
import cn.ssm.po.Crecord;
import cn.ssm.po.CrecordAssetnum;
import cn.ssm.po.Crecordline;
import cn.ssm.po.DevDodate;
import cn.ssm.service.CrecordService;
@Service
public class CrecordServiceImpl implements CrecordService {
	@Autowired
	private CrecordMapper crecordMapper;
	@Override
	public ArrayList<CrecordAssetnum> selectCrecordAseet() {
		
		return crecordMapper.selectCrecordAseet();
	}

	@Override
	public ArrayList<Crecord> selectCrecord(DevDodate devdodate) {
		
		return crecordMapper.selectCrecord(devdodate);
	}

	@Override
	public ArrayList<Crecord> selectAllCrecord(DevDodate devdodate) {
		
		return crecordMapper.selectAllCrecord(devdodate);
	}

	@Override
	public ArrayList<Crecordline> selectCrecordline(String CPLANNUM,
			String ASSETNUM) {
		
		return crecordMapper.selectCrecordline(CPLANNUM, ASSETNUM);
	}

	@Override
	public ArrayList<Abnormal> selectAbnormal() {
		
		return crecordMapper.selectAbnormal();
	}

	@Override
	public ArrayList<Abnormal> selectAbnormalByTime(String STARTDATE,
			String ENDDATE) {
		
		return crecordMapper.selectAbnormalByTime(STARTDATE, ENDDATE);
	}

}
