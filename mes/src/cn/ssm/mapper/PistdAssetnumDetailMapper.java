package cn.ssm.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import cn.ssm.po.Pistd2;
import cn.ssm.po.PistdAssetnumDetail;
import cn.ssm.po.Pistdasset2;

public interface PistdAssetnumDetailMapper {
	ArrayList<Pistdasset2> selectPistdasset( )throws Exception ;
	ArrayList<Pistdasset2> selectPistdasset2( String dev )throws Exception ;
	String selectdesByAss( String assetnum )throws Exception ;
	ArrayList<Pistd2> selectpistd2( String pistdnum )throws Exception ;
	ArrayList<Pistdasset2> selectPistdassetByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize )throws Exception ;
	ArrayList<Pistdasset2> selectPistdasset2ByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize, @Param(value="dev")String dev )throws Exception ;
	int selectCount()throws Exception ;
	int selectCount2(String dev)throws Exception ;
	
	/*ArrayList<Cstdasset> selectCpistdasset( )throws Exception ;
	ArrayList<Cstdasset> selectCpistdasset2( String dev )throws Exception ;
	String selectCpistdesByAss( String assetnum )throws Exception ;
	ArrayList<Cstd> selectCpistd2( String pistdnum )throws Exception ;
	ArrayList<Cstdasset> selectCpistdassetByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize )throws Exception ;
	ArrayList<Cstdasset> selectCpistdasset2ByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize, @Param(value="dev")String dev )throws Exception ;
	int selectCpCount()throws Exception ;
	int selectCpCount2(String dev)throws Exception ;*/
	
	ArrayList<PistdAssetnumDetail> selectCpistd( )throws Exception ;
	ArrayList<PistdAssetnumDetail> selectCpistdBydev( String dev )throws Exception ;
}
