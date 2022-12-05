package boundary;

import javafx.util.Pair;
import Account.UserAccount;
import services.Services;
import controllers.DiscountController;
import controllers.ServiceController;
import controllers.TransactionsController;
import payement.CreditCard;
import payement.Payment;
import payement.Wallet;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		double amount=10;
		
		Boolean servicePaid;
		
		Payment creditcard= new CreditCard(amount);
		Payment wallet= new Wallet(amount);
		
		UserAccount currentUser= new UserAccount(creditcard,wallet);
		
		ServiceController SC= new ServiceController(currentUser);
		TransactionsController TC= new TransactionsController(currentUser);
		DiscountController DC= new DiscountController();
		
		
		
		Screen screen=new Screen(SC,TC,DC);
		int idOfService;
		idOfService=screen.displayServices();
		
		int idOfServicePro=screen.displayServiceProviders(idOfService);
		Pair<String,Double> p=SC.selectServiceProvider(idOfService,idOfServicePro);
		
		

	}

}
