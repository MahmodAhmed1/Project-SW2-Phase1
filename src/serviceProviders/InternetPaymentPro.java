package serviceProviders;

import handler.InternetPaymentHandler;

public abstract class InternetPaymentPro{
	
	InternetPaymentHandler myHandler;
	public String name;
	public double cost;
	public int id;

	public InternetPaymentPro() {
		
		//form=new InternetPaymentHandler();
		
		// TODO Auto-generated constructor stub
	}

	public void setCost(double cost) {
		this.cost=cost;
		// TODO Auto-generated method stub
		
	}

}
