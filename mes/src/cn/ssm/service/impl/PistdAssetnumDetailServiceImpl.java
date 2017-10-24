package cn.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.mapper.CstdlineMapper;
import cn.ssm.mapper.PistdAssetnumDetailMapper;
import cn.ssm.mapper.Pistdline3Mapper;
import cn.ssm.po.Cstdline;
import cn.ssm.po.Pistd2;
import cn.ssm.po.PistdAssetnumDetail;
import cn.ssm.po.Pistdasset2;
import cn.ssm.po.Pistdline3;
import cn.ssm.service.PistdAssetnumDetailService;
@Service
public class PistdAssetnumDetailServiceImpl implements PistdAssetnumDetailService{
	@Autowired
	private PistdAssetnumDetailMapper pistdAssetnumDetailMapper;
	@Autowired
	private Pistdline3Mapper pistdline3Mapper;
	@Autowired
	private CstdlineMapper cstdlineMapper;
	@Override
	public ArrayList<Pistdasset2> selectPistdasset() throws Exception {
		
		return pistdAssetnumDetailMapper.selectPistdasset();
	}
	@Override
	public ArrayList<Pistdasset2> selectPistdasset2(String dev)
			throws Exception {
		
		return pistdAssetnumDetailMapper.selectPistdasset2(dev);
	}
	@Override
	public String selectdesByAss(String assetnum) throws Exception {
		
		return pistdAssetnumDetailMapper.selectdesByAss(assetnum);
	}
	@Override
	public ArrayList<Pistd2> selectpistd2(String pistdnum) throws Exception {
		
		return pistdAssetnumDetailMapper.selectpistd2(pistdnum);
	}
	@Override
	public ArrayList<Pistdasset2> selectPistdassetByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize) throws Exception {
		
		return pistdAssetnumDetailMapper.selectPistdassetByPage(startPos, pageSize);
	}
	@Override
	public ArrayList<Pistdasset2> selectPistdasset2ByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="dev") String dev)
			throws Exception {
		
		return pistdAssetnumDetailMapper.selectPistdasset2ByPage(startPos, pageSize,dev);
	}
	@Override
	public int selectCount() throws Exception {
		
		return pistdAssetnumDetailMapper.selectCount();
	}
	@Override
	public int selectCount2(String dev) throws Exception {
		
		return pistdAssetnumDetailMapper.selectCount2(dev);
	}
	@Override
	public List<Pistdline3> selectByPistdnum(String stdnum) {
		
		return pistdline3Mapper.selectByPistdnum(stdnum);
	}
	
	@Override
	public ArrayList<PistdAssetnumDetail> selectCpistd()
			throws Exception {
		// TODO Auto-generated method stub
		return pistdAssetnumDetailMapper.selectCpistd();
	}
	@Override
	public ArrayList<PistdAssetnumDetail> selectCpistdBydev(String dev)
			throws Exception {
		// TODO Auto-generated method stub
		return pistdAssetnumDetailMapper.selectCpistdBydev(dev);
	}
	@Override
	public List<Cstdline> selectCstdline(String stdnum) {
		// TODO Auto-generated method stub
		return cstdlineMapper.selectCstdline(stdnum);
	}
}
