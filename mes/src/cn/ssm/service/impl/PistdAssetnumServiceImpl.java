package cn.ssm.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.mapper.PistdAssetnumMapper;
import cn.ssm.po.PistdAssetnum;
import cn.ssm.service.PistdAssetnumService;
@Service
public class PistdAssetnumServiceImpl implements PistdAssetnumService{
	@Autowired
	private PistdAssetnumMapper pistdAssetnumMapper;
	@Override
	public ArrayList<PistdAssetnum> getAllPistdAssetnum() throws Exception {
		
		return pistdAssetnumMapper.getAllPistdAssetnum();
	}
	@Override
	public ArrayList<PistdAssetnum> getAllCpistdAssetnum() throws Exception {
		
		return pistdAssetnumMapper.getAllCpistdAssetnum();
	}

}
