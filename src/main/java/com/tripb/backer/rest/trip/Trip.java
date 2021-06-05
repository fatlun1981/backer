package com.tripb.backer.rest.trip;

import java.math.BigDecimal;
import java.util.Date;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@RegisterForReflection
@Data
public class Trip {
    public String name;
    public String description;
    // public String[] location;
    public Date plannedStart;
    public Date plannedEnd;
    public Date actualStart;
    public Date actualEnd;
    public BigDecimal duration;
}
