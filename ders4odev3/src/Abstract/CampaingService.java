package Abstract;

import Entities.Campaing;
import Entities.Game;

public interface CampaingService {

	void add(Campaing campaing);

	void uptade(Campaing campaing);

	void delete(Campaing campaing);

	void sale(Campaing campaing, Game game);

}
