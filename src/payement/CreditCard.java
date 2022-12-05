package payement;


public class CreditCard implements Payment{
	
	public double credit;

	public CreditCard(double credit) {
		this.credit=credit;
		//  Auto-generated constructor stub
	}

	public Boolean pay(double money) {
		Boolean success=false;
		if(credit>=money)
		{
			credit-=money;	
			success=true;
		}
		
		return success;
	}
	
	public double getCredit()
	{
		return credit;
	}

}
