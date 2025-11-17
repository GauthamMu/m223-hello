package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculator")
public class Calculator {

    @GET
    @Path("/add/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String add(
            @PathParam("a") int a,
            @PathParam("b") int b) {
        return String.valueOf(a + b);
    }
    @GET
    @Path("/min/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String min(
        @PathParam("a") int a,
        @PathParam("b") int b) {
            return String.valueOf(a - b);
        }
    
}
