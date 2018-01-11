package java100.app.domain;

import java.sql.Date;
import java.util.List;

//도서명, 출판사, 출판일, 가격, 설명, 사진
public class Book {

    int no;
    String title;
    String description;
    int price;
    String press;
    Date publishedDate;
    List<UploadPhoto> photo;
    
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	public List<UploadPhoto> getPhoto() {
		return photo;
	}
	public void setPhoto(List<UploadPhoto> photo) {
		this.photo = photo;
	}
    
 
    
}
