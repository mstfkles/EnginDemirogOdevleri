package Abstract;

import Entities.Gamer;

public abstract class BaseGamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu bilgileri kaydedildi :" + gamer.getFirstName().toUpperCase() + " "
				+ gamer.getLastName().toUpperCase());

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu bilgileri güncellendi :" + gamer.getFirstName());

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu bilgileri silindi :" + gamer.getFirstName());

	}

}