package com.sgic.leavesystem.service;

import java.util.List;

import com.sgic.leavesystem.entity.TerminationRequest;

public interface TerminationRequestService {
	

	boolean addTerminationRequest(TerminationRequest terminationRequest);
	   List<TerminationRequest> getAllTerminationRequest();
	   boolean editTerminationRequest(TerminationRequest terminationRequest, Integer id);
	   boolean deleteTerminationRequest(Integer id);
	   TerminationRequest getById(Integer id);

}
