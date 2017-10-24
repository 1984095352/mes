package cn.ssm.mapper;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.ssm.po.Addplan_3Assetnum;

public interface AddPlanMapper {
	
	String selectAssetnum(String pro);
	String selectDes(String devnum);
	ArrayList<Addplan_3Assetnum> selectAdd3(String pro);
	String selectPistdNum(@Param(value="PIPROFESSION")String PIPROFESSION,@Param(value="DEVICENUM")String DEVICENUM);
	void insertPirecord(Map<String,String> map);
 
}