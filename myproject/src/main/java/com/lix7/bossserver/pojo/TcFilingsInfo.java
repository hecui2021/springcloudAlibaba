package com.lix7.bossserver.pojo;

import java.util.Date;

public class TcFilingsInfo {
    private Integer id;

    private Integer applyId;

    private Integer status;

    private String programAppId;

    private String mainpartFilingsId;

    private String programFilingsId;

    private String remark;

    private String verifyRemark;

    private Date applyTime;

    private String applyBy;

    private Date verifyTime;

    private String verifyBy;

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

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProgramAppId() {
        return programAppId;
    }

    public void setProgramAppId(String programAppId) {
        this.programAppId = programAppId == null ? null : programAppId.trim();
    }

    public String getMainpartFilingsId() {
        return mainpartFilingsId;
    }

    public void setMainpartFilingsId(String mainpartFilingsId) {
        this.mainpartFilingsId = mainpartFilingsId == null ? null : mainpartFilingsId.trim();
    }

    public String getProgramFilingsId() {
        return programFilingsId;
    }

    public void setProgramFilingsId(String programFilingsId) {
        this.programFilingsId = programFilingsId == null ? null : programFilingsId.trim();
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

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplyBy() {
        return applyBy;
    }

    public void setApplyBy(String applyBy) {
        this.applyBy = applyBy == null ? null : applyBy.trim();
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getVerifyBy() {
        return verifyBy;
    }

    public void setVerifyBy(String verifyBy) {
        this.verifyBy = verifyBy == null ? null : verifyBy.trim();
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