package services;

import java.util.ArrayList;

import serviceProviders.EtisalatIP;
import serviceProviders.InternetPaymentPro;
import serviceProviders.LandlinePro;
import serviceProviders.OrangeIP;
import serviceProviders.VodafoneIP;
import serviceProviders.WeIP;
import services.Services;

public class InternetPayment extends Services{
	
	String name="Internet Payment service";
	
	public ArrayList<InternetPaymentPro> listOfInternetPaymentPro= new ArrayList<InternetPaymentPro>();

	

	public InternetPayment() {
		
		id=2;
		
		
		InternetPaymentPro vod= new VodafoneIP();
		vod.name="Vodafone";
		vod.setCost(10);
		
		InternetPaymentPro et= new EtisalatIP();
		et.name="Etisalat";
		et.setCost(20);
		
		InternetPaymentPro we= new WeIP();
		we.name="We";
		we.setCost(30);
		
		InternetPaymentPro orange= new OrangeIP();
		orange.name="Orange";
		orange.setCost(15);
		
		
		listOfInternetPaymentPro.add(vod);
		listOfInternetPaymentPro.add(et);
		listOfInternetPaymentPro.add(we);
		listOfInternetPaymentPro.add(orange);

		
	}
	
	@Override
	public ArrayList<InternetPaymentPro> listOf_IPProviders()
	{
		return listOfInternetPaymentPro;
	}
	
	public void viewMyProviders()
	{
		for(Object var: listOfInternetPaymentPro)
		{
			int i=1;
			System.out.print(i + "" + "- ");
			System.out.println(((InternetPaymentPro)var).name);
			i++;
		}
		
	}
	
	

	

}
