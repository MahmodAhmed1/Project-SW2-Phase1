package boundary;

import java.util.*;

import controllers.DiscountController;
import controllers.ServiceController;
import controllers.TransactionsController;
import serviceProviders.DonationsPro;
import serviceProviders.InternetPaymentPro;
import serviceProviders.LandlinePro;
import serviceProviders.MobileRechargePro;
import services.Services;
import javafx.util.Pair;

public class Screen {
	
	ServiceController SC;
	TransactionsController TC;
	DiscountController DC;
	
	public Pair<String,String> logInForm()
	{
		String username, password;
		
		
		System.out.println("Username: ");
		Scanner input1=new Scanner(System.in);
		username=input1.nextLine();
		
		System.out.println("Password: ");
		Scanner input2=new Scanner(System.in);
		password=input2.nextLine();
		
		Pair <String,String> p=new Pair <String,String>(username,password);
		return p;
		
	};
	
	public Pair<String,String> signUpForm()
	{
        String username, password;
		
		
		System.out.println("Username: ");
		Scanner input1=new Scanner(System.in);
		username=input1.nextLine();
		
		System.out.println("Password: ");
		Scanner input2=new Scanner(System.in);
		password=input2.nextLine();
		
		
		Pair <String,String> p=new Pair <String,String>(username,password);
		return p;
		
	};
	
	public int displayServices()
	{
		int choice, id;
		
		for(int i=0;i<SC.listOfServices.size();i++)
		{
			System.out.println((i+1)+ "- " + SC.listOfServices.get(i).name);
		}
		Scanner input=new Scanner(System.in);
		choice=input.nextInt();
		
		choice--;
		
		id=SC.listOfServices.get(choice).id;
		
		return id;
		
		
	};
	
	public int displayServiceProviders(int id)
	{
		int choice;
		Object pro = null;
		
		switch(id)
		{
		case 1:
			
			for(int i=0;i<SC.listOfServices.size();i++)
			{
				if(SC.listOfServices.get(i).id==1)
				{
					SC.listOfServices.get(i).viewMyProviders();
//					ArrayList<MobileRechargePro> list=SC.listOfServices.get(i).listOf_MRProviders();
//					for ( Object var : list)
//						System.out.println(((MobileRechargePro) var).name);
					MobileRechargePro MR = null;
					pro=MR;
//				
				}
			}
		case 2:
			for(int i=0;i<SC.listOfServices.size();i++)
			{
				if(SC.listOfServices.get(i).id==2)
				{
					SC.listOfServices.get(i).viewMyProviders();
					InternetPaymentPro IP = null;
					pro=IP;
				}
			}
		case 3:
			for(int i=0;i<SC.listOfServices.size();i++)
			{
				if(SC.listOfServices.get(i).id==3)
				{
					SC.listOfServices.get(i).viewMyProviders();
					LandlinePro L = null;
					pro=L;
				}
			}
		case 4:
			for(int i=0;i<SC.listOfServices.size();i++)
			{
				if(SC.listOfServices.get(i).id==4)
				{
					SC.listOfServices.get(i).viewMyProviders();
					DonationsPro D = null;
					pro=D;
				}
			}
			
		
		}
		
//		if(pro instanceof MobileRechargePro)
//		{
//			
//		}
//		
		
		
		
		System.out.println("Please enter the number of the service provider you want: ");
			
		Scanner input=new Scanner(System.in);
		choice=input.nextInt();
		
		return choice;
		
		//pro.getClass();
		
	};
	
	public int displayPaymentOptions()
	{
		int choice;
		System.out.println("How would you like to pay for this service: ");
		System.out.println("1- credit card");
		System.out.println("2- wallet");
		
		Scanner input=new Scanner(System.in);
		choice=input.nextInt();
		
		return choice;
		
	}

	public Screen(ServiceController SC,TransactionsController TC,DiscountController DC) {
		this.SC=SC;
		this.TC=TC;
		this.DC=DC;
		
		// TODO Auto-generated constructor stub
	}

}
