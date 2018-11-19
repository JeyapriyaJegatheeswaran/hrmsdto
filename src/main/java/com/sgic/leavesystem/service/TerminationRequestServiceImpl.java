package com.sgic.leavesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.leavesystem.entity.TerminationRequest;
import com.sgic.leavesystem.repository.TerminationRequestRepository;

@Service
public class TerminationRequestServiceImpl implements TerminationRequestService {
	
	@Autowired
	TerminationRequestRepository terminationRequestRepository;

	@Override
	public boolean addTerminationRequest(TerminationRequest terminationRequest) {
		terminationRequestRepository.save(terminationRequest);
		return true;
	}

	@Override
	public List<TerminationRequest> getAllTerminationRequest() {
		return terminationRequestRepository.findAll();
	}

	@Override
	public boolean editTerminationRequest(TerminationRequest terminationRequest, Integer id) {
		if(terminationRequestRepository.getOne(id) !=null) {
			terminationRequest.setId(id);
			terminationRequestRepository.save(terminationRequest);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteTerminationRequest(Integer id) {
		terminationRequestRepository.deleteById(id);
		return true;
	}

	@Override
	public TerminationRequest getById(Integer id) {
		return terminationRequestRepository.findById(id).orElse(null);
	}

}
