package cn.ssm.mapper;

import cn.ssm.po.WsnRfidphy;
import cn.ssm.po.WsnRfidphyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsnRfidphyMapper {
    int countByExample(WsnRfidphyExample example);

    int deleteByExample(WsnRfidphyExample example);

    int deleteByPrimaryKey(Integer unidrfidphy);

    int insert(WsnRfidphy record);

    int insertSelective(WsnRfidphy record);

    List<WsnRfidphy> selectByExample(WsnRfidphyExample example);

    WsnRfidphy selectByPrimaryKey(Integer unidrfidphy);

    int updateByExampleSelective(@Param("record") WsnRfidphy record, @Param("example") WsnRfidphyExample example);

    int updateByExample(@Param("record") WsnRfidphy record, @Param("example") WsnRfidphyExample example);

    int updateByPrimaryKeySelective(WsnRfidphy record);

    int updateByPrimaryKey(WsnRfidphy record);
}