package com.amazon_clone.entity;


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
	
	@Column(name="quantity")
	private Long quantity;
	

	@Column(name="categoryId")
	private Long categoryId;
	

	@Column(name="sellerId")
	private Long seller;


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


	public Long getQuantity() {
		return quantity;
	}


	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}


	public Long getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}


	public Long getSeller() {
		return seller;
	}


	public void setSeller(Long seller) {
		this.seller = seller;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", amount=" + amount + ", quantity=" + quantity
				+ ", categoryId=" + categoryId + ", seller=" + seller + "]";
	}


	public Product(Long productId, String name, Long amount, Long quantity, Long categoryId, Long seller) {
		super();
		this.productId = productId;
		this.name = name;
		this.amount = amount;
		this.quantity = quantity;
		this.categoryId = categoryId;
		this.seller = seller;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
