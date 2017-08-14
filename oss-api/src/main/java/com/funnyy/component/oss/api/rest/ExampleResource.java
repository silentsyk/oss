package com.funnyy.component.oss.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by sky on 17-6-14.
 */
@Path("/oss")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface ExampleResource {
    @GET
    @Path("/application/name/info")
    String getApplicationName();
}
