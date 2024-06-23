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
import com.ruoyi.system.domain.BrakeValve;
import com.ruoyi.system.service.IBrakeValveService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 制动阀Controller
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
@RestController
@RequestMapping("/system/valve")
public class BrakeValveController extends BaseController
{
    @Autowired
    private IBrakeValveService brakeValveService;

    /**
     * 查询制动阀列表
     */
    @PreAuthorize("@ss.hasPermi('system:valve:list')")
    @GetMapping("/list")
    public TableDataInfo list(BrakeValve brakeValve)
    {
        startPage();
        List<BrakeValve> list = brakeValveService.selectBrakeValveList(brakeValve);
        return getDataTable(list);
    }

    /**
     * 导出制动阀列表
     */
    @PreAuthorize("@ss.hasPermi('system:valve:export')")
    @Log(title = "制动阀", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BrakeValve brakeValve)
    {
        List<BrakeValve> list = brakeValveService.selectBrakeValveList(brakeValve);
        ExcelUtil<BrakeValve> util = new ExcelUtil<BrakeValve>(BrakeValve.class);
        util.exportExcel(response, list, "制动阀数据");
    }

    /**
     * 获取制动阀详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:valve:query')")
    @GetMapping(value = "/{brakeId}")
    public AjaxResult getInfo(@PathVariable("brakeId") Long brakeId)
    {
        return success(brakeValveService.selectBrakeValveByBrakeId(brakeId));
    }

    /**
     * 新增制动阀
     */
    @PreAuthorize("@ss.hasPermi('system:valve:add')")
    @Log(title = "制动阀", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BrakeValve brakeValve)
    {
        return toAjax(brakeValveService.insertBrakeValve(brakeValve));
    }

    /**
     * 修改制动阀
     */
    @PreAuthorize("@ss.hasPermi('system:valve:edit')")
    @Log(title = "制动阀", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BrakeValve brakeValve)
    {
        return toAjax(brakeValveService.updateBrakeValve(brakeValve));
    }

    /**
     * 删除制动阀
     */
    @PreAuthorize("@ss.hasPermi('system:valve:remove')")
    @Log(title = "制动阀", businessType = BusinessType.DELETE)
	@DeleteMapping("/{brakeIds}")
    public AjaxResult remove(@PathVariable Long[] brakeIds)
    {
        return toAjax(brakeValveService.deleteBrakeValveByBrakeIds(brakeIds));
    }
}
