package java100.app.domain;

public class InterestArea {
	
	protected int areaNo;
	protected String areaName;
	protected String areaAll;
	protected int MemberNo;
	
	
	public InterestArea () {}

	@Override
	public String toString() {
		return "InterestArea [areaNo=" + areaNo + ", areaName=" + areaName + ", areaAll=" + areaAll + ", MemberNo="
				+ MemberNo + "]";
	}

	public int getAreaNo() {
		return areaNo;
	}


	public void setAreaNo(int areaNo) {
		this.areaNo = areaNo;
	}


	public String getAreaName() {
		return areaName;
	}


	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}


	public String getAreaAll() {
		return areaAll;
	}


	public void setAreaAll(String areaAll) {
		this.areaAll = areaAll;
	}


	public int getMemberNo() {
		return MemberNo;
	}


	public void setMemberNo(int memberNo) {
		MemberNo = memberNo;
	}
	
	
	
	
	

}
