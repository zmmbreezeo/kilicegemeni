package Abstract;

import Entities.Member;

public abstract class BaseMemberManager implements MemberService {

	@Override
	public void save(Member member) {
		
		System.out.println( member.getFirstName() + " " + member.getLastName()  + " isimli üye kayýdý yapýldý.");
	}

	@Override
	public void update(Member member) {
		
		System.out.println( member.getFirstName() + " " + member.getLastName()  + " isimli üye kayýdý güncellendi.");
		
	}

	@Override
	public void delete(Member member) {
		
		System.out.println( member.getFirstName() + " " + member.getLastName()  + " silindi.");
		
	}


}
