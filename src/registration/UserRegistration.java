package registration;
import java.util.*;

import javafx.util.Pair;
import boundary.Screen;
import Account.UserAccount;

public class UserRegistration extends Registration{
	
	ArrayList<UserAccount> listOfUsers= new ArrayList<UserAccount>();
	
	public Boolean logIn()
	{
		Boolean exist=false;
		Pair <String,String> p=screen.logInForm();
		
		for(UserAccount u:listOfUsers)
		{
			if(u.getUsername()==p.getKey()  && u.getPassword()==p.getValue())
			{
				exist=true;
			}
		}
		
		return exist;
	};
	
	
	public Boolean SignUp()
	{
		Boolean signIn=true;
		Pair <String,String> p=screen.logInForm();
		
		for(UserAccount u:listOfUsers)
		{
			if(u.getUsername()==p.getKey()  && u.getPassword()==p.getValue())
			{
				signIn=false;
			}
		}
		
		if(signIn)
		{
			UserAccount newUser=new UserAccount();
			newUser.setUsername(p.getKey());
			newUser.setPassword(p.getValue());
			
			listOfUsers.add(newUser);
		}
		
		return signIn;
		
	};
	

	public UserRegistration(Screen screen) {
		this.screen=screen;
		
	}

}
