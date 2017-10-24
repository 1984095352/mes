package cn.ssm.po;

import java.util.Date;

public class Cplan {
    private Integer unidcplan;

    private String cplannum;

    private String executeby;

    private Date drawupdate;

    private String assetnum;

    private String cstdnum;

    private String regular;

    private String result;

    private String status;

    private String type;

    private String devicenote;

    public Integer getUnidcplan() {
        return unidcplan;
    }

    public void setUnidcplan(Integer unidcplan) {
        this.unidcplan = unidcplan;
    }

    public String getCplannum() {
        return cplannum;
    }

    public void setCplannum(String cplannum) {
        this.cplannum = cplannum == null ? null : cplannum.trim();
    }

    public String getExecuteby() {
        return executeby;
    }

    public void setExecuteby(String executeby) {
        this.executeby = executeby == null ? null : executeby.trim();
    }

    public Date getDrawupdate() {
        return drawupdate;
    }

    public void setDrawupdate(Date drawupdate) {
        this.drawupdate = drawupdate;
    }

    public String getAssetnum() {
        return assetnum;
    }

    public void setAssetnum(String assetnum) {
        this.assetnum = assetnum == null ? null : assetnum.trim();
    }

    public String getCstdnum() {
        return cstdnum;
    }

    public void setCstdnum(String cstdnum) {
        this.cstdnum = cstdnum == null ? null : cstdnum.trim();
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular == null ? null : regular.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDevicenote() {
        return devicenote;
    }

    public void setDevicenote(String devicenote) {
        this.devicenote = devicenote == null ? null : devicenote.trim();
    }
}