package java100.app.domain;

import java.sql.Date;

public class Member {
    
    protected int no;
    protected String photo;
    protected String email;
    protected String password;
    protected String nickname;
    protected String type;
    protected String messageFlag;
    protected String messageId;
    protected String interestArea;
    protected String interestGenre;
    protected String cancleFlag;
    protected Date regDate;
    
    
    public Member() {}
    
    public Member(int no, String nickname) {
    	
    	this.no = no;
    	this.nickname = nickname;
    	
    }
    

	@Override
	public String toString() {
		return "Member [no=" + no + ", photo=" + photo + ", email=" + email + ", password=" + password + ", nickname="
				+ nickname + ", type=" + type + ", messageFlag=" + messageFlag + ", messageId=" + messageId
				+ ", interestArea=" + interestArea + ", interestGenre=" + interestGenre + ", cancleFlag=" + cancleFlag
				+ ", regDate=" + regDate + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessageFlag() {
		return messageFlag;
	}

	public void setMessageFlag(String messageFlag) {
		this.messageFlag = messageFlag;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getInterestArea() {
		return interestArea;
	}

	public void setInterestArea(String interestArea) {
		this.interestArea = interestArea;
	}

	public String getInterestGenre() {
		return interestGenre;
	}

	public void setInterestGenre(String interestGenre) {
		this.interestGenre = interestGenre;
	}

	public String getCancleFlag() {
		return cancleFlag;
	}

	public void setCancleFlag(String cancleFlag) {
		this.cancleFlag = cancleFlag;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
    

    
 

}

 