package cn.ssm.mapper;

import java.util.ArrayList;

import cn.ssm.po.PistdAssetnum;

public interface PistdAssetnumMapper {
	public ArrayList<PistdAssetnum> getAllPistdAssetnum()throws Exception;
	public ArrayList<PistdAssetnum> getAllCpistdAssetnum()throws Exception;
}
