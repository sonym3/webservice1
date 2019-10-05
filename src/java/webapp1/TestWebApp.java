/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp1;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author 1895268
 */
@Path("mobile")
public class TestWebApp {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TestWebApp
     */
    public TestWebApp() {
    }

    /**
     * Retrieves representation of an instance of webapp1.TestWebApp
     * @return an instance of java.lang.String
     */
    @GET
    @Path("good")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        //TODO return proper representation object
        return "Hello Good Mad Students";
    }
    
    @GET
    @Path("bad")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText1() {
        //TODO return proper representation object
        return "Hello bad Mad Students. Say...";
    }

    @GET
    @Path("sum&{value1}&{value2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText2(@PathParam("value1") int v1,
            @PathParam("value2") int v2) {
        //TODO return proper representation object
        int result = v1+v2;
        return "Hello the sum is " + result;
    }
    
    @GET
    @Path("sub&{value1}&{value2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText3(@PathParam("value1") int v1,
            @PathParam("value2") int v2) {
        //TODO return proper representation object
        int result = v1-v2;
        return "Hello the Difference is " + result;
    }
    
    @GET
    @Path("mul&{value1}&{value2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText4(@PathParam("value1") int v1,
            @PathParam("value2") int v2) {
        //TODO return proper representation object
        int result = v1*v2;
        return "Hello the Product is " + result;
    }
    
    
    @GET
    @Path("helloworld")
    @Produces(MediaType.TEXT_HTML)
    public String getText7() {
        //TODO return proper r int result = v1*v2;
        return "<p><b><i><strong>Hello MAD 312 </strong></i></b></p>";
    }
    
    
    @GET
    @Path("helloxml")
    @Produces(MediaType.APPLICATION_XML)
    public String getText8() {
        //TODO return proper r int result = v1*v2;
        return "<NOTE><DESTINATION>to me</DESTINATION><MESSAGE>hope you are doing good</MESSAGE></NOTE>";
    }
    
    @GET
    @Path("hellojson")
    @Produces(MediaType.APPLICATION_JSON)
    public String getText9() {
        //TODO return proper r int result = v1*v2;
        return "{\n" +
"\"id\":1895268\n" +
"\"name\": \"sony\"\n" +
"\"gpa\": 4.5\n" +
"}";
    }
    
    
    @GET
    @Path("hellojson2&{fname}&{lname}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getText10(@PathParam("fname") String f,
            @PathParam("lname") String l) {
        //TODO return proper r int result = v1*v2;
        return "{\n" +
"\"id\":1111\n" +
"\"fname\": \"" + f + "\"\n" +
"\"lname\": \"" + l + "\"\n" +
"\"salary\": 1000\n" +
"}";
    }
}
