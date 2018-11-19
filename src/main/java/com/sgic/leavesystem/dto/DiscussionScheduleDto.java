package com.sgic.leavesystem.dto;

import java.time.ZonedDateTime;

public class DiscussionScheduleDto {
	Integer id;
	String terminationRequest;
	ZonedDateTime time;
	String venue;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTerminationRequest() {
		return terminationRequest;
	}
	public void setTerminationRequest(String terminationRequest) {
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
