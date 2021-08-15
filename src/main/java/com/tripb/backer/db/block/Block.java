package com.tripb.backer.db.block;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@RegisterForReflection
@Data
public class Block extends BaseEntity{
    public String name;
    public String description;
    public Date plannedStart;
    public Date plannedEnd;
    public Date actualStart;
    public Date actualEnd;
    public BigDecimal duration;
    public List<String> location;
    public String BlockName;
}
