package dependencyInjectionMsgService;

import com.google.inject.Inject;

public class MyApplication {
	
	private MessageService msgService;
	
//	public MyApplication()
//	{
//		this.msgService=new FaceBookMsgService();
//	}
//	
//	public void send(String msg, String rec)
//	{
//		msgService.sendMessage(msg, rec);
//	}
	
	
	/*If dependency Injection is used -> Guice then no need to create object using 'new'*/
	
	@Inject
	public MyApplication(MessageService service)
	{
		this.msgService=service;
	}
	
	public void send(String msg, String rec)
	{
		msgService.sendMessage(msg, rec);
	}

}
