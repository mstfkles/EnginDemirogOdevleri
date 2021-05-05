package Concrete;

import Abstract.GameService;
import Entities.Campaing;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " adl� oyun , oyun sistemine ba�ar�l� bir �ekilde eklendi. \n");

	}

	@Override
	public void uptade(Game game) {
		System.out.println(game.getGameName() + " adl� oyun g�ncellendi.");

	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " adl� oyun sistemden silindi .");

	}

	@Override
	public void sale(Gamer gamer, Game game, Campaing campaing) {

		System.out.println(game.getGameName() + " isimli oyun " + gamer.getFirstName() + " oyuncusu taraf�ndan"
				+ campaing.getName() + " ile "
				+ (game.getGamePrice() - (game.getGamePrice() * campaing.getDiscountRate() / 100))
				+ " fiyata sat�n al�nm��t�r. �yi Tatiller.");

	}

}