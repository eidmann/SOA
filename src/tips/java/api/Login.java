package tips.java.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;


@Path ("login")
public class Login {
	@GET
	@Produces("application/xml")
	public String requiestLogin() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("<note>");
	    sb.append("	<to>Guest</to>");
	    sb.append("	<from>Admin</from>");
	    sb.append("	<body>Please Login</body>");
	    sb.append("</note>");	    
	    return sb.toString();
	}
	
	@POST
	@Path("/{p1}/{p2}")
	@Produces("application/json")
	public String login(@PathParam("p1") String username, @PathParam("p2") String password) {
		ResponseMessage msg = new ResponseMessage();
		if(username.equals("admin") && password.equals("admin1")) {
			msg.setResponseCode("200");
			msg.setResponseMessage("Succes");
		}  else {
			msg.setResponseCode("-1");
			msg.setResponseMessage("Wrong username or password");
		}
		
		return new Gson().toJson(msg);
		
	}


}
