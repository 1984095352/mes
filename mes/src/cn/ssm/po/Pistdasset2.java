package cn.ssm.po;

public class Pistdasset2 {
    private Long pistdassetid;

    private String pistdnum;

    private String assetnum;

    public Long getPistdassetid() {
        return pistdassetid;
    }

    public void setPistdassetid(Long pistdassetid) {
        this.pistdassetid = pistdassetid;
    }

    public String getPistdnum() {
        return pistdnum;
    }

    public void setPistdnum(String pistdnum) {
        this.pistdnum = pistdnum == null ? null : pistdnum.trim();
    }

    public String getAssetnum() {
        return assetnum;
    }

    public void setAssetnum(String assetnum) {
        this.assetnum = assetnum == null ? null : assetnum.trim();
    }
}