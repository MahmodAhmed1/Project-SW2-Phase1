package serviceProviders;

import handler.DonationsHandler;

public abstract class DonationsPro{
	
	DonationsHandler myHandler;
	public String name;
	public double cost;
	public int id;

	public DonationsPro() {
		
		//form= new DonationsHandler();
		// TODO Auto-generated constructor stub
	}

	public void setCost(double cost) {
		this.cost=cost;
		
		// TODO Auto-generated method stub
		
	}

}
