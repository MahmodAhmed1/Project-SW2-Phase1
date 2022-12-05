package services;

import java.util.*;

import serviceProviders.LandlinePro;
import serviceProviders.MobileRechargePro;
import serviceProviders.MonthlyReciept;
import serviceProviders.QuarterReciept;
import services.Services;


public class LandlineServices extends Services{
	
	String name="Landline service";
	
	public ArrayList<LandlinePro> listOfLandlinePro= new ArrayList<LandlinePro>();

	
	
	

	public LandlineServices() {
		
		id=3;

		LandlinePro monthlyRec= new MonthlyReciept();
		monthlyRec.name= " Monthly reciept";
		monthlyRec.setCost(10);
		
		LandlinePro quarterRec= new QuarterReciept();
		quarterRec.name="Quarter reciept";
		quarterRec.setCost(20);
		
		listOfLandlinePro.add(monthlyRec);
		listOfLandlinePro.add(quarterRec);
		
	}
	
	@Override
	public ArrayList<LandlinePro> listOf_LLProviders()
	{
		return listOfLandlinePro;
	}
	
	public void viewMyProviders()
	{
		for(Object var: listOfLandlinePro)
		{
			int i=1;
			System.out.print(i + "" + "- ");
			System.out.println(((LandlinePro)var).name);
			i++;
		}
		
	}
	
	
	
	

}
