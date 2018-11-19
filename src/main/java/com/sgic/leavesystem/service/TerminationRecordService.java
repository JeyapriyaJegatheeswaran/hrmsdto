package com.sgic.leavesystem.service;

import java.util.List;

import com.sgic.leavesystem.entity.TerminationRecord;


public interface TerminationRecordService {
	
	boolean addTerminationRecord(TerminationRecord terminationRecord);
	   List<TerminationRecord> getAllTerminationRecord();
	   boolean editTerminationRecord(TerminationRecord terminationRecord, Integer id);
	   boolean deleteTerminationRecord(Integer id);
	   TerminationRecord getById(Integer id);

}
