package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService
{

	@Override
	public void add(Game game) {
		System.out.println("K�t�phanenize eklenen oyun : "+game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("K�t�phanenizden ��kar�lan oyun : "+game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("K�t�phanenizde bir adet oyun g�ncellendi  : "+game.getName());
		
	}

}
