package com.biz.streamers.producer.entities;

import java.util.ArrayList;
// import java.util.Random;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
// import com.fasterxml.jackson.annotation.JsonRootName;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;

// @Entity(name = "product")
@JsonIgnoreProperties(ignoreUnknown = true)

public class Product {

	public Product() {
		// Random random = new Random();
		// this.monthlyRevenue = random.nextInt(10000) / 100.00;
		// this.yearlyRevenue = random.nextInt(1000000) /100.00;
	}; 

	// @Id
	private int id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("price")
	private double price;

	@JsonProperty("discountPercentage")
	private double discountPercentage;

	@JsonProperty("rating")
	private double rating;

	@JsonProperty("stock")
	private int stock;

	@JsonProperty("brand")
	private String brand;

	@JsonProperty("category")
	private String category;

	@JsonProperty("thumbnail")
	private String thumbnail;

	@JsonProperty("images")
	private ArrayList<String> images;

	@JsonProperty("monthlyRevenue")
	private double monthlyRevenue;

	@JsonProperty("yearlyRevenue")
	private double yearlyRevenue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public ArrayList<String> getImages() {
		return images;
	}

	public void setImages(ArrayList<String> images) {
		this.images = images;
	}

	public double getMonthlyRevenue() {
		return monthlyRevenue;
	}

	public void setMonthlyRevenue(double monthlyRevenue) {
		this.monthlyRevenue = monthlyRevenue;
	}

	public double getYearlyRevenue() {
		return yearlyRevenue;
	}

	public void setYearlyRevenue(double yearlyRevenue) {
		this.yearlyRevenue = yearlyRevenue;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", discountPercentage="
				+ discountPercentage + ", rating=" + rating + ", stock=" + stock + ", brand=" + brand + ", category="
				+ category + ", thumbnail=" + thumbnail + ", images=" + images + ", monthlyRevenue=" + monthlyRevenue
				+ ", yearlyRevenue=" + yearlyRevenue + "]";
	}

}
