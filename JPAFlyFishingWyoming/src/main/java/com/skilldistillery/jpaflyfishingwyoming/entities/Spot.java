package com.skilldistillery.jpaflyfishingwyoming.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Spot{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	
	private String location;
	
	@Column(name="img_url")
	private String imageURL;

	private String description;
	
	@Column(name="water_type")
	private String waterType;
	
	private String fish;
	
	
	public Spot() {
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getWaterType() {
		return waterType;
	}


	public void setWaterType(String waterType) {
		this.waterType = waterType;
	}


	public String getFish() {
		return fish;
	}


	public void setFish(String fish) {
		this.fish = fish;
	}


	@Override
	public String toString() {
		return "Spot [id=" + id + ", name=" + name + ", location=" + location + ", imageURL=" + imageURL
				+ ", description=" + description + ", waterType=" + waterType + ", fish=" + fish + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(description, fish, id, imageURL, location, name, waterType);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Spot other = (Spot) obj;
		return Objects.equals(description, other.description) && Objects.equals(fish, other.fish) && id == other.id
				&& Objects.equals(imageURL, other.imageURL) && Objects.equals(location, other.location)
				&& Objects.equals(name, other.name) && Objects.equals(waterType, other.waterType);
	}

	
	
}