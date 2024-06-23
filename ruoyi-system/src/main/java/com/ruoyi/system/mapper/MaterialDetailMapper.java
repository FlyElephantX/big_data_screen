package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.MaterialDetail;

/**
 * 物资明细Mapper接口
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
public interface MaterialDetailMapper 
{
    /**
     * 查询物资明细
     * 
     * @param materialId 物资明细主键
     * @return 物资明细
     */
    public MaterialDetail selectMaterialDetailByMaterialId(Long materialId);

    /**
     * 查询物资明细列表
     * 
     * @param materialDetail 物资明细
     * @return 物资明细集合
     */
    public List<MaterialDetail> selectMaterialDetailList(MaterialDetail materialDetail);

    /**
     * 新增物资明细
     * 
     * @param materialDetail 物资明细
     * @return 结果
     */
    public int insertMaterialDetail(MaterialDetail materialDetail);

    /**
     * 修改物资明细
     * 
     * @param materialDetail 物资明细
     * @return 结果
     */
    public int updateMaterialDetail(MaterialDetail materialDetail);

    /**
     * 删除物资明细
     * 
     * @param materialId 物资明细主键
     * @return 结果
     */
    public int deleteMaterialDetailByMaterialId(Long materialId);

    /**
     * 批量删除物资明细
     * 
     * @param materialIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMaterialDetailByMaterialIds(Long[] materialIds);
}
