package com.lix7.bossserver.pojo;

import java.util.Date;

public class TcProgramBasicInfo {
    private String programId;

    private String programName;

    private String programAbbreviation;

    private String programEnName;

    private String iconKey;

    private String programIntro;

    private String programSubheading;

    private String programPoster;

    private String programBigPoster;

    private Byte programType;

    private Byte vendorType;

    private String category;

    private String categoryId;

    private String categoryFirstId;

    private String categorySecondId;

    private String programAppId;

    private String programSecretId;

    private String privPkgName;

    private String onlineVersion;

    private String onlineVersionId;

    private Integer priority;

    private Byte isDelete;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String developerId;

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId == null ? null : programId.trim();
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName == null ? null : programName.trim();
    }

    public String getProgramAbbreviation() {
        return programAbbreviation;
    }

    public void setProgramAbbreviation(String programAbbreviation) {
        this.programAbbreviation = programAbbreviation == null ? null : programAbbreviation.trim();
    }

    public String getProgramEnName() {
        return programEnName;
    }

    public void setProgramEnName(String programEnName) {
        this.programEnName = programEnName == null ? null : programEnName.trim();
    }

    public String getIconKey() {
        return iconKey;
    }

    public void setIconKey(String iconKey) {
        this.iconKey = iconKey == null ? null : iconKey.trim();
    }

    public String getProgramIntro() {
        return programIntro;
    }

    public void setProgramIntro(String programIntro) {
        this.programIntro = programIntro == null ? null : programIntro.trim();
    }

    public String getProgramSubheading() {
        return programSubheading;
    }

    public void setProgramSubheading(String programSubheading) {
        this.programSubheading = programSubheading == null ? null : programSubheading.trim();
    }

    public String getProgramPoster() {
        return programPoster;
    }

    public void setProgramPoster(String programPoster) {
        this.programPoster = programPoster == null ? null : programPoster.trim();
    }

    public String getProgramBigPoster() {
        return programBigPoster;
    }

    public void setProgramBigPoster(String programBigPoster) {
        this.programBigPoster = programBigPoster == null ? null : programBigPoster.trim();
    }

    public Byte getProgramType() {
        return programType;
    }

    public void setProgramType(Byte programType) {
        this.programType = programType;
    }

    public Byte getVendorType() {
        return vendorType;
    }

    public void setVendorType(Byte vendorType) {
        this.vendorType = vendorType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getCategoryFirstId() {
        return categoryFirstId;
    }

    public void setCategoryFirstId(String categoryFirstId) {
        this.categoryFirstId = categoryFirstId == null ? null : categoryFirstId.trim();
    }

    public String getCategorySecondId() {
        return categorySecondId;
    }

    public void setCategorySecondId(String categorySecondId) {
        this.categorySecondId = categorySecondId == null ? null : categorySecondId.trim();
    }

    public String getProgramAppId() {
        return programAppId;
    }

    public void setProgramAppId(String programAppId) {
        this.programAppId = programAppId == null ? null : programAppId.trim();
    }

    public String getProgramSecretId() {
        return programSecretId;
    }

    public void setProgramSecretId(String programSecretId) {
        this.programSecretId = programSecretId == null ? null : programSecretId.trim();
    }

    public String getPrivPkgName() {
        return privPkgName;
    }

    public void setPrivPkgName(String privPkgName) {
        this.privPkgName = privPkgName == null ? null : privPkgName.trim();
    }

    public String getOnlineVersion() {
        return onlineVersion;
    }

    public void setOnlineVersion(String onlineVersion) {
        this.onlineVersion = onlineVersion == null ? null : onlineVersion.trim();
    }

    public String getOnlineVersionId() {
        return onlineVersionId;
    }

    public void setOnlineVersionId(String onlineVersionId) {
        this.onlineVersionId = onlineVersionId == null ? null : onlineVersionId.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(String developerId) {
        this.developerId = developerId == null ? null : developerId.trim();
    }
}