package java100.app.domain;

import java.sql.Date;

public class Artist {
	int artno;
	String artistName;
	String artistMember;
	String profile;
	Date joinDate;
	
	
	public Artist () {}
	
	
	
	
	
	@Override
	public String toString() {
		return "Artist [artno=" + artno + ", artistName=" + artistName + ", artistMember=" + artistMember + ", profile="
				+ profile + ", joinDate=" + joinDate + "]";
	}





	public int getArtno() {
		return artno;
	}
	public void setArtno(int artno) {
		this.artno = artno;
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
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	

}
