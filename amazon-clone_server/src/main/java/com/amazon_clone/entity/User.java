package com.amazon_clone.entity;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="userId")
	private Long  userId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="roleId")
	private Role roleId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="statusId")
	private Status statusId;
	
	@Column(name="created_by")
	private Long  created_by;
	
	@Column(name="created_time")
	private Instant created_time;
	
	@Column(name="updated_by")
	private Long  updated_by;
	
	@Column(name="updated_time")
	private Instant updated_time;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRoleId() {
		return roleId;
	}

	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}

	public Status getStatusId() {
		return statusId;
	}

	public void setStatusId(Status statusId) {
		this.statusId = statusId;
	}

	public Long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Long created_by) {
		this.created_by = created_by;
	}

	public Instant getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Instant created_time) {
		this.created_time = created_time;
	}

	public Long getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(Long updated_by) {
		this.updated_by = updated_by;
	}

	public Instant getUpdated_time() {
		return updated_time;
	}

	public void setUpdated_time(Instant updated_time) {
		this.updated_time = updated_time;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", password=" + password + ", email=" + email + ", roleId="
				+ roleId + ", statusId=" + statusId + ", created_by=" + created_by + ", created_time=" + created_time
				+ ", updated_by=" + updated_by + ", updated_time=" + updated_time + "]";
	}

	public User(Long userId, String name, String password, String email, Role roleId, Status statusId, Long created_by,
			Instant created_time, Long updated_by, Instant updated_time) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.email = email;
		this.roleId = roleId;
		this.statusId = statusId;
		this.created_by = created_by;
		this.created_time = created_time;
		this.updated_by = updated_by;
		this.updated_time = updated_time;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
