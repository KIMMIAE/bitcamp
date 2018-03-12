package java100.app.service.impl;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java100.app.dao.performance.PerformanceReviewDao;
import java100.app.dao.performance.ReviewFileDao;
import java100.app.domain.performance.PerformanceFile;
import java100.app.domain.performance.PerformanceReview;
import java100.app.domain.performance.ReviewFile;
import java100.app.service.PerformanceReviewService;

@Service
public class PerformanceReviewServiceImpl implements PerformanceReviewService {

    @Autowired PerformanceReviewDao performanceReviewDao;
    @Autowired ReviewFileDao reviewFileDao;

	@Override
	public int add(PerformanceReview performanceReview) {
        int count = performanceReviewDao.insert(performanceReview);
        
        return count;
	}

	@Override
	public int getTotalCount() {
        return performanceReviewDao.countAll();
	}

	@Override
	public List<PerformanceReview> list(int pageNo, int pageSize, HashMap<String, Object> options) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("startIndex", (pageNo - 1) * pageSize);
        params.put("size", pageSize);
        
        if (options != null) {
            params.putAll(options);
        }
        return performanceReviewDao.findAll(params);
	}

	@Override
	public PerformanceReview get(int no) {
        performanceReviewDao.updateViewCount(no);
        PerformanceReview performanceReview = performanceReviewDao.findByNo2(no);
        
        return performanceReview;
	}

	@Override
	public int update(PerformanceReview performanceReview) {
        return performanceReviewDao.update(performanceReview);
	}

	@Override
	public int delete(int no) {
        return performanceReviewDao.delete(no);
	}

	@Override
	public void addFiles(List<ReviewFile> files, int reviewNo) {
        for (ReviewFile media : files) {
            System.out.println(media.toString());
            media.setReviewNo(reviewNo);
            reviewFileDao.insert(media);
        }
	}

	@Override
	public List<ReviewFile> getMedias(int no) {
        return reviewFileDao.findByreviewNo(no);
	}


    

}












