import Adaptors.MernisServiceAdaptor;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.MemberManager;
import Concrete.OrderManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;
import Entities.Order;

public class Main {

	public static void main(String[] args) {
		
		Member member=new Member();
		
		member.setId(1);
		member.setFirstName("Egemen");
		member.setLastName("KILIÇ");
		member.setNationalId("33461347810");
		member.setYearOfBirth(1976);
		
		MemberManager memberManager=new MemberManager(new MernisServiceAdaptor());
		
		memberManager.save(member);
		
		Game game=new Game(1, "Age of Empires", "Tarihi klasik strateji oyunu", 29.95d);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		
		game.setUnitPrice(25.15d);
		gameManager.update(game);
		
		Campaign campaign = new Campaign(1, "Bahar Kampanyasý","Mayýs Sonuna Kadar Tüm Oyunlarda %50 Ýndirim Fýrsatý \r\n", 50);
		CampaignManager campaignManager= new CampaignManager();
		
		campaignManager.add(campaign);
		
		Order order=new Order();
		
		order.setId(1);
		order.setGame(game);
		//order.setCampaign(campaign);
		order.setMember(member);
		
		OrderManager orderManager=new OrderManager();
		
		orderManager.sell(order);
		
		
		
		

	}

}
