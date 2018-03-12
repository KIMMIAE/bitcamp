package java100.app.dao;

import java.util.List;
import java.util.Map;

import java100.app.domain.Artist;

public interface ArtistDao {
    List<Artist> findAll(Map<String, Object> params);
    Artist findByNo(int no);
	int insert(Artist artist);
    int countAll();


}















