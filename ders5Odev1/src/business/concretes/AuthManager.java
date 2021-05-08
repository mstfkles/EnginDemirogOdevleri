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
			System.out.println("Kayýtlý kullanýcý bulunamadý");
			return false;
		}
		if (!user.getPassword().equals(userToCheck.getPassword())) {
			System.out.println("Eposta Veya Þifreniz Yanlýþ.");
			return false;
		}
		System.out.println("Giriþ Baþarýlý.");
		return true;
	}

	@Override
	public boolean register(User user) {

		if (!(this.userService.checkMailCorrect(user.getMail()) && this.userService.getByMail(user.getMail()) == null
				&& user.getFirstName().length() >= 2 && user.getLastName().length() >= 2
				&& user.getPassword().length() >= 6)) {
			System.out.println("Giriþ Baþarýsýz.");
			return false;
		}
		System.out.println("Mail.");
		if (!verificationService.verificate(user.getMail())) {
			System.out.println("Doðrulama kodu yanlýþ!");
			return false;
		}
		System.out.println("Hesabýnýz onaylandý ve kaydoldunuz.");
		this.userService.add(user);
		return true;

	}

	@Override
	public boolean loginWithGoogle(User user) {
		if (!loginWithGmailService.login(user.getMail(), user.getPassword())) {
			System.out.println("Google bilgilerinizi onaylamadý.");
			return false;
		}
		if (this.userService.getByMail(user.getMail()) == null) {
			this.userService.add(user);
		}
		System.out.println("Giriþ Baþarýlý.");
		return true;
	}
}