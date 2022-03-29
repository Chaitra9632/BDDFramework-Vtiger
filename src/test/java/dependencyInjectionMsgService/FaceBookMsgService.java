package dependencyInjectionMsgService;

public class FaceBookMsgService implements MessageService{

	public void sendMessage(String msg, String recipient) {
		
		System.out.println("Facebook message recived "+"\n"
		                    +"The message recieved is "+msg+" by "+recipient);
		
	}
	
	

}
