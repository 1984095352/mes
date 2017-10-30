package cn.ssm.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.mapper.AssetMapper;
import cn.ssm.mapper.PersonMapper;
import cn.ssm.mapper.ShopPlanMapper;
import cn.ssm.mapper.ShopProcessMapper;
import cn.ssm.mapper.TaskMapper;
import cn.ssm.po.ShopPlan;
import cn.ssm.po.Task;
import cn.ssm.service.ShopPlanService;
@Service
public class ShopPlanServiceImpl implements ShopPlanService {
	@Autowired
	private ShopPlanMapper shopPlanMapper;
	@Autowired
	private TaskMapper taskMapper;
	@Autowired
	private PersonMapper personMapper;
	@Autowired
	private AssetMapper assetMapper;
	@Autowired
	private ShopProcessMapper shopProcessMapper;
	@Override
	public void insertShopPlan(ShopPlan shopPlan,String processSort) {
		if(shopPlan.getPlanId()==null){
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			String planDate = sf.format(new Date());
			shopPlan.setPlanDate(planDate);	
			shopPlan.setProcessSort(processSort);
			shopPlan.setIsNew(1);
			shopPlanMapper.insertSelective(shopPlan);
		}else{
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			String planDate = sf.format(new Date());
			shopPlan.setPlanDate(planDate);	
			shopPlan.setProcessSort(processSort);
			shopPlan.setIsNew(0);
			shopPlanMapper.updateByPrimaryKey(shopPlan);
			shopPlan.setIsNew(1);
			shopPlan.setPlanId(null);
			shopPlanMapper.insertSelective(shopPlan);
			
		}
		
	}

	@Override
	public ShopPlan selectByPrimaryKey(Integer planId) {
		if(planId!=null){
			ShopPlan shopPlan=	shopPlanMapper.selectByPrimaryKey(planId);
			return shopPlan;
		}else{
			return null;
		}
			
	}

	@Override
	public void insertTask(List<Task> listTask, Integer planId) {
		for(int i=0;i<listTask.size();i++){
			Task task=new Task();
			task=listTask.get(i);
			task.setPlanId(planId);
			taskMapper.insertSelective(task);
		}
	}

	@Override
	public List<ShopPlan> selectAllShopPlan() {
		List<ShopPlan> listShopPlan=shopPlanMapper.selectAllShopPlan();
		return listShopPlan;
	}

	@Override
	public List<ShopPlan> selectShopPlanByParam(String client,String chanpin,String chejian ) {
		List<ShopPlan> listShopPlan=shopPlanMapper.selectShopPlanByParam(client, chanpin, chejian);
		return listShopPlan;
	}
	
	@Override
	public List<Task> selectTaskByKey(Integer planId) {
		List<Task> listTask= new ArrayList<Task>();
		if(planId!=null){
			listTask=taskMapper.selectTaskByKey(planId);
			
		}else {
			Task task=new Task();
			task.setProcessName(" ");
			listTask.add(task);
		}
		return listTask;
	}

	@Override
	public List<String> selectPersonNames() {
		
		return personMapper.selectPersonNames();
	}

	@Override
	public List<String> selectAssetNames() {
		
		return assetMapper.selectAssetNames();
	}

	@Override
	public List<Task> selectTaskByParam(String materialNo, String shopName) {
		List<Task> listTask= new ArrayList<Task>();
		String process= shopProcessMapper.selectProcess(materialNo, shopName);
		String processArray[]=process.split(",");
		for(int i=0;i<processArray.length;i++){
			Task task=new Task();
			task.setProcessName(processArray[i]);
			listTask.add(task);
		}
		return listTask;
	}

}
