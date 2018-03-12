package java100.app.dao;

import java.util.HashMap;
import java.util.List;

import java100.app.domain.Member;

public interface MemberDao {

	int insert(Member member);

	int countAll();

	List<Member> findAll(HashMap<String, Object> params);

	Member findByNo(int no);

	int update(Member member);

	int delete(int no);

}















