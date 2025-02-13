package com.study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author peterche
 * @description:
 * @date 2025-01-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TcAgentQuery {
    private int id;

    private String app;
    private String type;
    private String query;
    private int result;

    private String resultApp;
    private String resultType;

    private int isDelete;

    public TcAgentQuery(String app, String type, String query) {
        this.app = app;
        this.type = type;
        this.query = query;
    }
}
