package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
		
	private long id;
	private String name;
	private String tablet;
	private int prize;
	
	public User() {
		
	}
	
	public User(long id, String name, String tablet, int prize) {
		super();
		this.id = id;
		this.name = name;
		this.tablet = tablet;
		this.prize = prize;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTablet() {
		return tablet;
	}
	public void setTablet(String tablet) {
		this.tablet = tablet;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", tablet=" + tablet + ", prize=" + prize + "]";
	}
}