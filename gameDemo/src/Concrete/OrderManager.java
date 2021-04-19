package Concrete;

import Abstract.OrderService;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void sell(Order order) {
		System.out.println
		( order.getGame().getName() + " isimli oyun, " + order.getMember().getFirstName()+ " " + order.getMember().getLastName() +
				" isimli üyeye " + order.getSellingPrice() + " $ + KDV birim fiyattan satýldý."
				);
		
	}


}
