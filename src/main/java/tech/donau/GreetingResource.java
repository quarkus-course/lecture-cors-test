package tech.donau;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
}