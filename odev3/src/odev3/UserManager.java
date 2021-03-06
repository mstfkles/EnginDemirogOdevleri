package odev3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getUserName() + " adl? kullan?c? eklendi.");
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

	public void delete(User user) {
		System.out.println(user.getUserName() + " adl? kullan?c? silinmi?tir.");
	}

	public void deleteMultiple(User[] users) {
		for (User user : users) {
			delete(user);
		}

	}
}
