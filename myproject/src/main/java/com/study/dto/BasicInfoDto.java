package com.study.dto;

import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 * @Author peterche
 * @Description
 * @Date 2023/9/28 15:43
 **/
@Data
public class BasicInfoDto {

    private List<String> channelIdList;

    private Date startDate;
    private Date endDate;

    private int num;

}
