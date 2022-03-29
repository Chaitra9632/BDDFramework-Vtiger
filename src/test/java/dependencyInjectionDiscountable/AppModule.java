package dependencyInjectionDiscountable;

import com.google.inject.AbstractModule;


public class AppModule extends AbstractModule{
	
	protected void configure()
	{
		bind(Discountable.class).to(FlipkartDiscount.class);
	}
}
