package dependencyInjectionMsgService;

import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {
	
	/*Used to bind the interface to the implementation class*/
	protected void configure()
	{
		bind(MessageService.class).to(EmailMsgService.class);
	}

}
