package com.study.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author peterche
 * @description:
 * @date 2024-12-26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IASDomainExportVO {
    /**
     * 域名
     */
    private String domain;

    /**
     * 网络类型(1：内网 2：公网)
     */
    private String domain_net_type;

    /**
     * 证书是否自动托管
     */
    private String enable_auto_cert;

    /**
     * 证书名称
     */
    private String alias_name;

    /**
     * 证书开始时间
     */
    private String start_time;

    /**
     * 证书结束时间
     */
    private String end_time;

    /**
     * 负责人
     */
    private String principal;

    /**
     * 关联业务
     */
    private String linkBusiness;
}
