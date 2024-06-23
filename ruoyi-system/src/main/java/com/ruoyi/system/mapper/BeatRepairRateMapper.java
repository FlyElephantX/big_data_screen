package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BeatRepairRate;

/**
 * 节拍修兑现率Mapper接口
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
public interface BeatRepairRateMapper 
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
     * 删除节拍修兑现率
     * 
     * @param repairId 节拍修兑现率主键
     * @return 结果
     */
    public int deleteBeatRepairRateByRepairId(Long repairId);

    /**
     * 批量删除节拍修兑现率
     * 
     * @param repairIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBeatRepairRateByRepairIds(Long[] repairIds);
}
