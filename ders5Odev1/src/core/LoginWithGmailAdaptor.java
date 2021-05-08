package core;

import googleService.*;

public class LoginWithGmailAdaptor implements LoginWithGmailService{

	@Override
	public boolean login(String mail, String password) {
		
		LoginGmail loginWithGmail = new LoginGmail();
		return loginWithGmail.login(mail,password);
	}

}
