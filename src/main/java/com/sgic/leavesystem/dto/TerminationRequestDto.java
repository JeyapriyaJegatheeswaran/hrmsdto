package com.sgic.leavesystem.dto;

import java.io.File;
import java.time.ZonedDateTime;

public class TerminationRequestDto {
  Integer id;
  ZonedDateTime planedLeavingDate;
  String reason;
  File resignationLetter;
  TerminationTypeDto terminationType;
  UserDto employee;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ZonedDateTime getPlanedLeavingDate() {
    return planedLeavingDate;
  }

  public void setPlanedLeavingDate(ZonedDateTime planedLeavingDate) {
    this.planedLeavingDate = planedLeavingDate;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public File getResignationLetter() {
    return resignationLetter;
  }

  public void setResignationLetter(File resignationLetter) {
    this.resignationLetter = resignationLetter;
  }

  public TerminationTypeDto getTerminationType() {
    return terminationType;
  }

  public void setTerminationType(TerminationTypeDto terminationType) {
    this.terminationType = terminationType;
  }

  public UserDto getEmployee() {
    return employee;
  }

  public void setEmployee(UserDto employee) {
    this.employee = employee;
  }

}
