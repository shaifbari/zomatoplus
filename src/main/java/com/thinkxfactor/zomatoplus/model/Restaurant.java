package com.thinkxfactor.zomatoplus.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_res")
public class Restaurant implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="restaurant_id")
	private long id;
	@Column(name="restaurantname")
		private String restaurantname;
	
	@Column(name="city")
	private String city;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")	
private String address;

@Column(name="contact")
private String contact;

@Column(name="description")
private String description;

@Column(name="website")
private String website;

@Column(name="likecount")
private Integer likeCount;

public long getId() {
	return id;
}
	public Restaurant(String restaurantname) {
		// TODO Auto-generated constructor stub
		super();
		this.restaurantname=restaurantname ;
	}
	public Restaurant() {
		}
	public String getRestaurantname() {
		return restaurantname;
	}
	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Integer getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}