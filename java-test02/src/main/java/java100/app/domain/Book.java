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
    List<UploadPhoto> photos;
    
	@Override
	public String toString() {
		return "Book [no=" + no + ", title=" + title + ", description=" + description + ", price=" + price + ", press="
				+ press + ", publishedDate=" + publishedDate + ", photos=" + photos + "]";
	}
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
	public List<UploadPhoto> getPhotos() {
		return photos;
	}
	public void setPhotos(List<UploadPhoto> photos) {
		this.photos = photos;
	}
    

    
}
