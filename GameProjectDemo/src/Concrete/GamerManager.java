package Concrete;

import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService
{

	@Override
	public void add(Gamer gamer)
	{
		System.out.println("Oyuncu kaydý baþarýlý !");
		
	}

	@Override
	public void delete(Gamer gamer) 
	{
		System.out.println("Oyuncu kaydý silindi !");
		
	}

	@Override
	public void update(Gamer gamer)
	{
		System.out.println(gamer.getFirtsName()+"Oyuncu kaydý güncellendi !");
		
	}
}
