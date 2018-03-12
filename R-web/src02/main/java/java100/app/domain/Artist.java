package java100.app.domain;

import java.sql.Date;

public class Artist {
	protected int no;
    protected String artistName;
    protected String artistMember;
    protected Date joinDate;
    protected String profile;
    
    public Artist() {}
    
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getArtistMember() {
		return artistMember;
	}
	public void setArtistMember(String artistMember) {
		this.artistMember = artistMember;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}

    
    
}
