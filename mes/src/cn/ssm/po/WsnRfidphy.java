package cn.ssm.po;

public class WsnRfidphy {
    private Integer unidrfidphy;

    private String rfid;

    private String phynum;

    private String assetnum;

    public Integer getUnidrfidphy() {
        return unidrfidphy;
    }

    public void setUnidrfidphy(Integer unidrfidphy) {
        this.unidrfidphy = unidrfidphy;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid == null ? null : rfid.trim();
    }

    public String getPhynum() {
        return phynum;
    }

    public void setPhynum(String phynum) {
        this.phynum = phynum == null ? null : phynum.trim();
    }

    public String getAssetnum() {
        return assetnum;
    }

    public void setAssetnum(String assetnum) {
        this.assetnum = assetnum == null ? null : assetnum.trim();
    }
}