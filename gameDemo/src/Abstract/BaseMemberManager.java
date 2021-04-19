package Abstract;

import Entities.Member;

public abstract class BaseMemberManager implements MemberService {

	@Override
	public void save(Member member) {
		
		System.out.println( member.getFirstName() + " " + member.getLastName()  + " isimli �ye kay�d� yap�ld�.");
	}

	@Override
	public void update(Member member) {
		
		System.out.println( member.getFirstName() + " " + member.getLastName()  + " isimli �ye kay�d� g�ncellendi.");
		
	}

	@Override
	public void delete(Member member) {
		
		System.out.println( member.getFirstName() + " " + member.getLastName()  + " silindi.");
		
	}


}
