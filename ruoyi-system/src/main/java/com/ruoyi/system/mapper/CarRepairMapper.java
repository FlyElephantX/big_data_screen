package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.CarRepair;

/**
 * 修车数Mapper接口
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
public interface CarRepairMapper 
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
     * 删除修车数
     * 
     * @param repairId 修车数主键
     * @return 结果
     */
    public int deleteCarRepairByRepairId(Long repairId);

    /**
     * 批量删除修车数
     * 
     * @param repairIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCarRepairByRepairIds(Long[] repairIds);
}
