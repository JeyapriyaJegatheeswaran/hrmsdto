package com.sgic.leavesystem.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "discussion_schedule")
public class DiscussionSchedule implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -7218538203233098802L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;

  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "termination_request_id")
  TerminationRequest terminationRequest;

  @Column(name = "time")
  ZonedDateTime time;

  @Column(name = "venue")
  String venue;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TerminationRequest getTerminationRequest() {
    return terminationRequest;
  }

  public void setTerminationRequest(TerminationRequest terminationRequest) {
    this.terminationRequest = terminationRequest;
  }

  public ZonedDateTime getTime() {
    return time;
  }

  public void setTime(ZonedDateTime time) {
    this.time = time;
  }

  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

}
