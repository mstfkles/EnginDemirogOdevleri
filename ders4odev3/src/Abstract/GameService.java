package Abstract;

import Entities.Campaing;
import Entities.Game;
import Entities.Gamer;

public interface GameService {
	void add(Game game);

	void uptade(Game game);

	void delete(Game game);

	void sale(Gamer gamer, Game game, Campaing campaing);

}
