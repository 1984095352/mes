package cn.ssm.po;

public class Cstdasset {
    private Integer cstdassetid;

    private String cstdnum;

    private String assetnum;

    public Integer getCstdassetid() {
        return cstdassetid;
    }

    public void setCstdassetid(Integer cstdassetid) {
        this.cstdassetid = cstdassetid;
    }

    public String getCstdnum() {
        return cstdnum;
    }

    public void setCstdnum(String cstdnum) {
        this.cstdnum = cstdnum == null ? null : cstdnum.trim();
    }

    public String getAssetnum() {
        return assetnum;
    }

    public void setAssetnum(String assetnum) {
        this.assetnum = assetnum == null ? null : assetnum.trim();
    }
}