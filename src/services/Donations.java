package services;



import java.util.ArrayList;

import serviceProviders.CancerHospital;
import serviceProviders.DonationsPro;
import serviceProviders.InternetPaymentPro;
import serviceProviders.NGO;
import serviceProviders.Schools;
import services.Services;

public class Donations extends Services{
	
	String name="Donations service";
	
	public ArrayList<DonationsPro> listOfDonationsPro= new ArrayList<DonationsPro>();

	

	public Donations() {
		
		id=4;
		
		DonationsPro cancerHos= new CancerHospital();
		cancerHos.name="Cancer Hospital";
		cancerHos.setCost(10);
		
		DonationsPro schools= new Schools();
		schools.name="Schools";
		schools.setCost(20);
		
		DonationsPro NGO= new NGO();
		NGO.name="NGO";
		NGO.setCost(30);
		
		
		listOfDonationsPro.add(cancerHos);
		listOfDonationsPro.add(schools);
		listOfDonationsPro.add(NGO);
		
		
	}
	
	@Override
	public ArrayList<DonationsPro> listOf_DProviders()
	{
		return listOfDonationsPro;
	}
	
	public void viewMyProviders()
	{
		for(Object var: listOfDonationsPro)
		{
			int i=1;
			System.out.print(i + "" + "- ");
			System.out.println(((DonationsPro)var).name);
			i++;
		}
		
	}
	
	

}
