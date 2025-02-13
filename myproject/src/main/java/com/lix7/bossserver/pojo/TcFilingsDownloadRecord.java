package com.lix7.bossserver.pojo;

import java.util.Date;

public class TcFilingsDownloadRecord {
    private Integer id;

    private String requestId;

    private String returnFileName;

    private String beianInfoHash;

    private Integer compressionFormat;

    private Integer encryptAlgorithm;

    private Integer hashAlgorithm;

    private Byte isDelete;

    private Date createTime;

    private Date updateTime;

    private String createBy;

    private String updateBy;

    private String beianInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId == null ? null : requestId.trim();
    }

    public String getReturnFileName() {
        return returnFileName;
    }

    public void setReturnFileName(String returnFileName) {
        this.returnFileName = returnFileName == null ? null : returnFileName.trim();
    }

    public String getBeianInfoHash() {
        return beianInfoHash;
    }

    public void setBeianInfoHash(String beianInfoHash) {
        this.beianInfoHash = beianInfoHash == null ? null : beianInfoHash.trim();
    }

    public Integer getCompressionFormat() {
        return compressionFormat;
    }

    public void setCompressionFormat(Integer compressionFormat) {
        this.compressionFormat = compressionFormat;
    }

    public Integer getEncryptAlgorithm() {
        return encryptAlgorithm;
    }

    public void setEncryptAlgorithm(Integer encryptAlgorithm) {
        this.encryptAlgorithm = encryptAlgorithm;
    }

    public Integer getHashAlgorithm() {
        return hashAlgorithm;
    }

    public void setHashAlgorithm(Integer hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getBeianInfo() {
        return beianInfo;
    }

    public void setBeianInfo(String beianInfo) {
        this.beianInfo = beianInfo == null ? null : beianInfo.trim();
    }
}