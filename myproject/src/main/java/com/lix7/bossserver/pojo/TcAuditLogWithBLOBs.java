package com.lix7.bossserver.pojo;

public class TcAuditLogWithBLOBs extends TcAuditLog {
    private String httpparams;

    private String httppayload;

    private String response;

    public String getHttpparams() {
        return httpparams;
    }

    public void setHttpparams(String httpparams) {
        this.httpparams = httpparams == null ? null : httpparams.trim();
    }

    public String getHttppayload() {
        return httppayload;
    }

    public void setHttppayload(String httppayload) {
        this.httppayload = httppayload == null ? null : httppayload.trim();
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response == null ? null : response.trim();
    }
}