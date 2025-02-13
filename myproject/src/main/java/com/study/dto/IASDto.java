package com.study.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author peterche
 * @description:
 * @date 2024-12-24
 */
@Data
public class IASDto {

    @Data
    @AllArgsConstructor
    public static class IASBase {
        private String request_id;
        private String user;
        private String token;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class IASRequest {

        /**
         * 域名ID
         */
        private String id;

        /**
         * 仅显示我有权限的 false
         */
        private boolean show_all;

        private int page;
        private int size;
    }
}
