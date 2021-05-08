
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

		String mainMessage = "\t-  Ho�geldiniz -\n\n" + "1- Giri�\n" + "2- Google Hesab�n�zla Giri� Yap�n.\n"
				+ "3- Kay�t\n" + "4- ��k��\n" + "0- Mesaj G�nder\n\n" + "\t Olmas� Gerekenler :\n\n"
				+ "1- E-posta do�ru bi�imi  ==> test@test.com\n" + "2- �ifreniz en az 6 karakter olmal�d�r.\n"
				+ "3- Ad ve Soyad alan� 2 karakterden uzun olmal�d�r.";

		String loggedMessage = "\t Ho�geldiniz   \n\n" + "1- Hesab�m� Sil\n" + "2- Oturumu Kapat\n"
				+ "0- Mesaj G�nder\n";

		System.out.println(mainMessage);
		int key;
		while (true) {
			System.out.print("Yap�lacak ��lemi Se�iniz: ");
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
				System.out.println("Hatal� ��lem Yapt�n�z.");
			}
			System.out.println(loggedMessage);
			loggedloop: while (loggedIn) {
				System.out.print("Yap�lacak ��lemi Se�iniz: ");
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
					System.out.println("Hatal� ��lem Yapt�n�z");
				}
			}
		}
	}

	public static void register() {
		scan.nextLine();
		String firstName, lastName, mail, password;
		System.out.print("Ad�n�z� Giriniz:");
		firstName = scan.nextLine();
		System.out.print("Soyisim Giriniz: ");
		lastName = scan.nextLine();
		System.out.print("E-mail Adresinizi Giriniz: ");
		mail = scan.nextLine();
		System.out.print("�ifrenizi Giriniz: ");
		password = scan.nextLine();
		User user = new User(UserProductDao.getLastId() + 1, firstName, lastName, mail, password);
		loggedIn = authManager.register(user);
	}

	public static void login() {
		scan.nextLine();
		String mail, password;
		System.out.print("E-mail Giriniz ");
		mail = scan.nextLine();
		System.out.print("�ifrenizi Giriniz");
		password = scan.nextLine();
		User user = new User(mail, password);
		loggedIn = authManager.login(user);
	}

	public static void loginWithGoogle() {
		scan.nextLine();
		String mail, password;
		System.out.print("E-mail Giriniz ");
		mail = scan.nextLine();
		System.out.print("�ifrenizi Giriniz");
		password = scan.nextLine();
		User user = new User(mail, password);
		loggedIn = authManager.loginWithGoogle(user);
	}

	public static void deleteAccount() {
		System.out.println("Silindi.");
	}
}
