package cn.ssm.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.ssm.po.Cstdline;
import cn.ssm.po.Pistd2;
import cn.ssm.po.PistdAssetnumDetail;
import cn.ssm.po.Pistdasset2;
import cn.ssm.po.Pistdline3;

public interface PistdAssetnumDetailService {
	public ArrayList<Pistdasset2> selectPistdasset( )throws Exception ;
	public ArrayList<Pistdasset2> selectPistdasset2( String dev )throws Exception ;
	public String selectdesByAss( String assetnum )throws Exception ;
	public ArrayList<Pistd2> selectpistd2( String pistdnum )throws Exception ;
	public ArrayList<Pistdasset2> selectPistdassetByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize )throws Exception ;
	public ArrayList<Pistdasset2> selectPistdasset2ByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="dev") String dev )throws Exception ;
	public int selectCount()throws Exception ;
	public int selectCount2(String dev)throws Exception ;
	public List<Pistdline3> selectByPistdnum(String stdnum);
	
	
	public ArrayList<PistdAssetnumDetail> selectCpistd( )throws Exception ;
	public ArrayList<PistdAssetnumDetail> selectCpistdBydev( String dev )throws Exception ;
	public List<Cstdline> selectCstdline(String stdnum);
}
