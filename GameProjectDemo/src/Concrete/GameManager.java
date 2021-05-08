package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService
{

	@Override
	public void add(Game game) {
		System.out.println("Kütüphanenize eklenen oyun : "+game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Kütüphanenizden çýkarýlan oyun : "+game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Kütüphanenizde bir adet oyun güncellendi  : "+game.getName());
		
	}

}
