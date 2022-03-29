package dependencyInjectionMsgService;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ClientApp {

	public static void main(String[] args) {
		
//		MyApplication myApp = new MyApplication();
//		myApp.send("Hi Chaitra", "Google");
		
		
		/*Using Dependency injection*/
		Injector injector = Guice.createInjector(new AppModule());
		MessageService service = injector.getInstance(FaceBookMsgService.class);
		service.sendMessage("Hi", "FaceBook");
	    	
	}
}
