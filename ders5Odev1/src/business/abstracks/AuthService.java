package business.abstracks;

import entities.concretes.User;

public interface AuthService {
	
	boolean login(User user);
	boolean register(User user);
	boolean loginWithGoogle(User user);
}
