package Abstract;

import Entities.Member;

public interface MemberService {
	
	void save(Member member);
	void update (Member member);
	void delete (Member member);

}
