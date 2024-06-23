package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.MaterialDetail;
import com.ruoyi.system.service.IMaterialDetailService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物资明细Controller
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
@RestController
@RequestMapping("/system/detail")
public class MaterialDetailController extends BaseController
{
    @Autowired
    private IMaterialDetailService materialDetailService;

    /**
     * 查询物资明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(MaterialDetail materialDetail)
    {
        startPage();
        List<MaterialDetail> list = materialDetailService.selectMaterialDetailList(materialDetail);
        return getDataTable(list);
    }

    /**
     * 导出物资明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:export')")
    @Log(title = "物资明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MaterialDetail materialDetail)
    {
        List<MaterialDetail> list = materialDetailService.selectMaterialDetailList(materialDetail);
        ExcelUtil<MaterialDetail> util = new ExcelUtil<MaterialDetail>(MaterialDetail.class);
        util.exportExcel(response, list, "物资明细数据");
    }

    /**
     * 获取物资明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:detail:query')")
    @GetMapping(value = "/{materialId}")
    public AjaxResult getInfo(@PathVariable("materialId") Long materialId)
    {
        return success(materialDetailService.selectMaterialDetailByMaterialId(materialId));
    }

    /**
     * 新增物资明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:add')")
    @Log(title = "物资明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MaterialDetail materialDetail)
    {
        return toAjax(materialDetailService.insertMaterialDetail(materialDetail));
    }

    /**
     * 修改物资明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:edit')")
    @Log(title = "物资明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MaterialDetail materialDetail)
    {
        return toAjax(materialDetailService.updateMaterialDetail(materialDetail));
    }

    /**
     * 删除物资明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:remove')")
    @Log(title = "物资明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{materialIds}")
    public AjaxResult remove(@PathVariable Long[] materialIds)
    {
        return toAjax(materialDetailService.deleteMaterialDetailByMaterialIds(materialIds));
    }
}
