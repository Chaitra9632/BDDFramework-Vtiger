package dependencyInjectionDiscountable;

import com.google.inject.Inject;



public class MyApplication {
	
	private Discountable discount;
	
	@Inject
	public MyApplication(Discountable discount)
	{
		this.discount=discount;
	}

	public void discountNow(String comp, String per)
	{
		discount.getDiscount(comp, per);
	}
}
