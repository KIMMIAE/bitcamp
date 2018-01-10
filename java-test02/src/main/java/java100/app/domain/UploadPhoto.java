package java100.app.domain;

public class UploadPhoto {
	int no;
	String Photoname;
	int bookNo;
	
	public UploadPhoto() {}
	
	public UploadPhoto(String Photoname) {
		this(0, Photoname);
	}
	
	public UploadPhoto(int no, String Photoname) {
		this.no = no;
		this.Photoname = Photoname;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getPhotoname() {
		return Photoname;
	}

	public void setPhotoname(String photoname) {
		Photoname = photoname;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	

}
