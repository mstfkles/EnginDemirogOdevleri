
import java.util.Scanner;

import business.abstracks.UserService;
import business.concretes.AuthManager;
import business.concretes.UserManager;
import business.concretes.VerificationManager;
import core.LoginWithGmailAdaptor;
import core.VertificationMailSender;
import dataAccess.concretes.UserProductDao;
import entities.concretes.User;

public class Main {
	static boolean loggedIn;
	static Scanner scan = new Scanner(System.in);
	static UserService userService = new UserManager(new UserProductDao());
	static AuthManager authManager = new AuthManager(userService,
			new VerificationManager(new VertificationMailSender()), new LoginWithGmailAdaptor());

	public static void main(String[] args) {

		String mainMessage = "\t-  Hoþgeldiniz -\n\n" + "1- Giriþ\n" + "2- Google Hesabýnýzla Giriþ Yapýn.\n"
				+ "3- Kayýt\n" + "4- Çýkýþ\n" + "0- Mesaj Gönder\n\n" + "\t Olmasý Gerekenler :\n\n"
				+ "1- E-posta doðru biçimi  ==> test@test.com\n" + "2- Þifreniz en az 6 karakter olmalýdýr.\n"
				+ "3- Ad ve Soyad alaný 2 karakterden uzun olmalýdýr.";

		String loggedMessage = "\t Hoþgeldiniz   \n\n" + "1- Hesabýmý Sil\n" + "2- Oturumu Kapat\n"
				+ "0- Mesaj Gönder\n";

		System.out.println(mainMessage);
		int key;
		while (true) {
			System.out.print("Yapýlacak Ýþlemi Seçiniz: ");
			key = scan.nextInt();
			switch (key) {
			case 1:
				login();
				break;
			case 2:
				loginWithGoogle();
				break;
			case 3:
				register();
				break;
			case 4:
				return;
			case 0:
				System.out.println(mainMessage);
				break;
			default:
				System.out.println("Hatalý Ýþlem Yaptýnýz.");
			}
			System.out.println(loggedMessage);
			loggedloop: while (loggedIn) {
				System.out.print("Yapýlacak Ýþlemi Seçiniz: ");
				key = scan.nextInt();
				switch (key) {
				case 1:
					deleteAccount();
					break;
				case 2:
					System.out.println(mainMessage);
					loggedIn = false;
					break;
				case 0:
					System.out.println(loggedMessage);
					break;
				default:
					System.out.println("Hatalý Ýþlem Yaptýnýz");
				}
			}
		}
	}

	public static void register() {
		scan.nextLine();
		String firstName, lastName, mail, password;
		System.out.print("Adýnýzý Giriniz:");
		firstName = scan.nextLine();
		System.out.print("Soyisim Giriniz: ");
		lastName = scan.nextLine();
		System.out.print("E-mail Adresinizi Giriniz: ");
		mail = scan.nextLine();
		System.out.print("Þifrenizi Giriniz: ");
		password = scan.nextLine();
		User user = new User(UserProductDao.getLastId() + 1, firstName, lastName, mail, password);
		loggedIn = authManager.register(user);
	}

	public static void login() {
		scan.nextLine();
		String mail, password;
		System.out.print("E-mail Giriniz ");
		mail = scan.nextLine();
		System.out.print("Þifrenizi Giriniz");
		password = scan.nextLine();
		User user = new User(mail, password);
		loggedIn = authManager.login(user);
	}

	public static void loginWithGoogle() {
		scan.nextLine();
		String mail, password;
		System.out.print("E-mail Giriniz ");
		mail = scan.nextLine();
		System.out.print("Þifrenizi Giriniz");
		password = scan.nextLine();
		User user = new User(mail, password);
		loggedIn = authManager.loginWithGoogle(user);
	}

	public static void deleteAccount() {
		System.out.println("Silindi.");
	}
}
