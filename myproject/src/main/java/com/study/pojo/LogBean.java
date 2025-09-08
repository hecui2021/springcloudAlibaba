package com.study.pojo;

import lombok.Data;

@Data
public class LogBean {

    private String svc;
    private String traceId;
    private String cmd;
    private String clientIP;
    private String serverIP;
    private Long reqTime;
    private Long respTime;
    private Long cost;
    private Object reqStr;
    private String respStr;

}
