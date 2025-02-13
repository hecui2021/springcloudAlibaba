package com.study.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author peterche
 * @description:
 * @date 2024-12-24
 */
@Data
public class IASDomainVO {

    private String id;

    /**
     * 域名
     */
    private String domain;

    private Business business;

    /**
     * 证书id
     */
    private String certification_id;

    /**
     * 网络类型(1：内网 2：公网)
     */
    private int domain_net_type;

    private String cname;

    /**
     * 证书自动托管
     */
    private boolean enable_auto_cert;

    /**
     * 证书详情
     */
    private Certification certification;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Business {

        private String id;

        /**
         * 负责人
         */
        private String principal;

        /**
         * 业务名称
         */
        private String name;

        /**
         * 关联负责人
         */
        private String pms_principal;

        private String pms_dept_name;
        private String pms_biz_set_name;
        private String pms_biz_name;
        private String pms_module_name;

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Certification {
        private String id;

        private int status;

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
    }

}
