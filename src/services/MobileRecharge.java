package services;

import java.util.ArrayList;

import serviceProviders.EtisalatMR;
import serviceProviders.LandlinePro;
import serviceProviders.MobileRechargePro;
import serviceProviders.OrangeMR;
import serviceProviders.VodafoneMR;
import serviceProviders.WeMR;
import services.Services;

public class MobileRecharge extends Services{
	
	String name="Mobile Recharge service";
	
	
	public ArrayList<MobileRechargePro> listOfMobileRechargePro= new ArrayList<MobileRechargePro>();

	public MobileRecharge() {
		
		id=1;
		
		
		
		MobileRechargePro vod= new VodafoneMR();
		vod.name="Vodafone";
		vod.setCost(10);
		
		MobileRechargePro et= new EtisalatMR();
		et.name="Etisalat";
		et.setCost(20);
		
		MobileRechargePro we= new WeMR();
		we.name="We";
		we.setCost(30);
		
		MobileRechargePro orange= new OrangeMR();
		orange.name="Orange";
		orange.setCost(15);
		
		
		listOfMobileRechargePro.add(vod);
		listOfMobileRechargePro.add(et);
		listOfMobileRechargePro.add(we);
		listOfMobileRechargePro.add(orange);
		
		
	}
	
	
	@Override
	public ArrayList<MobileRechargePro> listOf_MRProviders()
	{
		return listOfMobileRechargePro;
	}
	
	public void viewMyProviders()
	{
		for(Object var: listOfMobileRechargePro)
		{
			int i=1;
			System.out.print(i + "" + "- ");
			System.out.println(((MobileRechargePro)var).name);
			i++;
		}
		
	}
	
	
	

}
