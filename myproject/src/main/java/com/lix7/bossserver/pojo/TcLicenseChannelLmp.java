package com.lix7.bossserver.pojo;

import java.util.Date;

public class TcLicenseChannelLmp {
    private Integer id;

    private Integer type;

    private String channelId;

    private String lmpId;

    private Integer status;

    private Integer enableLicenseChecking;

    private String applyRemark;

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

    private String modifyRecord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getLmpId() {
        return lmpId;
    }

    public void setLmpId(String lmpId) {
        this.lmpId = lmpId == null ? null : lmpId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEnableLicenseChecking() {
        return enableLicenseChecking;
    }

    public void setEnableLicenseChecking(Integer enableLicenseChecking) {
        this.enableLicenseChecking = enableLicenseChecking;
    }

    public String getApplyRemark() {
        return applyRemark;
    }

    public void setApplyRemark(String applyRemark) {
        this.applyRemark = applyRemark == null ? null : applyRemark.trim();
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

    public String getModifyRecord() {
        return modifyRecord;
    }

    public void setModifyRecord(String modifyRecord) {
        this.modifyRecord = modifyRecord == null ? null : modifyRecord.trim();
    }
}