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
import com.ruoyi.system.domain.CarRepair;
import com.ruoyi.system.service.ICarRepairService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 修车数Controller
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
@RestController
@RequestMapping("/system/repair")
public class CarRepairController extends BaseController
{
    @Autowired
    private ICarRepairService carRepairService;

    /**
     * 查询修车数列表
     */
    @PreAuthorize("@ss.hasPermi('system:repair:list')")
    @GetMapping("/list")
    public TableDataInfo list(CarRepair carRepair)
    {
        startPage();
        List<CarRepair> list = carRepairService.selectCarRepairList(carRepair);
        return getDataTable(list);
    }

    /**
     * 导出修车数列表
     */
    @PreAuthorize("@ss.hasPermi('system:repair:export')")
    @Log(title = "修车数", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CarRepair carRepair)
    {
        List<CarRepair> list = carRepairService.selectCarRepairList(carRepair);
        ExcelUtil<CarRepair> util = new ExcelUtil<CarRepair>(CarRepair.class);
        util.exportExcel(response, list, "修车数数据");
    }

    /**
     * 获取修车数详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:repair:query')")
    @GetMapping(value = "/{repairId}")
    public AjaxResult getInfo(@PathVariable("repairId") Long repairId)
    {
        return success(carRepairService.selectCarRepairByRepairId(repairId));
    }

    /**
     * 新增修车数
     */
    @PreAuthorize("@ss.hasPermi('system:repair:add')")
    @Log(title = "修车数", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CarRepair carRepair)
    {
        return toAjax(carRepairService.insertCarRepair(carRepair));
    }

    /**
     * 修改修车数
     */
    @PreAuthorize("@ss.hasPermi('system:repair:edit')")
    @Log(title = "修车数", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CarRepair carRepair)
    {
        return toAjax(carRepairService.updateCarRepair(carRepair));
    }

    /**
     * 删除修车数
     */
    @PreAuthorize("@ss.hasPermi('system:repair:remove')")
    @Log(title = "修车数", businessType = BusinessType.DELETE)
	@DeleteMapping("/{repairIds}")
    public AjaxResult remove(@PathVariable Long[] repairIds)
    {
        return toAjax(carRepairService.deleteCarRepairByRepairIds(repairIds));
    }
}
