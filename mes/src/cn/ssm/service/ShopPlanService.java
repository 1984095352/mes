package cn.ssm.service;

import java.util.List;
import cn.ssm.po.ShopPlan;
import cn.ssm.po.Task;

public interface ShopPlanService {
	void insertShopPlan(ShopPlan shopPlan, String processSort);
	
	ShopPlan selectByPrimaryKey(Integer planId);
	
	void insertTask(List<Task> listTask, Integer planId);
	
	List<Task> selectTaskByKey(Integer planId);
	
	List<ShopPlan> selectAllShopPlan( );
	
	List<ShopPlan> selectShopPlanByParam(String client,String chanpin,String chejian );
	
	List<String> selectPersonNames();
	
	List<String> selectAssetNames();

	List<Task> selectTaskByParam(String materialNo, String shopName);
}
