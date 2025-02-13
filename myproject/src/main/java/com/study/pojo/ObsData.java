package com.study.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @Author peterche
 * @Description
 * @Date 2023/8/11 16:15
 **/
@Data
public class ObsData {

    @ExcelProperty("核算年月")
    private String yearmonth;

    @ExcelProperty("累计日期")
    private String day;

    @ExcelProperty("资源ID")
    private String instanceId;

    @ExcelProperty("一级产品code")
    private String productIdV1;

    @ExcelProperty("一级产品")
    private String productNameV1;

    @ExcelProperty("二级产品code")
    private String productIdV2;

    @ExcelProperty("二级产品")
    private String productNameV2;

    @ExcelProperty("三级产品code")
    private String productIdV3;

    @ExcelProperty("三级产品")
    private String productNameV3;

    @ExcelProperty("四级产品code")
    private String productIdV4;

    @ExcelProperty("四级产品")
    private String productNameV4;

    @ExcelProperty("操作类型名称")
    private String operateName;

    @ExcelProperty("成本合计")
    private String lastMoney;

    @ExcelProperty("时长")
    private String time;

    @ExcelProperty("时长单位")
    private String timeUnit;

    @ExcelProperty("负责人")
    private String owner;
}
