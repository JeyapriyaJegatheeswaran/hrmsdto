package com.sgic.leavesystem.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TerminationType")
public class TerminationType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8312006920751044906L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String Type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
}