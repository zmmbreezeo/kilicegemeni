package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " isimli oyun, " + game.getUnitPrice() + " $ birim fiyattan satýþa sunuldu.");
		
	}

	@Override
	public void update(Game game) {
		
		System.out.println(game.getName() + " isimli oyuna ait bilgiler güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println(game.getName() + " isimli oyun, satýþa kapatýldý.");
		
	}

}
