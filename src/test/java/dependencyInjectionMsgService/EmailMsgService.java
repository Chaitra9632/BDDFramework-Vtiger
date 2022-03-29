package dependencyInjectionMsgService;

public class EmailMsgService implements MessageService{

	public void sendMessage(String msg, String recipient) {
		
		System.out.println("Email message recieved "+"\n"
                +"The message recieved is "+msg+" by "+recipient);
		
	}
	
	

}
