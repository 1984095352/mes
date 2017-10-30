package cn.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.ssm.po.ShopPlan;

public interface ShopPlanMapper {
    int deleteByPrimaryKey(Integer planId);

    int insert(ShopPlan record);

    int insertSelective(ShopPlan record);

    ShopPlan selectByPrimaryKey(Integer planId);

    int updateByPrimaryKeySelective(ShopPlan record);

    int updateByPrimaryKey(ShopPlan record);
    
    List<ShopPlan> selectAllShopPlan();
    
    List<ShopPlan> selectShopPlanByParam(@Param("client")String client,@Param("chanpin")String chanpin,@Param("chejian")String chejian );
}