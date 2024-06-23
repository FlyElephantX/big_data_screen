package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CarRepair;

/**
 * 修车数Service接口
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
public interface ICarRepairService 
{
    /**
     * 查询修车数
     * 
     * @param repairId 修车数主键
     * @return 修车数
     */
    public CarRepair selectCarRepairByRepairId(Long repairId);

    /**
     * 查询修车数列表
     * 
     * @param carRepair 修车数
     * @return 修车数集合
     */
    public List<CarRepair> selectCarRepairList(CarRepair carRepair);

    /**
     * 新增修车数
     * 
     * @param carRepair 修车数
     * @return 结果
     */
    public int insertCarRepair(CarRepair carRepair);

    /**
     * 修改修车数
     * 
     * @param carRepair 修车数
     * @return 结果
     */
    public int updateCarRepair(CarRepair carRepair);

    /**
     * 批量删除修车数
     * 
     * @param repairIds 需要删除的修车数主键集合
     * @return 结果
     */
    public int deleteCarRepairByRepairIds(Long[] repairIds);

    /**
     * 删除修车数信息
     * 
     * @param repairId 修车数主键
     * @return 结果
     */
    public int deleteCarRepairByRepairId(Long repairId);
}
