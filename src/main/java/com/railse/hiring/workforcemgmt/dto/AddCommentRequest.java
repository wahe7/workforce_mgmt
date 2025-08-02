package com.railse.hiring.workforcemgmt.dto;

import lombok.Data;

@Data
public class AddCommentRequest {
  private String author;
  private String comment;
}
