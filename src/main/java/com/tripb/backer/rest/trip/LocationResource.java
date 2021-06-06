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

@Path("/location")
public class LocationResource {

    @Inject
    LocationRepository locationRepository;

    @GET
    public Response listAll(){
        List<Location> result = null;
        try{
            result = locationRepository.listAll();
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
    public Location add(Location location){
        locationRepository.persist(location);
        return location;
    }

    @DELETE
    public Set<Location> delete(Location location){
        // trips.removeIf(filter)
        return location;
    }

    @DELETE
    @Path("deleteAll")
    public Response deleteAll(){
        this.locationRepository.deleteAll();
        return ok().build();
    }
}