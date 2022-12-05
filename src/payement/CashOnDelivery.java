package payement;


public class CashOnDelivery implements Payment{
	
	double cash=0;

	public CashOnDelivery() {
		// TODO Auto-generated constructor stub
	}

	public Boolean pay(double money) {
		Boolean success=false;
		
		cash+=money;
		
		return success;
		
	}

}
