package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BearingWithdrawal;

/**
 * 轴承退卸Mapper接口
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
public interface BearingWithdrawalMapper 
{
    /**
     * 查询轴承退卸
     * 
     * @param bearingId 轴承退卸主键
     * @return 轴承退卸
     */
    public BearingWithdrawal selectBearingWithdrawalByBearingId(Long bearingId);

    /**
     * 查询轴承退卸列表
     * 
     * @param bearingWithdrawal 轴承退卸
     * @return 轴承退卸集合
     */
    public List<BearingWithdrawal> selectBearingWithdrawalList(BearingWithdrawal bearingWithdrawal);

    /**
     * 新增轴承退卸
     * 
     * @param bearingWithdrawal 轴承退卸
     * @return 结果
     */
    public int insertBearingWithdrawal(BearingWithdrawal bearingWithdrawal);

    /**
     * 修改轴承退卸
     * 
     * @param bearingWithdrawal 轴承退卸
     * @return 结果
     */
    public int updateBearingWithdrawal(BearingWithdrawal bearingWithdrawal);

    /**
     * 删除轴承退卸
     * 
     * @param bearingId 轴承退卸主键
     * @return 结果
     */
    public int deleteBearingWithdrawalByBearingId(Long bearingId);

    /**
     * 批量删除轴承退卸
     * 
     * @param bearingIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBearingWithdrawalByBearingIds(Long[] bearingIds);
}
