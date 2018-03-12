package java100.app.dao.performance;

import java.util.List;

import java100.app.domain.performance.ReviewFile;

public interface ReviewFileDao {


	void insert(ReviewFile media);
	List<ReviewFile> findByreviewNo(int no);



}















