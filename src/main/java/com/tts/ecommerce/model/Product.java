package com.tts.ecommerce.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private int quantity;

	private double price;

	@NotEmpty(message = "Please provide a description")
	private String description;

	@NotEmpty(message = "Please provide a name")
	private String name;

	@NotEmpty(message = "Please provide a brand")
	private String brand;

	@NotEmpty(message = "Please provide a category")
	private String category;

	private String image;


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

    public Product(int quantity, Double price, String description, String name, String brand, String category, String image) {
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.setImage(image);
    }

    public Product() {
    }

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", quantity=" + quantity + ", price=" + price + ", description=" + description
				+ ", name=" + name + ", brand=" + brand + ", category=" + category + ", image=" + image + "]";
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Long getId() {
		return id;
	}
	
	
	
	
	
}
