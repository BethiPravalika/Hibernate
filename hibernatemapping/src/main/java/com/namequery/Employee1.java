package com.namequery;

import javax.persistence.Entity;

@Entity
public class Employee1 {

	public int id;
	public String e_Name;
	public String city;
	public int getId() {
		return id;
	}
	public String getE_Name() {
		return e_Name;
	}
	public void setE_Name(String e_Name) {
		this.e_Name = e_Name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

