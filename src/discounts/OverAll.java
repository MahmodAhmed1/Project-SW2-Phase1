package discounts;

import services.Services;

public class OverAll extends Discounts {

	public OverAll (Services service) {
		this.service=service;
		
	}
	
	
	public double totalCost()
	{
		return service.totalCost() * 0.8;
		
	}
	

}
