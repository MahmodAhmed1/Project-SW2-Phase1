package Account;

import boundary.Screen;
import payement.CreditCard;
import payement.Payment;
import payement.RefundRequest;
import payement.Wallet;

public class UserAccount extends Account{
	
//	public Payment payment;
	
	Payment creditCard;
	Payment wallet;
	RefundRequest RR;

	public UserAccount(Payment creditCard, Payment wallet) {
		
		this.creditCard=creditCard;
		this.wallet=wallet;
	
		
	}
	
	
	
	public UserAccount() {
		// TODO Auto-generated constructor stub
	}



	public void requestRefund(int ID)
	{
		RR= new RefundRequest();
		RR.transID=ID;
	}
	
	
	
	
	


}
