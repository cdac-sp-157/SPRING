package com.springecommerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="category")
public class Category {
	
	@Id
	@Column(name="category_name")
	String category_name;
	
	@Column(name="category_description")
	String category_description;
	
	@Column(name="category_image_url")
	String category_image_url;

}
