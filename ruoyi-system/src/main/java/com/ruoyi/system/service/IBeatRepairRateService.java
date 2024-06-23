package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BeatRepairRate;

/**
 * 节拍修兑现率Service接口
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
public interface IBeatRepairRateService 
{
    /**
     * 查询节拍修兑现率
     * 
     * @param repairId 节拍修兑现率主键
     * @return 节拍修兑现率
     */
    public BeatRepairRate selectBeatRepairRateByRepairId(Long repairId);

    /**
     * 查询节拍修兑现率列表
     * 
     * @param beatRepairRate 节拍修兑现率
     * @return 节拍修兑现率集合
     */
    public List<BeatRepairRate> selectBeatRepairRateList(BeatRepairRate beatRepairRate);

    /**
     * 新增节拍修兑现率
     * 
     * @param beatRepairRate 节拍修兑现率
     * @return 结果
     */
    public int insertBeatRepairRate(BeatRepairRate beatRepairRate);

    /**
     * 修改节拍修兑现率
     * 
     * @param beatRepairRate 节拍修兑现率
     * @return 结果
     */
    public int updateBeatRepairRate(BeatRepairRate beatRepairRate);

    /**
     * 批量删除节拍修兑现率
     * 
     * @param repairIds 需要删除的节拍修兑现率主键集合
     * @return 结果
     */
    public int deleteBeatRepairRateByRepairIds(Long[] repairIds);

    /**
     * 删除节拍修兑现率信息
     * 
     * @param repairId 节拍修兑现率主键
     * @return 结果
     */
    public int deleteBeatRepairRateByRepairId(Long repairId);
}
