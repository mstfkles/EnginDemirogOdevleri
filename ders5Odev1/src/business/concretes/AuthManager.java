package business.concretes;

import business.abstracks.AuthService;
import business.abstracks.UserService;
import business.abstracks.VerificationService;
import core.LoginWithGmailService;
import entities.concretes.User;

public class AuthManager implements AuthService {

	private UserService userService;
	private VerificationService verificationService;
	private LoginWithGmailService loginWithGmailService;

	public AuthManager(UserService userService, VerificationService verificationService,
			LoginWithGmailService loginWithGmailService) {
		this.userService = userService;
		this.verificationService = verificationService;
		this.loginWithGmailService = loginWithGmailService;
	}

	@Override
	public boolean login(User user) {
		User userToCheck = this.userService.getByMail(user.getMail());
		if (userToCheck == null) {
			System.out.println("Kay�tl� kullan�c� bulunamad�");
			return false;
		}
		if (!user.getPassword().equals(userToCheck.getPassword())) {
			System.out.println("Eposta Veya �ifreniz Yanl��.");
			return false;
		}
		System.out.println("Giri� Ba�ar�l�.");
		return true;
	}

	@Override
	public boolean register(User user) {

		if (!(this.userService.checkMailCorrect(user.getMail()) && this.userService.getByMail(user.getMail()) == null
				&& user.getFirstName().length() >= 2 && user.getLastName().length() >= 2
				&& user.getPassword().length() >= 6)) {
			System.out.println("Giri� Ba�ar�s�z.");
			return false;
		}
		System.out.println("Mail.");
		if (!verificationService.verificate(user.getMail())) {
			System.out.println("Do�rulama kodu yanl��!");
			return false;
		}
		System.out.println("Hesab�n�z onayland� ve kaydoldunuz.");
		this.userService.add(user);
		return true;

	}

	@Override
	public boolean loginWithGoogle(User user) {
		if (!loginWithGmailService.login(user.getMail(), user.getPassword())) {
			System.out.println("Google bilgilerinizi onaylamad�.");
			return false;
		}
		if (this.userService.getByMail(user.getMail()) == null) {
			this.userService.add(user);
		}
		System.out.println("Giri� Ba�ar�l�.");
		return true;
	}
}