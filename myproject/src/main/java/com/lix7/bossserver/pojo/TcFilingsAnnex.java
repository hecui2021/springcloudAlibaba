package com.lix7.bossserver.pojo;

import java.util.Date;

public class TcFilingsAnnex {
    private Integer id;

    private Integer infoId;

    private Integer type;

    private String cjm;

    private Long hyclbs;

    private Long fjwjgs;

    private Long fjyt;

    private String fjnr;

    private Long fjssdxSsdxlx;

    private String fjssdxSsdxbs;

    private String bz;

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

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCjm() {
        return cjm;
    }

    public void setCjm(String cjm) {
        this.cjm = cjm == null ? null : cjm.trim();
    }

    public Long getHyclbs() {
        return hyclbs;
    }

    public void setHyclbs(Long hyclbs) {
        this.hyclbs = hyclbs;
    }

    public Long getFjwjgs() {
        return fjwjgs;
    }

    public void setFjwjgs(Long fjwjgs) {
        this.fjwjgs = fjwjgs;
    }

    public Long getFjyt() {
        return fjyt;
    }

    public void setFjyt(Long fjyt) {
        this.fjyt = fjyt;
    }

    public String getFjnr() {
        return fjnr;
    }

    public void setFjnr(String fjnr) {
        this.fjnr = fjnr == null ? null : fjnr.trim();
    }

    public Long getFjssdxSsdxlx() {
        return fjssdxSsdxlx;
    }

    public void setFjssdxSsdxlx(Long fjssdxSsdxlx) {
        this.fjssdxSsdxlx = fjssdxSsdxlx;
    }

    public String getFjssdxSsdxbs() {
        return fjssdxSsdxbs;
    }

    public void setFjssdxSsdxbs(String fjssdxSsdxbs) {
        this.fjssdxSsdxbs = fjssdxSsdxbs == null ? null : fjssdxSsdxbs.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
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