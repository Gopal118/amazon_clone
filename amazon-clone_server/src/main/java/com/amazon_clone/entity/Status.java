package com.amazon_clone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="status")
public class Status {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="statusId")
	private Long  statusId;
	
	@Column(name="name")
	private String name;

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", name=" + name + "]";
	}

	public Status(Long statusId, String name) {
		super();
		this.statusId = statusId;
		this.name = name;
	}

	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
