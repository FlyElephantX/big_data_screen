package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BrakeValveMapper;
import com.ruoyi.system.domain.BrakeValve;
import com.ruoyi.system.service.IBrakeValveService;

/**
 * 制动阀Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
@Service
public class BrakeValveServiceImpl implements IBrakeValveService 
{
    @Autowired
    private BrakeValveMapper brakeValveMapper;

    /**
     * 查询制动阀
     * 
     * @param brakeId 制动阀主键
     * @return 制动阀
     */
    @Override
    public BrakeValve selectBrakeValveByBrakeId(Long brakeId)
    {
        return brakeValveMapper.selectBrakeValveByBrakeId(brakeId);
    }

    /**
     * 查询制动阀列表
     * 
     * @param brakeValve 制动阀
     * @return 制动阀
     */
    @Override
    public List<BrakeValve> selectBrakeValveList(BrakeValve brakeValve)
    {
        return brakeValveMapper.selectBrakeValveList(brakeValve);
    }

    /**
     * 新增制动阀
     * 
     * @param brakeValve 制动阀
     * @return 结果
     */
    @Override
    public int insertBrakeValve(BrakeValve brakeValve)
    {
        brakeValve.setCreateTime(DateUtils.getNowDate());
        return brakeValveMapper.insertBrakeValve(brakeValve);
    }

    /**
     * 修改制动阀
     * 
     * @param brakeValve 制动阀
     * @return 结果
     */
    @Override
    public int updateBrakeValve(BrakeValve brakeValve)
    {
        brakeValve.setUpdateTime(DateUtils.getNowDate());
        return brakeValveMapper.updateBrakeValve(brakeValve);
    }

    /**
     * 批量删除制动阀
     * 
     * @param brakeIds 需要删除的制动阀主键
     * @return 结果
     */
    @Override
    public int deleteBrakeValveByBrakeIds(Long[] brakeIds)
    {
        return brakeValveMapper.deleteBrakeValveByBrakeIds(brakeIds);
    }

    /**
     * 删除制动阀信息
     * 
     * @param brakeId 制动阀主键
     * @return 结果
     */
    @Override
    public int deleteBrakeValveByBrakeId(Long brakeId)
    {
        return brakeValveMapper.deleteBrakeValveByBrakeId(brakeId);
    }
}
