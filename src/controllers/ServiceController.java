package controllers;


import serviceProviders.DonationsPro;
import serviceProviders.InternetPaymentPro;
import serviceProviders.LandlinePro;
import serviceProviders.MobileRechargePro;
import services.Services;
import services.LandlineServices;
import services.InternetPayment;
import services.Donations;
import services.MobileRecharge;

import java.util.*;

import javafx.util.Pair;
import Account.UserAccount;
import boundary.Screen;


public class ServiceController extends Controllers{
	
	Screen screen;
	public ArrayList<Services> listOfServices=new ArrayList <Services>();
	
	//Service controller has current user account
	
	UserAccount currentUser;
	
	Services LLS= new LandlineServices();
	Services IP= new InternetPayment();
	Services D= new Donations();
	Services MR= new MobileRecharge();
	
	

	public ServiceController(UserAccount currentUser) {
		
		this.currentUser=currentUser;
		
		listOfServices.add(LLS);
		listOfServices.add(IP);
		listOfServices.add(D);
		listOfServices.add(MR);
		
		
		
		
		
	}
	
	public void setScreen(Screen screen)
	{
		this.screen=screen;

	}
	
	public Services search(String search)
	{
		System.out.println("Please enter the name of the service: ");
		Scanner input= new Scanner(System.in);
		search=input.nextLine();
		search=search.toLowerCase();
		if(search=="mobile recharge")
		{
			return MR;
		}
		else if(search=="internet payment")
		{
			return IP;
		}
		else if(search=="landline services")
		{
			return LLS;
		}
		else if(search=="donations")
		{
			return D;
		}
		else {
			System.out.println("This service isn't available");
				return null;
		}
	}
	
	
	
	public void displayAllServices()
	{
		screen.displayServices();
	}
	
	
	public Pair<String,Double> selectServiceProvider(int idOfService,int idOfPro)
	{
		Pair<String,Double> p; 
		String name = null;
		double cost = 0;
		
		if(idOfService==1)
		{
			ArrayList<MobileRechargePro> list= MR.listOf_MRProviders();
			
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).id==idOfPro)
				{
					name=list.get(i).name;
					cost=list.get(i).cost;
				}
			}
			
		}
		
		if(idOfService==2)
		{
			ArrayList<InternetPaymentPro> list= IP.listOf_IPProviders();
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).id==idOfPro)
				{
					name=list.get(i).name;
					cost=list.get(i).cost;
				}
			}
			
		}
		
		if(idOfService==3)
		{
			ArrayList<LandlinePro> list= LLS.listOf_LLProviders();
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).id==idOfPro)
				{
					name=list.get(i).name;
					cost=list.get(i).cost;
				}
			}
			
		}
		
		if(idOfService==4)
		{
			ArrayList<DonationsPro> list= D.listOf_DProviders();
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).id==idOfPro)
				{
					name=list.get(i).name;
					cost=list.get(i).cost;
				}
			}
			
		}
		p=new Pair<String,Double>(name,cost);
		return p;
		
	}
	
	
//	public void validatePayment()
//	{
//		if(currentUser.payment)
//	}
	

//	public void servicePaid()
//	{}
}
