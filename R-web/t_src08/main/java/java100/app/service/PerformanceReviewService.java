package java100.app.service;

import java.util.HashMap;
import java.util.List;

import java100.app.domain.performance.PerformanceReview;
import java100.app.domain.performance.ReviewFile;

public interface PerformanceReviewService {

	int add(PerformanceReview performanceReview);
	int getTotalCount();
	List<PerformanceReview> list(int pageNo, int pageSize, HashMap<String, Object> options);
	PerformanceReview get(int no);
	int update(PerformanceReview performanceReview);
	int delete(int no);
	void addFiles(List<ReviewFile> files, int reviewNo);
	List<ReviewFile> getMedias(int no);

}





