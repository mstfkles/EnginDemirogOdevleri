package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;
import Entities.Game;

public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaing) {
		System.out.println("Ýndirim oraný % :" + campaing.getDiscountRate() + "\n" + campaing.getName()
				+ " isimli kampanya oluþturuldu.");

	}

	@Override
	public void uptade(Campaing campaing) {
		System.out.println("Ýndirim oraný % :" + campaing.getDiscountRate() + " " + campaing.getName()
				+ " isimli kampanya güncellendi");

	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println("Ýndirim oraný % :" + campaing.getDiscountRate() + " " + campaing.getName()
				+ " isimli kampanya silindi");

	}

	@Override
	public void sale(Campaing campaing, Game game) {
		System.out.println(
				"Oyun Bilgileri : " + "\n " + game.getGameName() + " adlý oyuna indirim uygulandý.\nOyunun yeni fiyatý :"
						+ (game.getGamePrice() - (game.getGamePrice() * campaing.getDiscountRate() / 100))+" TL");

	}

}