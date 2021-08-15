package com.tripb.backer.db.trip;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.tripb.backer.db.block.Block;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@RegisterForReflection
@Data
public class Trip extends Block{
    // @BsonId
    // public ObjectId id;
    // public String name;
    // public String description;
    // public Date plannedStart;
    // public Date plannedEnd;
    // public Date actualStart;
    // public Date actualEnd;
    // public BigDecimal duration;
    // public List<String> location;
}
