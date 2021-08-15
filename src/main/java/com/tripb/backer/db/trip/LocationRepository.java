package com.tripb.backer.db.trip;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class LocationRepository implements PanacheMongoRepository<Location>{
    
}
