package payement;


public class Wallet implements Payment{
	
	public double walletCredit; 

	public Wallet(double walletCredit) {
		this.walletCredit=walletCredit;
		// TODO Auto-generated constructor stub
	}

	public Boolean pay(double money) {
		Boolean success=false;
		
		if(walletCredit>=money)
		{
			walletCredit-=money;	
			success=true;
		}
		
		return success;
		
	}
	
	public double getWalletCredit()
	{
		return walletCredit;
	}

}
