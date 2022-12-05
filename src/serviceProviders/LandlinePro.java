package serviceProviders;


import handler.LandlineHandler;

public abstract class LandlinePro{
	
	LandlineHandler myHandler;
	public String name; 
	public double cost;
	public int id;

	public LandlinePro() {
		
	
	}

	public void setCost(double cost) {
		this.cost=cost;
		// TODO Auto-generated method stub
		
	}

}
