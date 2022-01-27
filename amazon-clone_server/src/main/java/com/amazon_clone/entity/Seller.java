package com.amazon_clone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="seller")
public class Seller {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="sellerId")
	private Long sellerId;

	@Column(name="company")
	private String company;
	
	@Column(name="decsription")
	private String decsription;
	

	@Column(name="userId")
	private Long userId;
	
	@Column(name="gstnumber")
	private Long gstnumber;

	public Seller(Long sellerId, String company, String decsription, Long userId, Long gstnumber) {
		super();
		this.sellerId = sellerId;
		this.company = company;
		this.decsription = decsription;
		this.userId = userId;
		this.gstnumber = gstnumber;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", company=" + company + ", decsription=" + decsription + ", userId="
				+ userId + ", gstnumber=" + gstnumber + "]";
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDecsription() {
		return decsription;
	}

	public void setDecsription(String decsription) {
		this.decsription = decsription;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGstnumber() {
		return gstnumber;
	}

	public void setGstnumber(Long gstnumber) {
		this.gstnumber = gstnumber;
	}

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
