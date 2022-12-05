package controllers;
import boundary.Screen;
import discounts.OverAll;
import discounts.Discounts;
import discounts.Specific;

public class DiscountController extends Controllers{
	
	Screen screen;
	
//	Discounts d= new OverAll();
//	Discounts s= new Specific();

	public DiscountController() {
		
		
	}
	
	public void setScreen(Screen screen)
	{
		this.screen=screen;

	}

}
