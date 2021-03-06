package com.kevinhayeswilson.apcs.magpie.resources;

import com.kevinhayeswilson.apcs.magpie.IMagpie;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * The resource which wraps {@link com.kevinhayeswilson.apcs.magpie.IMagpie}'s getGreeting function.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
@Path("/greeting")
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {

    private final IMagpie magpie;

    public GreetingResource(IMagpie magpie) {
        this.magpie = magpie;
    }

    @GET
    public String getGreeting() {
        return magpie.getGreeting();
    }

}
