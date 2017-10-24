package cn.ssm.po;

public class Pistdline3 {
    private Long pistdlineid;

    private String pistdnum;

    private Integer pistdlinenum;

    private String partloc;

    private String content;

    private String method;

    private String standard;

    private String period;

    private Integer disabled;

    public Long getPistdlineid() {
        return pistdlineid;
    }

    public void setPistdlineid(Long pistdlineid) {
        this.pistdlineid = pistdlineid;
    }

    public String getPistdnum() {
        return pistdnum;
    }

    public void setPistdnum(String pistdnum) {
        this.pistdnum = pistdnum == null ? null : pistdnum.trim();
    }

    public Integer getPistdlinenum() {
        return pistdlinenum;
    }

    public void setPistdlinenum(Integer pistdlinenum) {
        this.pistdlinenum = pistdlinenum;
    }

    public String getPartloc() {
        return partloc;
    }

    public void setPartloc(String partloc) {
        this.partloc = partloc == null ? null : partloc.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }
}