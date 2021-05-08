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
		
		System.out.println(game.getName()+" adlý oyunu"+gamer.getFirtsName()+" satýn adlý. Teþekkürler "+gamer.getFirtsName()+" Oyun ücreti ektedir.");
		System.out.println("Alýþveriþ tutarýnýz : "+game.getPrice());
		
		
		
		
	}

	@Override
	public void sellWithCampaign(Game game, Gamer gamer, Campaign campaign) 
	{
		
		System.out.println(game.getName()+" adlý oyunu "+campaign.getName()+" kampanyasý ile "+gamer.getFirtsName()+" satýn adlý. Teþekkürler "+gamer.getFirtsName()+" Oyun ücreti ektedir.");
		System.out.println("Alýþveriþ tutarýnýz : "+(game.getPrice()-(game.getPrice()*campaign.getDiscount()/100)));
		
	
	}

}
