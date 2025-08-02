package com.railse.hiring.workforcemgmt.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ActivityLog {

  private String message;
  private Long timestamp;

  public ActivityLog(String message) {
    this.message = message;
    this.timestamp = System.currentTimeMillis();
}
  
}
