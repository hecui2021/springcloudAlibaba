package com.lix7.bossserver.pojo;

import java.util.Date;

public class TcLicenseChannelRecord {
    private Integer id;

    private String lmpId;

    private String channelId;

    private Integer version;

    private String applyBy;

    private Date applyTime;

    private String approveBy;

    private Date approveTime;

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

    public String getLmpId() {
        return lmpId;
    }

    public void setLmpId(String lmpId) {
        this.lmpId = lmpId == null ? null : lmpId.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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

    public String getApproveBy() {
        return approveBy;
    }

    public void setApproveBy(String approveBy) {
        this.approveBy = approveBy == null ? null : approveBy.trim();
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
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