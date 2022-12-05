package Account;
import registration.UserRegistration;

import controllers.DiscountController;
import controllers.TransactionsController;
import controllers.ServiceController;

public class AdminAccount extends Account{
	
	ServiceController SC;
	TransactionsController TC;
	DiscountController DC;
	UserRegistration U;

	public AdminAccount(ServiceController SC,TransactionsController RC, DiscountController DC) {
		this.TC=TC;
		this.SC=SC;
		this.DC=DC;
		
		
	}
	
	

}
