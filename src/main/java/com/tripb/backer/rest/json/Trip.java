package com.tripb.backer.rest.json;

import java.math.BigDecimal;
import java.util.Date;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@RegisterForReflection
@Data
public class Trip {
    String name;
    String description;
    String[] location;
    Date plannedStart;
    Date plannedEnd;
    Date actualStart;
    Date actualEnd;
    BigDecimal duration;
}
