package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BeatRepairRateMapper;
import com.ruoyi.system.domain.BeatRepairRate;
import com.ruoyi.system.service.IBeatRepairRateService;

/**
 * 节拍修兑现率Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
@Service
public class BeatRepairRateServiceImpl implements IBeatRepairRateService 
{
    @Autowired
    private BeatRepairRateMapper beatRepairRateMapper;

    /**
     * 查询节拍修兑现率
     * 
     * @param repairId 节拍修兑现率主键
     * @return 节拍修兑现率
     */
    @Override
    public BeatRepairRate selectBeatRepairRateByRepairId(Long repairId)
    {
        return beatRepairRateMapper.selectBeatRepairRateByRepairId(repairId);
    }

    /**
     * 查询节拍修兑现率列表
     * 
     * @param beatRepairRate 节拍修兑现率
     * @return 节拍修兑现率
     */
    @Override
    public List<BeatRepairRate> selectBeatRepairRateList(BeatRepairRate beatRepairRate)
    {
        return beatRepairRateMapper.selectBeatRepairRateList(beatRepairRate);
    }

    /**
     * 新增节拍修兑现率
     * 
     * @param beatRepairRate 节拍修兑现率
     * @return 结果
     */
    @Override
    public int insertBeatRepairRate(BeatRepairRate beatRepairRate)
    {
        beatRepairRate.setCreateTime(DateUtils.getNowDate());
        return beatRepairRateMapper.insertBeatRepairRate(beatRepairRate);
    }

    /**
     * 修改节拍修兑现率
     * 
     * @param beatRepairRate 节拍修兑现率
     * @return 结果
     */
    @Override
    public int updateBeatRepairRate(BeatRepairRate beatRepairRate)
    {
        beatRepairRate.setUpdateTime(DateUtils.getNowDate());
        return beatRepairRateMapper.updateBeatRepairRate(beatRepairRate);
    }

    /**
     * 批量删除节拍修兑现率
     * 
     * @param repairIds 需要删除的节拍修兑现率主键
     * @return 结果
     */
    @Override
    public int deleteBeatRepairRateByRepairIds(Long[] repairIds)
    {
        return beatRepairRateMapper.deleteBeatRepairRateByRepairIds(repairIds);
    }

    /**
     * 删除节拍修兑现率信息
     * 
     * @param repairId 节拍修兑现率主键
     * @return 结果
     */
    @Override
    public int deleteBeatRepairRateByRepairId(Long repairId)
    {
        return beatRepairRateMapper.deleteBeatRepairRateByRepairId(repairId);
    }
}
