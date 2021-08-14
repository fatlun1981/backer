package com.tripb.backer.rest.jwt;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import com.tripb.backer.security.jwt.GenerateToken;

import org.eclipse.microprofile.jwt.JsonWebToken;

@Path("/open")
@RequestScoped
public class JwtTokenResource {
    @GET
    @Path("login")
    @PermitAll
    @Produces(MediaType.TEXT_PLAIN)
    public String generatetJwt(@Context SecurityContext ctx) {
        return GenerateToken.generateJwt();
    }
}
