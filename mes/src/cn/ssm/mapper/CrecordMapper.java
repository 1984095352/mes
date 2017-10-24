package cn.ssm.mapper;

import java.util.ArrayList;

import cn.ssm.po.Abnormal;
import cn.ssm.po.Crecord;
import cn.ssm.po.CrecordAssetnum;
import cn.ssm.po.Crecordline;
import cn.ssm.po.DevDodate;

public interface CrecordMapper {
	ArrayList<CrecordAssetnum> selectCrecordAseet();
	ArrayList<Crecord> selectCrecord(DevDodate devdodate);
	ArrayList<Crecord> selectAllCrecord(DevDodate devdodate);
	ArrayList<Crecordline> selectCrecordline(String CPLANNUM,String ASSETNUM);
	ArrayList<Abnormal> selectAbnormal();
	ArrayList<Abnormal> selectAbnormalByTime(String STARTDATE,String ENDDATE);
}