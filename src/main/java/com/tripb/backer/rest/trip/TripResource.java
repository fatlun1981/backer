package com.tripb.backer.rest.trip;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/trips")
public class TripResource {

    private Set<Trip> trips = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    
    public TripResource(){
        trips.add(new Trip());
        trips.add(new Trip());
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    public Response list2(){
        return Response.ok(trips).build();
    }

    @GET
    public Set<Trip> list() {
        return trips;
    }

    @POST
    public Set<Trip> add(Trip trip){
        trips.add(trip);
        return trips;
    }

    @DELETE
    public Set<Trip> delete(Trip trip){
        // trips.removeIf(filter)
        return trips;
    }
}