package Concrete;


import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService
{
	 ;
	public SalesManager( ) 
	{
		
	}

	@Override
	public void sellNormal(Game game, Gamer gamer)
	{
		
		System.out.println(game.getName()+" adl� oyunu"+gamer.getFirtsName()+" sat�n adl�. Te�ekk�rler "+gamer.getFirtsName()+" Oyun �creti ektedir.");
		System.out.println("Al��veri� tutar�n�z : "+game.getPrice());
		
		
		
		
	}

	@Override
	public void sellWithCampaign(Game game, Gamer gamer, Campaign campaign) 
	{
		
		System.out.println(game.getName()+" adl� oyunu "+campaign.getName()+" kampanyas� ile "+gamer.getFirtsName()+" sat�n adl�. Te�ekk�rler "+gamer.getFirtsName()+" Oyun �creti ektedir.");
		System.out.println("Al��veri� tutar�n�z : "+(game.getPrice()-(game.getPrice()*campaign.getDiscount()/100)));
		
	
	}

}
