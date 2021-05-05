package Concrete;

import Abstract.BaseGamerManager;
import Abstract.GamerChechkService;
import Entities.Gamer;

public class GamerManager extends BaseGamerManager {
	GamerChechkService gamerCheckService;

	public GamerManager(GamerChechkService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfPerson(gamer)) {
			super.add(gamer);
		} else {
			System.out.println("Oyuncu eklenemedi.");
		}

	}

	@Override
	public void update(Gamer gamer) {
		if (gamerCheckService.checkIfPerson(gamer)) {
			super.update(gamer);
		} else {
			System.out.println("Oyuncu bilgileri güncellenemedi.");
		}

	}

	@Override
	public void delete(Gamer gamer) {
		if (gamerCheckService.checkIfPerson(gamer)) {
			super.delete(gamer);
		} else {
			System.out.println("Oyuncu silinemedi.");
		}

	}

}
