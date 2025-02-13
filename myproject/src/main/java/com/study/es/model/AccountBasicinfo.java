package com.study.es.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author peterche
 * @Description
 * @Date 2023/8/30 11:38
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountBasicinfo {

    private String _id;

    private String auto_updatetime;

    private String car_token;

    private int device_auth_state;

    private int device_type;

    private String device_type_name;

    private String deviceid;

    private String channel;

    private int isvalid;

    private String wecarid;

    private long regist_time;

    private int sDCacheExpireTime;

}
