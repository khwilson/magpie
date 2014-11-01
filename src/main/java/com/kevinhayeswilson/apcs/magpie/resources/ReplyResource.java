package com.kevinhayeswilson.apcs.magpie.resources;

import com.kevinhayeswilson.apcs.magpie.IMagpie;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * A resource whose purpose is to call {@link com.kevinhayeswilson.apcs.magpie
 * .IMagpie#getReply(String)} from a POST request.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
@Path("/reply")
@Produces(MediaType.APPLICATION_JSON)
public class ReplyResource {

    private final IMagpie magpie;

    public ReplyResource(IMagpie magpie) {
        this.magpie = magpie;
    }

    @POST
    public String getReply(@FormParam("statement") String statement) {
        return magpie.getReply(statement);
    }
}
