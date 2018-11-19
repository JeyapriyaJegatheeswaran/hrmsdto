package com.sgic.leavesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.leavesystem.entity.TerminationRequest;

public interface TerminationRequestRepository extends JpaRepository<TerminationRequest, Integer>{

}
