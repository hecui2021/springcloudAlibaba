package com.study.pojo;

import lombok.Data;

@Data
public class Response<T> {

    private int codev = 0;

    private String message = "success";

    private T data;

    private String traceId;

    public Response() {}

    public Response(T data) {
        this.data = data;
    }

}
