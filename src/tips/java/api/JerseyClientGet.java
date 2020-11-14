package tips.java.api;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientGet {
	public static void main(String[]args){
		Client client = Client.create();
		WebResource webResource = client.resource(String.format("http://localhost:8080/SoaTest/api/login/%s/%s", "admin", "admin1"));
		String response = webResource.type("application/json").post(String.class);
		System.out.println(response);
	}

}
