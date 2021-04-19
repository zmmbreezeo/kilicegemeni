package Adaptors;

import Abstract.MemberCheckService;
import Entities.Member;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements MemberCheckService{

	@Override
	public boolean checkIfRealPerson(Member member) {
		
		KPSPublicSoap client=new KPSPublicSoapProxy();
		try {
			
			if (client.TCKimlikNoDogrula(Long.parseLong(member.getNationalId()), member.getFirstName().toUpperCase(), member.getLastName().toUpperCase(), member.getYearOfBirth())) {
				return true;
			}
			else {
				return false;
			}
			
			
		} catch (Exception e) {
			return false;
		}
		
	}

}
