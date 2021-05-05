package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;
import Entities.Game;

public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaing) {
		System.out.println("�ndirim oran� % :" + campaing.getDiscountRate() + "\n" + campaing.getName()
				+ " isimli kampanya olu�turuldu.");

	}

	@Override
	public void uptade(Campaing campaing) {
		System.out.println("�ndirim oran� % :" + campaing.getDiscountRate() + " " + campaing.getName()
				+ " isimli kampanya g�ncellendi");

	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println("�ndirim oran� % :" + campaing.getDiscountRate() + " " + campaing.getName()
				+ " isimli kampanya silindi");

	}

	@Override
	public void sale(Campaing campaing, Game game) {
		System.out.println(
				"Oyun Bilgileri : " + "\n " + game.getGameName() + " adl� oyuna indirim uyguland�.\nOyunun yeni fiyat� :"
						+ (game.getGamePrice() - (game.getGamePrice() * campaing.getDiscountRate() / 100))+" TL");

	}

}