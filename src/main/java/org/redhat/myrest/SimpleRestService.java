package org.redhat.myrest;



import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;




//Example URL: http://localhost:8080/javaee7-rest-basic/rest/simple/text

@Path("/simple")
public class SimpleRestService  {
	@GET
	@Path("/text")
	public String getHello () 
	{
		return "hello world!";
	} 
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public SimpleProperty getPropertyJSON () 
	{
        SimpleProperty p = new SimpleProperty("key","value");
		return p;
	}
	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public SimpleProperty getPropertyXML () 
	{
        SimpleProperty p = new SimpleProperty("key","value");
		return p;
	}
}