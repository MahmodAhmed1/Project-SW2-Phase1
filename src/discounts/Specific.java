package discounts;

import services.Services;

public class Specific extends Discounts {

	public Specific(Services service) {
		this.service=service;
		
	}
	
	public double totalCost()
	{
		return service.totalCost() * 0.9;
		
	}
	
	

}
