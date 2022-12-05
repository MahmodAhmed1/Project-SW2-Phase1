package registration;

import java.util.ArrayList;

import javafx.util.Pair;
import boundary.Screen;
import Account.AdminAccount;
import Account.UserAccount;

public class AdminRegistration extends Registration{
	
	ArrayList<AdminAccount> listOfAdmins= new ArrayList<AdminAccount>();
	
	public Boolean logIn()
	{
		Boolean exist=false;
		Pair <String,String> p=screen.logInForm();
		
		for(AdminAccount u:listOfAdmins)
		{
			if(u.getUsername()==p.getKey()  && u.getPassword()==p.getValue())
			{
				exist=true;
			}
		}
		
		return exist;
	};

	public AdminRegistration(Screen screen) {
		this.screen=screen;
	}

}
