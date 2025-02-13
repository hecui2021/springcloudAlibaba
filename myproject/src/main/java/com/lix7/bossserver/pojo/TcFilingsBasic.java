package com.lix7.bossserver.pojo;

import java.util.Date;

public class TcFilingsBasic {
    private Integer id;

    private Integer type;

    private Long dmsId;

    private Long ysid;

    private String bm;

    private Long shengid;

    private String shengjc;

    private Long dwflid;

    private Long pid;

    private String mc;

    private Long ssdxlx;

    private Long sfqzsp;

    private Long lx;

    private String bz;

    private Long sfyx;

    private String version;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getDmsId() {
        return dmsId;
    }

    public void setDmsId(Long dmsId) {
        this.dmsId = dmsId;
    }

    public Long getYsid() {
        return ysid;
    }

    public void setYsid(Long ysid) {
        this.ysid = ysid;
    }

    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm == null ? null : bm.trim();
    }

    public Long getShengid() {
        return shengid;
    }

    public void setShengid(Long shengid) {
        this.shengid = shengid;
    }

    public String getShengjc() {
        return shengjc;
    }

    public void setShengjc(String shengjc) {
        this.shengjc = shengjc == null ? null : shengjc.trim();
    }

    public Long getDwflid() {
        return dwflid;
    }

    public void setDwflid(Long dwflid) {
        this.dwflid = dwflid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc == null ? null : mc.trim();
    }

    public Long getSsdxlx() {
        return ssdxlx;
    }

    public void setSsdxlx(Long ssdxlx) {
        this.ssdxlx = ssdxlx;
    }

    public Long getSfqzsp() {
        return sfqzsp;
    }

    public void setSfqzsp(Long sfqzsp) {
        this.sfqzsp = sfqzsp;
    }

    public Long getLx() {
        return lx;
    }

    public void setLx(Long lx) {
        this.lx = lx;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public Long getSfyx() {
        return sfyx;
    }

    public void setSfyx(Long sfyx) {
        this.sfyx = sfyx;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
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