package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 轴承退卸对象 bearing_withdrawal
 * 
 * @author ruoyi
 * @date 2024-06-23
 */
public class BearingWithdrawal extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long bearingId;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 数值 */
    @Excel(name = "数值")
    private String value;

    /** 统计日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "统计日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date statisDate;

    public void setBearingId(Long bearingId) 
    {
        this.bearingId = bearingId;
    }

    public Long getBearingId() 
    {
        return bearingId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setValue(String value) 
    {
        this.value = value;
    }

    public String getValue() 
    {
        return value;
    }
    public void setStatisDate(Date statisDate) 
    {
        this.statisDate = statisDate;
    }

    public Date getStatisDate() 
    {
        return statisDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("bearingId", getBearingId())
            .append("name", getName())
            .append("value", getValue())
            .append("statisDate", getStatisDate())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
