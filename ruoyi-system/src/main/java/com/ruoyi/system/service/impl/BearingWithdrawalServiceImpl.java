package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BearingWithdrawalMapper;
import com.ruoyi.system.domain.BearingWithdrawal;
import com.ruoyi.system.service.IBearingWithdrawalService;

/**
 * 轴承退卸Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
@Service
public class BearingWithdrawalServiceImpl implements IBearingWithdrawalService 
{
    @Autowired
    private BearingWithdrawalMapper bearingWithdrawalMapper;

    /**
     * 查询轴承退卸
     * 
     * @param bearingId 轴承退卸主键
     * @return 轴承退卸
     */
    @Override
    public BearingWithdrawal selectBearingWithdrawalByBearingId(Long bearingId)
    {
        return bearingWithdrawalMapper.selectBearingWithdrawalByBearingId(bearingId);
    }

    /**
     * 查询轴承退卸列表
     * 
     * @param bearingWithdrawal 轴承退卸
     * @return 轴承退卸
     */
    @Override
    public List<BearingWithdrawal> selectBearingWithdrawalList(BearingWithdrawal bearingWithdrawal)
    {
        return bearingWithdrawalMapper.selectBearingWithdrawalList(bearingWithdrawal);
    }

    /**
     * 新增轴承退卸
     * 
     * @param bearingWithdrawal 轴承退卸
     * @return 结果
     */
    @Override
    public int insertBearingWithdrawal(BearingWithdrawal bearingWithdrawal)
    {
        bearingWithdrawal.setCreateTime(DateUtils.getNowDate());
        return bearingWithdrawalMapper.insertBearingWithdrawal(bearingWithdrawal);
    }

    /**
     * 修改轴承退卸
     * 
     * @param bearingWithdrawal 轴承退卸
     * @return 结果
     */
    @Override
    public int updateBearingWithdrawal(BearingWithdrawal bearingWithdrawal)
    {
        bearingWithdrawal.setUpdateTime(DateUtils.getNowDate());
        return bearingWithdrawalMapper.updateBearingWithdrawal(bearingWithdrawal);
    }

    /**
     * 批量删除轴承退卸
     * 
     * @param bearingIds 需要删除的轴承退卸主键
     * @return 结果
     */
    @Override
    public int deleteBearingWithdrawalByBearingIds(Long[] bearingIds)
    {
        return bearingWithdrawalMapper.deleteBearingWithdrawalByBearingIds(bearingIds);
    }

    /**
     * 删除轴承退卸信息
     * 
     * @param bearingId 轴承退卸主键
     * @return 结果
     */
    @Override
    public int deleteBearingWithdrawalByBearingId(Long bearingId)
    {
        return bearingWithdrawalMapper.deleteBearingWithdrawalByBearingId(bearingId);
    }
}
