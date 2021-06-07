package com.tripb.backer.rest.trip;

import static javax.ws.rs.core.Response.*;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/event")
public class EventResource {

    @Inject
    EventRepository repository;

    @GET
    public Response listAll(){
        List<Event> result = null;
        try{
            result = repository.listAll();
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
    public Event add(Event entity){
        repository.persist(entity);
        return entity;
    }

    @DELETE
    public Event delete(Event entity){
        // trips.removeIf(filter)
        return entity;
    }

    @DELETE
    @Path("deleteAll")
    public Response deleteAll(){
        this.repository.deleteAll();
        return ok().build();
    }
}