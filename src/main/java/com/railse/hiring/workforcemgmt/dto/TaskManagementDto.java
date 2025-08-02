package com.railse.hiring.workforcemgmt.dto;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.railse.hiring.workforcemgmt.common.model.enums.ReferenceType;
import com.railse.hiring.workforcemgmt.model.ActivityLog;
import com.railse.hiring.workforcemgmt.model.TaskComment;
import com.railse.hiring.workforcemgmt.model.enums.Priority;
import com.railse.hiring.workforcemgmt.model.enums.Task;
import com.railse.hiring.workforcemgmt.model.enums.TaskStatus;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TaskManagementDto {
  private Long id;
  private Long referenceId;
  private ReferenceType referenceType;
  private Task task;
  private String description;
  private TaskStatus status;
  private Long assigneeId;
  private Long taskDeadlineTime;
  private Long startTime;
  private Priority priority;
  private List<ActivityLog> activityLogs;
  private List<TaskComment> comments;
}
