package com.lix7.bossserver.pojo;

import java.util.Date;

public class TcLicenseTsc {
    private Integer id;

    private String channelId;

    private Integer status;

    private String tscUuid;

    private Integer mode;

    private Integer priority;

    private String startTime;

    private String endTime;

    private Long licenseDuration;

    private String cvlUuids;

    private String remark;

    private String verifyRemark;

    private String applyBy;

    private Date applyTime;

    private String verifyBy;

    private Date verifyTime;

    private Byte isDelete;

    private Date createTime;

    private Date updateTime;

    private String createBy;

    private String updateBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTscUuid() {
        return tscUuid;
    }

    public void setTscUuid(String tscUuid) {
        this.tscUuid = tscUuid == null ? null : tscUuid.trim();
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Long getLicenseDuration() {
        return licenseDuration;
    }

    public void setLicenseDuration(Long licenseDuration) {
        this.licenseDuration = licenseDuration;
    }

    public String getCvlUuids() {
        return cvlUuids;
    }

    public void setCvlUuids(String cvlUuids) {
        this.cvlUuids = cvlUuids == null ? null : cvlUuids.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getVerifyRemark() {
        return verifyRemark;
    }

    public void setVerifyRemark(String verifyRemark) {
        this.verifyRemark = verifyRemark == null ? null : verifyRemark.trim();
    }

    public String getApplyBy() {
        return applyBy;
    }

    public void setApplyBy(String applyBy) {
        this.applyBy = applyBy == null ? null : applyBy.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getVerifyBy() {
        return verifyBy;
    }

    public void setVerifyBy(String verifyBy) {
        this.verifyBy = verifyBy == null ? null : verifyBy.trim();
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
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
}