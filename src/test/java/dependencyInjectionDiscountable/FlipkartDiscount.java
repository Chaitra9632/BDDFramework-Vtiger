package dependencyInjectionDiscountable;

public class FlipkartDiscount implements Discountable {

	@Override
	public void getDiscount(String company, String percentage) {
	
		System.out.println("Discount by "+company+"\n"+"discount got: "+percentage);
		
	}
	
	

}
