package services;

import java.util.ArrayList;

import serviceProviders.DonationsPro;
import serviceProviders.InternetPaymentPro;
import serviceProviders.LandlinePro;
import serviceProviders.MobileRechargePro;

public abstract class Services {
	
//	public ArrayList<MobileRechargePro> listOfMobileRechargePro= new ArrayList<MobileRechargePro>();
//	public ArrayList<LandlinePro> listOfLandlinePro= new ArrayList<LandlinePro>();


	
	public String name;
	public double cost;
	public int id;

	public Services()
	{};
	
	public double totalCost()
	{
		return cost;
		
	}

	public ArrayList<MobileRechargePro> listOf_MRProviders() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<InternetPaymentPro> listOf_IPProviders() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<LandlinePro> listOf_LLProviders() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<DonationsPro> listOf_DProviders() {
		// TODO Auto-generated method stub
		return null;
	}

	public void viewMyProviders() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	//ArrayList<Services> 
	
//	public ArrayList<ServiceProviders> getList()
//	{
//		return listOfProviders;
//	}
	

}
