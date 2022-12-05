package controllers;

import payement.RefundRequest;
import transactions.CompleteTransactions;
import transactions.RefundTransactions;
import Account.UserAccount;
import boundary.Screen;
import serviceProviders.DonationsPro;
import serviceProviders.InternetPaymentPro;
import serviceProviders.LandlinePro;
import serviceProviders.MobileRechargePro;

import java.util.ArrayList;

public class TransactionsController extends Controllers{
	
	Screen screen;
	
	UserAccount currentUser;
	public int currentIDofTrans=0;
	
	
	
	ArrayList<RefundRequest> listOfRequests= new ArrayList<RefundRequest>();
	ArrayList<RefundTransactions> listOfRefundTrans= new ArrayList<RefundTransactions>();
	ArrayList<CompleteTransactions> listOfCompleteTrans= new ArrayList<CompleteTransactions>();
	
	
	RefundRequest RR= new RefundRequest();

	public TransactionsController(UserAccount currentUser) 
	{
		this.currentUser=currentUser;
	}
	
	public void setScreen(Screen screen)
	{
		this.screen=screen;

	}
	
	public void addTrans_MR(Boolean servicePaid, UserAccount user, MobileRechargePro MR)
	{
		if(servicePaid)
		{
			CompleteTransactions ct=new CompleteTransactions();
			ct.transID=currentIDofTrans;
			ct.currentUser=user;
			ct.nameOfServicePro=MR.name;
			ct.amountPaid=MR.cost;
			listOfCompleteTrans.add(ct);
			currentIDofTrans++;
		}
		
		
	}
	
	public void addTrans_IP(Boolean servicePaid, UserAccount user, InternetPaymentPro IP)
	{
		if(servicePaid)
		{
			CompleteTransactions ct=new CompleteTransactions();
			ct.transID=currentIDofTrans;
			ct.currentUser=user;
			ct.nameOfServicePro=IP.name;
			ct.amountPaid=IP.cost;
			listOfCompleteTrans.add(ct);
			currentIDofTrans++;
		}
	}
	
	public void addTrans_L(Boolean servicePaid, UserAccount user, LandlinePro L)
	{
		if(servicePaid)
		{
			CompleteTransactions ct=new CompleteTransactions();
			ct.transID=currentIDofTrans;
			ct.currentUser=user;
			ct.nameOfServicePro=L.name;
			ct.amountPaid=L.cost;
			listOfCompleteTrans.add(ct);
			currentIDofTrans++;
		}
	}
	
	public void addTrans_D(Boolean servicePaid, UserAccount user, DonationsPro D)
	{
		if(servicePaid)
		{
			CompleteTransactions ct=new CompleteTransactions();
			ct.transID=currentIDofTrans;
			ct.currentUser=user;
			ct.nameOfServicePro=D.name;
			ct.amountPaid=D.cost;
			listOfCompleteTrans.add(ct);
			currentIDofTrans++;
		}
	}

}
