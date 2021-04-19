package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " isimli oyun, " + game.getUnitPrice() + " $ birim fiyattan sat��a sunuldu.");
		
	}

	@Override
	public void update(Game game) {
		
		System.out.println(game.getName() + " isimli oyuna ait bilgiler g�ncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println(game.getName() + " isimli oyun, sat��a kapat�ld�.");
		
	}

}
