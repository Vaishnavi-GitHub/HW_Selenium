package Week2.day3;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		
		System.out.println("The argument is  "+ endpoint);
		
		
	}
public void sendRequest(String endpoint, String requestBody,boolean requestStatus) {
		
		System.out.println("The arguments are "+ endpoint+ "  " + requestBody+"  " + requestStatus);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient api= new APIClient();
		api.sendRequest("endpoint");
		api.sendRequest("endpoint", "requestBody", true);

	}

}
