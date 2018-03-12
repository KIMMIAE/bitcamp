package java100.app.service;

import java.util.List;
import java.util.Map;

import java100.app.domain.performance.PerformanceReview;
import java100.app.domain.performance.ReviewFile;

public interface PerformanceReviewService {

	List<PerformanceReview> list(int pageNo, int pageSize, Map<String, Object> options);
	PerformanceReview get(int no);
	int getTotalCount();
	List<ReviewFile> getMedias(int reviewFileNo);
	int add(PerformanceReview performanceReview);
	int update(PerformanceReview performanceReview);
	int delete(int no);
	void addReviewFiles(List<ReviewFile> reviewFiles, int reviewFileNo);
	List<PerformanceReview> findByArtNo (int no);



}





