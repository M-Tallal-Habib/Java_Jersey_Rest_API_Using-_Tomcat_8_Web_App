package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
@Path("/hello")

public class hello {
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayhello(){
		String resource="<? xml version='1.0' ?>"+
				"<hello> Hi Tallal, how are you </hello>";
		return resource;
	}
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayhellojson(){
		String resource=null;
		return resource;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayhellohtml(@QueryParam("name") String Name, @QueryParam("card_no") String card_no, @QueryParam("amount") int amount){
		String response=null;
		if (amount>1000){
			response="Approved";
		}
		else{
			response="not Approved";
		}
		
		
		return "<html>"+"<title>"+"Credit Card Authorization"+ Name +"</title>"+
				"<body>"+"<h1>"+"Credit Car "+response+"</h1>"+"</body>"+"</html>";

	}
	

}
