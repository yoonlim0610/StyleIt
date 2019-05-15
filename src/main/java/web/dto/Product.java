package web.dto;

public class Product {
//	----- 원본 테이블 컬럼 --------
	private int p_no;
	private String p_gender;
	private int p_price;
	private String p_name;
	private int fu_no;
	private int pca_no;
	private int pco_no;
	private int pb_no;
	private int po_no;
	private int ps_no;
	private int pp_no;
	private String p_url;
//	---------------------------
//	----- join 테이블 컬럼 --------
	private String fu_storedname;
	private String pb_name;
	private int s_no;
	private int cntplike;
	private int plikecheck;
//	---------------------------
	
	@Override
	public String toString() {
		return "Product [p_no=" + p_no + ", p_gender=" + p_gender + ", p_price=" + p_price + ", p_name=" + p_name
				+ ", fu_no=" + fu_no + ", pca_no=" + pca_no + ", pco_no=" + pco_no + ", pb_no=" + pb_no + ", po_no="
				+ po_no + ", ps_no=" + ps_no + ", pp_no=" + pp_no + ", p_url=" + p_url + ", fu_storedname="
				+ fu_storedname + ", pb_name=" + pb_name + ", s_no=" + s_no + ", cntplike=" + cntplike + ", plikecheck="
				+ plikecheck + "]";
	}

	
	public int getCntplike() {
		return cntplike;
	}


	public void setCntplike(int cntplike) {
		this.cntplike = cntplike;
	}


	public int getPlikecheck() {
		return plikecheck;
	}


	public void setPlikecheck(int plikecheck) {
		this.plikecheck = plikecheck;
	}


	public int getS_no() {
		return s_no;
	}


	public void setS_no(int s_no) {
		this.s_no = s_no;
	}


	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public String getP_gender() {
		return p_gender;
	}

	public void setP_gender(String p_gender) {
		this.p_gender = p_gender;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getFu_no() {
		return fu_no;
	}

	public void setFu_no(int fu_no) {
		this.fu_no = fu_no;
	}

	public int getPca_no() {
		return pca_no;
	}

	public void setPca_no(int pca_no) {
		this.pca_no = pca_no;
	}

	public int getPco_no() {
		return pco_no;
	}

	public void setPco_no(int pco_no) {
		this.pco_no = pco_no;
	}

	public int getPb_no() {
		return pb_no;
	}

	public void setPb_no(int pb_no) {
		this.pb_no = pb_no;
	}

	public int getPo_no() {
		return po_no;
	}

	public void setPo_no(int po_no) {
		this.po_no = po_no;
	}

	public int getPs_no() {
		return ps_no;
	}

	public void setPs_no(int ps_no) {
		this.ps_no = ps_no;
	}

	public int getPp_no() {
		return pp_no;
	}

	public void setPp_no(int pp_no) {
		this.pp_no = pp_no;
	}

	public String getP_url() {
		return p_url;
	}

	public void setP_url(String p_url) {
		this.p_url = p_url;
	}

	public String getFu_storedname() {
		return fu_storedname;
	}

	public void setFu_storedname(String fu_storedname) {
		this.fu_storedname = fu_storedname;
	}

	public String getPb_name() {
		return pb_name;
	}

	public void setPb_name(String pb_name) {
		this.pb_name = pb_name;
	}
	
	
	

}
