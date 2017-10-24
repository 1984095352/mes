package cn.ssm.po;

public class Cstd {
    private Integer cstdunid;

    private String cstdnum;

    private String description;

    private String profession;

    private Integer cishu;

    public Integer getCstdunid() {
        return cstdunid;
    }

    public void setCstdunid(Integer cstdunid) {
        this.cstdunid = cstdunid;
    }

    public String getCstdnum() {
        return cstdnum;
    }

    public void setCstdnum(String cstdnum) {
        this.cstdnum = cstdnum == null ? null : cstdnum.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public Integer getCishu() {
        return cishu;
    }

    public void setCishu(Integer cishu) {
        this.cishu = cishu;
    }
}