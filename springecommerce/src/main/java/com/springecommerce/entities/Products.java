package com.springecommerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Products {

	@Id
	@Column(name="category_id")
	Integer categoryId;
	
	@Column(name="products_name")
	String productsName;
	
	@Column(name="products_decription")
	String productsDescription;
	
	@Column(name="products_price")
	String productPrice;
	
	@Column(name="products_image_url")
	String productsImageUrl;
	
}
