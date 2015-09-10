package at.htl.basicauth;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("greeting")
public class GreetingResource {

    @GET
    @Produces("text/html")
    public String hello() {
        return "<h1>Hello from REST!</h1>";
    }
}

