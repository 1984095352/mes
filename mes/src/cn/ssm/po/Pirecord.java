package cn.ssm.po;

import java.sql.Date;

public class Pirecord {

	private String PIPROFESSION=null;
	private String PIPLANNUM=null;
	private Date PIPLANDATE=null;
	private String PIBY=null;
	private String PIRECORDNUM=null;
	private String ASSETNUM=null;
	private Date PIDATE=null;
	private String DESCRIPTION=null;
	private String DISPLAYNAME=null;
	private String result=null;
	
	public String getPIPROFESSION() {
		return PIPROFESSION;
	}
	public void setPIPROFESSION(String pIPROFESSION) {
		PIPROFESSION = pIPROFESSION;
	}
	public String getPIPLANNUM() {
		return PIPLANNUM;
	}
	public void setPIPLANNUM(String pIPLANNUM) {
		PIPLANNUM = pIPLANNUM;
	}
	public Date getPIPLANDATE() {
		return PIPLANDATE;
	}
	public void setPIPLANDATE(Date pIPLANDATE) {
		PIPLANDATE = pIPLANDATE;
	}
	public String getPIBY() {
		return PIBY;
	}
	public void setPIBY(String pIBY) {
		PIBY = pIBY;
	}
	public String getPIRECORDNUM() {
		return PIRECORDNUM;
	}
	public void setPIRECORDNUM(String pIRECORDNUM) {
		PIRECORDNUM = pIRECORDNUM;
	}
	public String getASSETNUM() {
		return ASSETNUM;
	}
	public void setASSETNUM(String aSSETNUM) {
		ASSETNUM = aSSETNUM;
	}
	public Date getPIDATE() {
		return PIDATE;
	}
	public void setPIDATE(Date pIDATE) {
		PIDATE = pIDATE;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public String getDISPLAYNAME() {
		return DISPLAYNAME;
	}
	public void setDISPLAYNAME(String dISPLAYNAME) {
		DISPLAYNAME = dISPLAYNAME;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	
}
