package cn.ssm.po;

public class Cstdline {
    private Integer unid;

    private String cstdnum;

    private Integer clinenum;

    private String partloc;

    private String content;

    private String standard;

    private String contentflag;
    
    private int cishu;

    public int getCishu() {
		return cishu;
	}

	public void setCishu(int cishu) {
		this.cishu = cishu;
	}

	public Integer getUnid() {
        return unid;
    }

    public void setUnid(Integer unid) {
        this.unid = unid;
    }

    public String getCstdnum() {
        return cstdnum;
    }

    public void setCstdnum(String cstdnum) {
        this.cstdnum = cstdnum == null ? null : cstdnum.trim();
    }

    public Integer getClinenum() {
        return clinenum;
    }

    public void setClinenum(Integer clinenum) {
        this.clinenum = clinenum;
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

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getContentflag() {
        return contentflag;
    }

    public void setContentflag(String contentflag) {
        this.contentflag = contentflag == null ? null : contentflag.trim();
    }
}