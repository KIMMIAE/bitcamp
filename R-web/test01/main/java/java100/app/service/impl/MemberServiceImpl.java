package java100.app.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java100.app.dao.ArtistDao;
import java100.app.dao.InterestAreaDao;
import java100.app.dao.InterestGenreDao;
import java100.app.dao.MemberDao;
import java100.app.domain.Artist;
import java100.app.domain.Member;
import java100.app.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired MemberDao memberDao;
    @Autowired ArtistDao artistDao;
    @Autowired InterestAreaDao interestAreaDao;
    @Autowired InterestGenreDao interestGenreDao;

	@Override
	public int getTotalCount() {
        return memberDao.countAll();
	}

	@Override
	public List<Member> list(int pageNo, int pageSize, Map<String, Object> options) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("startIndex", (pageNo - 1) * pageSize);
        params.put("size", pageSize);
        
        if (options != null) {
            params.putAll(options);
        }
        
        return memberDao.findAll(params);
	}

	@Override
	public Member get(int no) {
        return memberDao.findByNo(no);
	}

	@Override
	public int update(Member member, Artist artist) {
		artistDao.update(artist);
        return memberDao.update(member);
	}


	@Override
	public int delete(int no) {
		artistDao.delete(no);
		return memberDao.delete(no);
	}


	@Override
	public int add(Member member, Artist artist) {
		int count = memberDao.insert(member);
		artistDao.insert(member.getArtist());
		interestAreaDao.insert(member.getInterestArea());
		interestGenreDao.insert(member.getIntrerstgenre());
		
		return count;
	}


}
