package java100.app.domain;

public class InterestGenre {
	
	protected int generNo;
	protected String genreName;
    protected String genreAll;
	protected int MemberNo;
	
	public InterestGenre() {}
	
	@Override
	public String toString() {
		return "InterestGenre [generNo=" + generNo + ", genreName=" + genreName + ", genreAll=" + genreAll
				+ ", MemberNo=" + MemberNo + "]";
	}

	public int getGenerNo() {
		return generNo;
	}

	public void setGenerNo(int generNo) {
		this.generNo = generNo;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	public String getGenreAll() {
		return genreAll;
	}

	public void setGenreAll(String genreAll) {
		this.genreAll = genreAll;
	}

	public int getMemberNo() {
		return MemberNo;
	}

	public void setMemberNo(int memberNo) {
		MemberNo = memberNo;
	}
	

	

}
