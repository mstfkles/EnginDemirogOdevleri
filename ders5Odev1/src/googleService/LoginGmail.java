package googleService;

import java.util.ArrayList;
import java.util.List;

public class LoginGmail {

	static List<Gmail> gmails;

	public LoginGmail() {
		gmails = new ArrayList<>();
		gmails.add(new Gmail("Test", "test", "test@gmail.com", "12345"));
	}

	public boolean login(String mail, String password) {
		if (find(mail) != null && find(mail).getPassword().equals(password)) {
			return true;
		}
		return false;
	}

	public Gmail find(String mail) {
		Gmail gmailToReturn = LoginGmail.gmails.stream().filter((user) -> user.getMail().equals(mail)).findFirst()
				.orElse(null);
		return gmailToReturn;
	}

}
