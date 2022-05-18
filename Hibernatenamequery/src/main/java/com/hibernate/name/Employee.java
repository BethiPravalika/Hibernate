package com.hibernate.name;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries (
		{  
			@NamedQuery (name = "findemployeeByID", query = "from Employee e where e.id = :ID" )})
@Entity
@Table (name = "employee")
public class Employee {
	
	@Id
	public  int id;
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
	@Override
	public String toString() {
		return "Emp2 [id=" + id + ", e_Name=" + e_Name + ", city=" + city + "]";
	}
	
}