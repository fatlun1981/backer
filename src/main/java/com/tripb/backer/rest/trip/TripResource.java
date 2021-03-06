package com.tripb.backer.rest.trip;

import static javax.ws.rs.core.Response.*;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/trips")
public class TripResource {

    @Inject
    TripRepository tripRepository;

    private Set<Trip> trips = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    
    public TripResource(){
        trips.add(new Trip());
        trips.add(new Trip());
    }
    
    // @GET
    // @Produces(MediaType.TEXT_PLAIN)
    // public String hello() {
    //     return "Hello RESTEasy";
    // }

    @GET
    public Response listAll(){
        List<Trip> result = null;
        try{
            result = tripRepository.listAll();
            return ok(result).build();
        }catch(Exception e){
            return status(500).build();
        }
    }

    // @GET
    // public Set<Trip> list() {
    //     return trips;
    // }

    @POST
    public Trip add(Trip trip){
        tripRepository.persist(trip);
        return trip;
    }

    @DELETE
    public Set<Trip> delete(Trip trip){
        // trips.removeIf(filter)
        return trips;
    }

    @DELETE
    @Path("deleteAll")
    public Response deleteAll(){
        this.tripRepository.deleteAll();
        return ok().build();
    }
}