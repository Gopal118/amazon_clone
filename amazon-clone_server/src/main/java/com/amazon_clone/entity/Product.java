package com.amazon_clone.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="ProductId")
	private Long  productId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="amount")
	private Long  amount;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", amount=" + amount + "]";
	}

	public Product(Long productId, String name, Long amount) {
		super();
		this.productId = productId;
		this.name = name;
		this.amount = amount;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
