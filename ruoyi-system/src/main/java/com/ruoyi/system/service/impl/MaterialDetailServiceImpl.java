package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MaterialDetailMapper;
import com.ruoyi.system.domain.MaterialDetail;
import com.ruoyi.system.service.IMaterialDetailService;

/**
 * 物资明细Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
@Service
public class MaterialDetailServiceImpl implements IMaterialDetailService 
{
    @Autowired
    private MaterialDetailMapper materialDetailMapper;

    /**
     * 查询物资明细
     * 
     * @param materialId 物资明细主键
     * @return 物资明细
     */
    @Override
    public MaterialDetail selectMaterialDetailByMaterialId(Long materialId)
    {
        return materialDetailMapper.selectMaterialDetailByMaterialId(materialId);
    }

    /**
     * 查询物资明细列表
     * 
     * @param materialDetail 物资明细
     * @return 物资明细
     */
    @Override
    public List<MaterialDetail> selectMaterialDetailList(MaterialDetail materialDetail)
    {
        return materialDetailMapper.selectMaterialDetailList(materialDetail);
    }

    /**
     * 新增物资明细
     * 
     * @param materialDetail 物资明细
     * @return 结果
     */
    @Override
    public int insertMaterialDetail(MaterialDetail materialDetail)
    {
        materialDetail.setCreateTime(DateUtils.getNowDate());
        return materialDetailMapper.insertMaterialDetail(materialDetail);
    }

    /**
     * 修改物资明细
     * 
     * @param materialDetail 物资明细
     * @return 结果
     */
    @Override
    public int updateMaterialDetail(MaterialDetail materialDetail)
    {
        materialDetail.setUpdateTime(DateUtils.getNowDate());
        return materialDetailMapper.updateMaterialDetail(materialDetail);
    }

    /**
     * 批量删除物资明细
     * 
     * @param materialIds 需要删除的物资明细主键
     * @return 结果
     */
    @Override
    public int deleteMaterialDetailByMaterialIds(Long[] materialIds)
    {
        return materialDetailMapper.deleteMaterialDetailByMaterialIds(materialIds);
    }

    /**
     * 删除物资明细信息
     * 
     * @param materialId 物资明细主键
     * @return 结果
     */
    @Override
    public int deleteMaterialDetailByMaterialId(Long materialId)
    {
        return materialDetailMapper.deleteMaterialDetailByMaterialId(materialId);
    }
}
