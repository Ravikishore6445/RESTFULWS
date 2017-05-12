package com.kishore.University;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/university")
public class UniversityRESTWS {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLUniversityinfo() {

		return "<html>" + "<title>" + "University information" + "</title>"
				+ "<body><h1>" + "NAME-Indian University" + "</body> </h1>"
				+ "</html>";

	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getPlainUniversityinfo()
	{
		
		
		return "Name - Indian Univesity"; 
		
	}

}
