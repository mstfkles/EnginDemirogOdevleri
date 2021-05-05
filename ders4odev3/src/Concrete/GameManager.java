package Concrete;

import Abstract.GameService;
import Entities.Campaing;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " adlý oyun , oyun sistemine baþarýlý bir þekilde eklendi. \n");

	}

	@Override
	public void uptade(Game game) {
		System.out.println(game.getGameName() + " adlý oyun güncellendi.");

	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " adlý oyun sistemden silindi .");

	}

	@Override
	public void sale(Gamer gamer, Game game, Campaing campaing) {

		System.out.println(game.getGameName() + " isimli oyun " + gamer.getFirstName() + " oyuncusu tarafýndan"
				+ campaing.getName() + " ile "
				+ (game.getGamePrice() - (game.getGamePrice() * campaing.getDiscountRate() / 100))
				+ " fiyata satýn alýnmýþtýr. Ýyi Tatiller.");

	}

}