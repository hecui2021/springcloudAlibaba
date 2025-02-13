package com.lix7.bossserver.pojo;

public class TcAuditLog {
    private Integer id;

    private String eventid;

    private Long timestamp;

    private String systemname;

    private String host;

    private String sourceip;

    private String targetip;

    private String rtx;

    private String url;

    private String httpmethod;

    private String requestsource;

    private String statuscode;

    private String statusmessage;

    private String appid;

    private String uin;

    private String subuin;

    private String ua;

    private String referer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventid() {
        return eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid == null ? null : eventid.trim();
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname == null ? null : systemname.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getSourceip() {
        return sourceip;
    }

    public void setSourceip(String sourceip) {
        this.sourceip = sourceip == null ? null : sourceip.trim();
    }

    public String getTargetip() {
        return targetip;
    }

    public void setTargetip(String targetip) {
        this.targetip = targetip == null ? null : targetip.trim();
    }

    public String getRtx() {
        return rtx;
    }

    public void setRtx(String rtx) {
        this.rtx = rtx == null ? null : rtx.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getHttpmethod() {
        return httpmethod;
    }

    public void setHttpmethod(String httpmethod) {
        this.httpmethod = httpmethod == null ? null : httpmethod.trim();
    }

    public String getRequestsource() {
        return requestsource;
    }

    public void setRequestsource(String requestsource) {
        this.requestsource = requestsource == null ? null : requestsource.trim();
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode == null ? null : statuscode.trim();
    }

    public String getStatusmessage() {
        return statusmessage;
    }

    public void setStatusmessage(String statusmessage) {
        this.statusmessage = statusmessage == null ? null : statusmessage.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getUin() {
        return uin;
    }

    public void setUin(String uin) {
        this.uin = uin == null ? null : uin.trim();
    }

    public String getSubuin() {
        return subuin;
    }

    public void setSubuin(String subuin) {
        this.subuin = subuin == null ? null : subuin.trim();
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua == null ? null : ua.trim();
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer == null ? null : referer.trim();
    }
}