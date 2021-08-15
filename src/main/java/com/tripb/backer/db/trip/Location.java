package com.tripb.backer.db.trip;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@RegisterForReflection
@Data
public class Location {
    @BsonId
    public ObjectId id;
    public String name;
    public String description;
    public String address;
}
