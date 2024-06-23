package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BrakeValve;

/**
 * 制动阀Service接口
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
public interface IBrakeValveService 
{
    /**
     * 查询制动阀
     * 
     * @param brakeId 制动阀主键
     * @return 制动阀
     */
    public BrakeValve selectBrakeValveByBrakeId(Long brakeId);

    /**
     * 查询制动阀列表
     * 
     * @param brakeValve 制动阀
     * @return 制动阀集合
     */
    public List<BrakeValve> selectBrakeValveList(BrakeValve brakeValve);

    /**
     * 新增制动阀
     * 
     * @param brakeValve 制动阀
     * @return 结果
     */
    public int insertBrakeValve(BrakeValve brakeValve);

    /**
     * 修改制动阀
     * 
     * @param brakeValve 制动阀
     * @return 结果
     */
    public int updateBrakeValve(BrakeValve brakeValve);

    /**
     * 批量删除制动阀
     * 
     * @param brakeIds 需要删除的制动阀主键集合
     * @return 结果
     */
    public int deleteBrakeValveByBrakeIds(Long[] brakeIds);

    /**
     * 删除制动阀信息
     * 
     * @param brakeId 制动阀主键
     * @return 结果
     */
    public int deleteBrakeValveByBrakeId(Long brakeId);
}
