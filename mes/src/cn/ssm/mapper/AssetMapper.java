package cn.ssm.mapper;

import java.util.List;

import cn.ssm.po.Asset;

public interface AssetMapper {
    int deleteByPrimaryKey(Integer assetId);

    int insert(Asset record);

    int insertSelective(Asset record);

    Asset selectByPrimaryKey(Integer assetId);

    int updateByPrimaryKeySelective(Asset record);

    int updateByPrimaryKey(Asset record);
    
    List<String> selectAssetNames();
}