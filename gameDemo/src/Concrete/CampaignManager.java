package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("\r\nBug�ne �zel yeni eklenen f�rsatlar: \r\n" + 
					"-----------------------------------------\r\n" +
					campaign.getName() + "\r\n" +
					campaign.getDescription()
				);
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� sona erdi..");
		
	}

}
