package com.sgic.leavesystem.entity;

import java.io.File;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class TerminationRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6289744971837349356L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "employee_id")
	User employee;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "termination_type_id")
	TerminationType terminationType;
	
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
	public User getEmployee() {
		return employee;
	}
	public void setEmployee(User employee) {
		this.employee = employee;
	}
	public TerminationType getTerminationType() {
		return terminationType;
	}
	public void setTerminationType(TerminationType terminationType) {
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