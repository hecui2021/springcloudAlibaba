package com.study.pojo;

import java.util.StringJoiner;

public class Response<T> {

    private Integer status;
    private String message;
    private T data;
    private String traceId;
    private Long timestamp;
    private String host;
    private Long cost;

    public Response() {
    }

    public Response(T data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public Response<T> setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Response<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public Response<T> setData(T data) {
        this.data = data;
        return this;
    }

    public String getTraceId() {
        return traceId;
    }

    public Response<T> setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Response<T> setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getHost() {
        return host;
    }

    public Response<T> setHost(String host) {
        this.host = host;
        return this;
    }

    public Long getCost() {
        return cost;
    }

    public Response<T> setCost(Long cost) {
        this.cost = cost;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Response.class.getSimpleName() + "[", "]")
            .add("status=" + status)
            .add("message='" + message + "'")
            .add("data=" + data)
            .add("traceId='" + traceId + "'")
            .add("timestamp=" + timestamp)
            .add("host='" + host + "'")
            .add("cost=" + cost)
            .toString();
    }
}
