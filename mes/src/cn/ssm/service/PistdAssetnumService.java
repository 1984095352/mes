package cn.ssm.service;

import java.util.ArrayList;

import cn.ssm.po.PistdAssetnum;

public interface PistdAssetnumService {
	public ArrayList<PistdAssetnum> getAllPistdAssetnum()throws Exception;
	public ArrayList<PistdAssetnum> getAllCpistdAssetnum()throws Exception;
}
