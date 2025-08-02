package com.railse.hiring.workforcemgmt.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TaskComment {
  private String author;
  private String comment;
  private Long timestamp;

  public TaskComment(String author, String comment) {
      this.author = author;
      this.comment = comment;
      this.timestamp = System.currentTimeMillis();
  }
  
}
