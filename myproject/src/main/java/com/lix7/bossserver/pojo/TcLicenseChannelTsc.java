package com.lix7.bossserver.pojo;

import java.util.Date;

public class TcLicenseChannelTsc {
    private Integer id;

    private Integer lmpId;

    private Integer status;

    private String tsc;

    private String mode;

    private String startTime;

    private Integer endTime;

    private Integer licenseDuration;

    private String remark;

    private String lastModifyBy;

    private Date lastModifyTime;

    private String lastApproveBy;

    private Date lastApproveTime;

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

    public Integer getLmpId() {
        return lmpId;
    }

    public void setLmpId(Integer lmpId) {
        this.lmpId = lmpId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTsc() {
        return tsc;
    }

    public void setTsc(String tsc) {
        this.tsc = tsc == null ? null : tsc.trim();
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode == null ? null : mode.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getLicenseDuration() {
        return licenseDuration;
    }

    public void setLicenseDuration(Integer licenseDuration) {
        this.licenseDuration = licenseDuration;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(String lastModifyBy) {
        this.lastModifyBy = lastModifyBy == null ? null : lastModifyBy.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getLastApproveBy() {
        return lastApproveBy;
    }

    public void setLastApproveBy(String lastApproveBy) {
        this.lastApproveBy = lastApproveBy == null ? null : lastApproveBy.trim();
    }

    public Date getLastApproveTime() {
        return lastApproveTime;
    }

    public void setLastApproveTime(Date lastApproveTime) {
        this.lastApproveTime = lastApproveTime;
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