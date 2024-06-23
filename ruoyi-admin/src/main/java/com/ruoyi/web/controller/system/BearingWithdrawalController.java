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
import com.ruoyi.system.domain.BearingWithdrawal;
import com.ruoyi.system.service.IBearingWithdrawalService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 轴承退卸Controller
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
@RestController
@RequestMapping("/system/withdrawal")
public class BearingWithdrawalController extends BaseController
{
    @Autowired
    private IBearingWithdrawalService bearingWithdrawalService;

    /**
     * 查询轴承退卸列表
     */
    @PreAuthorize("@ss.hasPermi('system:withdrawal:list')")
    @GetMapping("/list")
    public TableDataInfo list(BearingWithdrawal bearingWithdrawal)
    {
        startPage();
        List<BearingWithdrawal> list = bearingWithdrawalService.selectBearingWithdrawalList(bearingWithdrawal);
        return getDataTable(list);
    }

    /**
     * 导出轴承退卸列表
     */
    @PreAuthorize("@ss.hasPermi('system:withdrawal:export')")
    @Log(title = "轴承退卸", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BearingWithdrawal bearingWithdrawal)
    {
        List<BearingWithdrawal> list = bearingWithdrawalService.selectBearingWithdrawalList(bearingWithdrawal);
        ExcelUtil<BearingWithdrawal> util = new ExcelUtil<BearingWithdrawal>(BearingWithdrawal.class);
        util.exportExcel(response, list, "轴承退卸数据");
    }

    /**
     * 获取轴承退卸详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:withdrawal:query')")
    @GetMapping(value = "/{bearingId}")
    public AjaxResult getInfo(@PathVariable("bearingId") Long bearingId)
    {
        return success(bearingWithdrawalService.selectBearingWithdrawalByBearingId(bearingId));
    }

    /**
     * 新增轴承退卸
     */
    @PreAuthorize("@ss.hasPermi('system:withdrawal:add')")
    @Log(title = "轴承退卸", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BearingWithdrawal bearingWithdrawal)
    {
        return toAjax(bearingWithdrawalService.insertBearingWithdrawal(bearingWithdrawal));
    }

    /**
     * 修改轴承退卸
     */
    @PreAuthorize("@ss.hasPermi('system:withdrawal:edit')")
    @Log(title = "轴承退卸", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BearingWithdrawal bearingWithdrawal)
    {
        return toAjax(bearingWithdrawalService.updateBearingWithdrawal(bearingWithdrawal));
    }

    /**
     * 删除轴承退卸
     */
    @PreAuthorize("@ss.hasPermi('system:withdrawal:remove')")
    @Log(title = "轴承退卸", businessType = BusinessType.DELETE)
	@DeleteMapping("/{bearingIds}")
    public AjaxResult remove(@PathVariable Long[] bearingIds)
    {
        return toAjax(bearingWithdrawalService.deleteBearingWithdrawalByBearingIds(bearingIds));
    }
}
