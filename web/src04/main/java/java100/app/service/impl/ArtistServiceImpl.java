package java100.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java100.app.dao.ArtistDao;
import java100.app.domain.Artist;
import java100.app.service.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired ArtistDao artistDao;
	
	
	@Override
	public int add(Artist artist) {
		return artistDao.insert(artist);
	}

}
