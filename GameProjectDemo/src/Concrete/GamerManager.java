package Concrete;

import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService
{

	@Override
	public void add(Gamer gamer)
	{
		System.out.println("Oyuncu kayd� ba�ar�l� !");
		
	}

	@Override
	public void delete(Gamer gamer) 
	{
		System.out.println("Oyuncu kayd� silindi !");
		
	}

	@Override
	public void update(Gamer gamer)
	{
		System.out.println(gamer.getFirtsName()+"Oyuncu kayd� g�ncellendi !");
		
	}
}
