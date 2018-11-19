package com.sgic.leavesystem.dto;

import java.io.File;

public class TerminationRecordDto {
	Integer id;
	String employee;
	String terminationType;
	String causeOfTermination;
	String DisciplinaryProcedures;
	String legalStatus;
	File exitInterview;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String getTerminationType() {
		return terminationType;
	}
	public void setTerminationType(String terminationType) {
		this.terminationType = terminationType;
	}
	public String getCauseOfTermination() {
		return causeOfTermination;
	}
	public void setCauseOfTermination(String causeOfTermination) {
		this.causeOfTermination = causeOfTermination;
	}
	public String getDisciplinaryProcedures() {
		return DisciplinaryProcedures;
	}
	public void setDisciplinaryProcedures(String disciplinaryProcedures) {
		DisciplinaryProcedures = disciplinaryProcedures;
	}
	public String getLegalStatus() {
		return legalStatus;
	}
	public void setLegalStatus(String legalStatus) {
		this.legalStatus = legalStatus;
	}
	public File getExitInterview() {
		return exitInterview;
	}
	public void setExitInterview(File exitInterview) {
		this.exitInterview = exitInterview;
	}
	
	
	

}
