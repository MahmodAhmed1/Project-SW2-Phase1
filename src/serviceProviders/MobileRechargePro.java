package serviceProviders;

import java.util.ArrayList;

import handler.MobileRechargeHandler;

public abstract class MobileRechargePro{
	
	MobileRechargeHandler myHandler;
	public String name;
	public double cost;
	public int id;
	
	

	public MobileRechargePro() {
		
		
		
		
	}

	public void setCost(double cost) {
		this.cost=cost;
		// TODO Auto-generated method stub
		
	}
	
	public String getName()
	{
		return name;
	}
	
	

}

