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
import com.ruoyi.system.domain.BeatRepairRate;
import com.ruoyi.system.service.IBeatRepairRateService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 节拍修兑现率Controller
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
@RestController
@RequestMapping("/system/beat")
public class BeatRepairRateController extends BaseController
{
    @Autowired
    private IBeatRepairRateService beatRepairRateService;

    /**
     * 查询节拍修兑现率列表
     */
    @PreAuthorize("@ss.hasPermi('system:rate:list')")
    @GetMapping("/list")
    public TableDataInfo list(BeatRepairRate beatRepairRate)
    {
        startPage();
        List<BeatRepairRate> list = beatRepairRateService.selectBeatRepairRateList(beatRepairRate);
        return getDataTable(list);
    }

    /**
     * 导出节拍修兑现率列表
     */
    @PreAuthorize("@ss.hasPermi('system:rate:export')")
    @Log(title = "节拍修兑现率", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BeatRepairRate beatRepairRate)
    {
        List<BeatRepairRate> list = beatRepairRateService.selectBeatRepairRateList(beatRepairRate);
        ExcelUtil<BeatRepairRate> util = new ExcelUtil<BeatRepairRate>(BeatRepairRate.class);
        util.exportExcel(response, list, "节拍修兑现率数据");
    }

    /**
     * 获取节拍修兑现率详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:rate:query')")
    @GetMapping(value = "/{repairId}")
    public AjaxResult getInfo(@PathVariable("repairId") Long repairId)
    {
        return success(beatRepairRateService.selectBeatRepairRateByRepairId(repairId));
    }

    /**
     * 新增节拍修兑现率
     */
    @PreAuthorize("@ss.hasPermi('system:rate:add')")
    @Log(title = "节拍修兑现率", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BeatRepairRate beatRepairRate)
    {
        return toAjax(beatRepairRateService.insertBeatRepairRate(beatRepairRate));
    }

    /**
     * 修改节拍修兑现率
     */
    @PreAuthorize("@ss.hasPermi('system:rate:edit')")
    @Log(title = "节拍修兑现率", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BeatRepairRate beatRepairRate)
    {
        return toAjax(beatRepairRateService.updateBeatRepairRate(beatRepairRate));
    }

    /**
     * 删除节拍修兑现率
     */
    @PreAuthorize("@ss.hasPermi('system:rate:remove')")
    @Log(title = "节拍修兑现率", businessType = BusinessType.DELETE)
	@DeleteMapping("/{repairIds}")
    public AjaxResult remove(@PathVariable Long[] repairIds)
    {
        return toAjax(beatRepairRateService.deleteBeatRepairRateByRepairIds(repairIds));
    }
}
