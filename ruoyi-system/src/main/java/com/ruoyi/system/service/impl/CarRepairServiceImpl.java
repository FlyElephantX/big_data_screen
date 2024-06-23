package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CarRepairMapper;
import com.ruoyi.system.domain.CarRepair;
import com.ruoyi.system.service.ICarRepairService;

/**
 * 修车数Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
@Service
public class CarRepairServiceImpl implements ICarRepairService 
{
    @Autowired
    private CarRepairMapper carRepairMapper;

    /**
     * 查询修车数
     * 
     * @param repairId 修车数主键
     * @return 修车数
     */
    @Override
    public CarRepair selectCarRepairByRepairId(Long repairId)
    {
        return carRepairMapper.selectCarRepairByRepairId(repairId);
    }

    /**
     * 查询修车数列表
     * 
     * @param carRepair 修车数
     * @return 修车数
     */
    @Override
    public List<CarRepair> selectCarRepairList(CarRepair carRepair)
    {
        return carRepairMapper.selectCarRepairList(carRepair);
    }

    /**
     * 新增修车数
     * 
     * @param carRepair 修车数
     * @return 结果
     */
    @Override
    public int insertCarRepair(CarRepair carRepair)
    {
        carRepair.setCreateTime(DateUtils.getNowDate());
        return carRepairMapper.insertCarRepair(carRepair);
    }

    /**
     * 修改修车数
     * 
     * @param carRepair 修车数
     * @return 结果
     */
    @Override
    public int updateCarRepair(CarRepair carRepair)
    {
        carRepair.setUpdateTime(DateUtils.getNowDate());
        return carRepairMapper.updateCarRepair(carRepair);
    }

    /**
     * 批量删除修车数
     * 
     * @param repairIds 需要删除的修车数主键
     * @return 结果
     */
    @Override
    public int deleteCarRepairByRepairIds(Long[] repairIds)
    {
        return carRepairMapper.deleteCarRepairByRepairIds(repairIds);
    }

    /**
     * 删除修车数信息
     * 
     * @param repairId 修车数主键
     * @return 结果
     */
    @Override
    public int deleteCarRepairByRepairId(Long repairId)
    {
        return carRepairMapper.deleteCarRepairByRepairId(repairId);
    }
}
