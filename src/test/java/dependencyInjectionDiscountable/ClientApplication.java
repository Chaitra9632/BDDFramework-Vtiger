package dependencyInjectionDiscountable;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ClientApplication {
	
	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new AppModule());
		Discountable dis = injector.getInstance(FlipkartDiscount.class);
		dis.getDiscount("Amazon", "20%");
	}

}
