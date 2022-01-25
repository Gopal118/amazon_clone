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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="orderId")
	private Long  orderId;

	@ManyToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="productId")
	private List<Product> productId;
	
	
	@Column(name="totalAmount")
	private Long totalAmount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User userId;
	
	@Column(name="created_by")
	private Long  created_by;
	
	@Column(name="created_time")
	private Instant created_time;
	
	@Column(name="updated_by")
	private Long  updated_by;
	
	@Column(name="updated_time")
	private Instant updated_time;
	
	

}
