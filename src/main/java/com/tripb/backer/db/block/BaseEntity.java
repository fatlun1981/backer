package com.tripb.backer.db.block;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@RegisterForReflection
@Data
public class BaseEntity {
    @BsonId
    public ObjectId id;
}
