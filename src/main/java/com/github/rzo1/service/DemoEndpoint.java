package com.github.rzo1.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless
@Path("/api")
public class DemoEndpoint {

    @Inject
    private DemoPersistenceService persistenceService;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("demos")
    public Response getDemos() {
        int size = persistenceService.getDemos().size();
        return Response.ok("Demo: " + size).build();
    }
}
