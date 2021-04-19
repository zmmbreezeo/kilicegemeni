package Entities;

import java.util.Date;
import Abstract.Entity;

public class Order implements Entity{
	
	private int id;
	private Date orderDate;
	private Member member;
	private Game game;
	private Campaign campaign;
	private double sellingPrice;
	
	public Order() {
		super();
	}

	public Order(int id, Date orderDate, Member member, Game game, Campaign campaign, double sellingPrice) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.member = member;
		this.game = game;
		this.campaign = campaign;
		this.sellingPrice = sellingPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public double getSellingPrice() {
		if (campaign!=null) {
			return game.getUnitPrice()*((100-campaign.getDiscount())/100);
		}
		
		else {
			return game.getUnitPrice();
		}
		
	}

	
	
}

	