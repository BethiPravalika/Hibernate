package com.hibernateexample;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
      public int id;
	public String e_Name;
	public double salary;
	public String designation;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
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
		return "Employee [id=" + id + ", e_Name=" + e_Name + ", salary=" + salary + ", designation=" + designation
				+ ", city=" + city + "]";
	}
}


	
