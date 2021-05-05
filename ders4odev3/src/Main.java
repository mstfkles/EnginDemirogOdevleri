import java.time.LocalDate;

import Abstract.BaseGamerManager;
import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Entities.Campaing;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1, "Mustafa", "Keleþ", LocalDate.of(1998, 07, 01), "23831041694");
		Gamer gamer2 = new Gamer(2, "Engin", "Demiroð", LocalDate.of(1985, 04, 04), "23870080093");
		Gamer[] gamers = { gamer1 };
		BaseGamerManager baseGamerManager = new GamerManager(new GamerCheckManager());
		baseGamerManager.add(gamer1);
		baseGamerManager.add(gamer2);
		System.out.println("\n");

		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Call of Duty: Warzone");
		game1.setGamePrice(1250);

		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("Need for Speed: Most Wanted 2 ");
		game2.setGamePrice(1500);

		Campaing campaing = new Campaing();
		campaing.setId(1998);
		campaing.setName(" Sömestir Tatil Kampanyasý");
		campaing.setDiscountRate(25);

		System.out.println("Kampanya oraný :" + " % " + campaing.getDiscountRate());
		System.out.println("Kampanya adý :" + campaing.getName());
		System.out.println("\n");

		CampaingManager campaingManager = new CampaingManager();
		campaingManager.add(campaing);
		campaingManager.sale(campaing, game1);
		System.out.println("\n");

		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.sale(gamer1, game1, campaing);

	}

}
