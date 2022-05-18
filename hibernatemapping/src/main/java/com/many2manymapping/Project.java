package com.many2manymapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int p_id;
	private String name;
	
	@ManyToMany(mappedBy = "project")
	private List<Emp2> emp2;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Emp2> getEmp2() {
		return emp2;
	}

	public void setEmp2(List<Emp2> emp2) {
		this.emp2 = emp2;
	}
	
	
	

}
