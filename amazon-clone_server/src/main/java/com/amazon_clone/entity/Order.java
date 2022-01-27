package com.amazon_clone.entity;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="orderId")
	private Long  orderId;


	
	
	@Column(name="totalAmount")
	private Long totalAmount;
	
	@Column(name = "userId")
	private Long userId;
	
	@Column(name="created_by")
	private Long  created_by;
	
	@Column(name="created_time")
	private Instant created_time;
	
	@Column(name="updated_by")
	private Long  updated_by;
	
	@Column(name="updated_time")
	private Instant updated_time;

	


	public Order(Long orderId, Long totalAmount, Long userId, Long created_by, Instant created_time, Long updated_by,
			Instant updated_time) {
		super();
		this.orderId = orderId;
		this.totalAmount = totalAmount;
		this.userId = userId;
		this.created_by = created_by;
		this.created_time = created_time;
		this.updated_by = updated_by;
		this.updated_time = updated_time;
	}




	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", totalAmount=" + totalAmount + ", userId=" + userId + ", created_by="
				+ created_by + ", created_time=" + created_time + ", updated_by=" + updated_by + ", updated_time="
				+ updated_time + "]";
	}




	public Long getOrderId() {
		return orderId;
	}




	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}




	public Long getTotalAmount() {
		return totalAmount;
	}




	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}




	public Long getUserId() {
		return userId;
	}




	public void setUserId(Long userId) {
		this.userId = userId;
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




	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
