package com.sgic.leavesystem.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class DiscussionParticipants implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1091327793224473441L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	User employee;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "discussion_id")
	DiscussionSchedule discussionSchedule;

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

	public DiscussionSchedule getDiscussionSchedule() {
		return discussionSchedule;
	}

	public void setDiscussionSchedule(DiscussionSchedule discussionSchedule) {
		this.discussionSchedule = discussionSchedule;
	}

	
}