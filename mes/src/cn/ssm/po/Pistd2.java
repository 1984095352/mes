package cn.ssm.po;

public class Pistd2 {
    private Long pistdid;

    private String pistdnum;

    private String description;

    private String piprofession;

    public Long getPistdid() {
        return pistdid;
    }

    public void setPistdid(Long pistdid) {
        this.pistdid = pistdid;
    }

    public String getPistdnum() {
        return pistdnum;
    }

    public void setPistdnum(String pistdnum) {
        this.pistdnum = pistdnum == null ? null : pistdnum.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPiprofession() {
        return piprofession;
    }

    public void setPiprofession(String piprofession) {
        this.piprofession = piprofession == null ? null : piprofession.trim();
    }
}