package Concrete;

import Abstract.BaseMemberManager;
import Abstract.MemberCheckService;
import Entities.Member;

public class MemberManager extends BaseMemberManager {

	private MemberCheckService memberCheckService;
	
	public MemberManager(MemberCheckService memberCheckService) {
		super();
		this.memberCheckService = memberCheckService;
	}

	@Override
	public void save(Member member) {
		
		if (memberCheckService.checkIfRealPerson(member)) {
			super.save(member);
		}
		
		else
			
		{
			System.out.println("Geçerli bir TC Kimlik Numarasý girilmediði için kayýt iþlemi gerçekleþtirilemedi.");
		}
		
		
	}
	
	

}
