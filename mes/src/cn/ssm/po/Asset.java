package cn.ssm.po;

import java.util.Date;

public class Asset {
    private Integer assetuid;

    private String assetnum;

    private String description;

    private String location;

    private String siteid;

    private String rfid;

    private Boolean uploadflag;

    private Date uploadtime;

    private String action;

    private String actionside;

    private Date actiontime;

    private String type;

    public Integer getAssetuid() {
        return assetuid;
    }

    public void setAssetuid(Integer assetuid) {
        this.assetuid = assetuid;
    }

    public String getAssetnum() {
        return assetnum;
    }

    public void setAssetnum(String assetnum) {
        this.assetnum = assetnum == null ? null : assetnum.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid == null ? null : rfid.trim();
    }

    public Boolean getUploadflag() {
        return uploadflag;
    }

    public void setUploadflag(Boolean uploadflag) {
        this.uploadflag = uploadflag;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getActionside() {
        return actionside;
    }

    public void setActionside(String actionside) {
        this.actionside = actionside == null ? null : actionside.trim();
    }

    public Date getActiontime() {
        return actiontime;
    }

    public void setActiontime(Date actiontime) {
        this.actiontime = actiontime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}