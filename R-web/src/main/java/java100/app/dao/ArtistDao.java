package java100.app.dao;

import java.util.List;
import java.util.Map;

import java100.app.domain.Artist;

public interface ArtistDao {
    List<Artist> findAll(Map<String, Object> params);
    Artist findByNo(int no);
    int countAll();
	int insert(Artist artist);
	int update(Artist artist);
	int delete(int no);


}















