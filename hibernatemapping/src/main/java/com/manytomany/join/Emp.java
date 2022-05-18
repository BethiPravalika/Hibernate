package com.manytomany.join;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class Emp {
	
	@Id
	@Column(name="e_Id")
	private int e_Id;
	@Column(name="e_Name")
	private String e_Name;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="Emp_Prj1" , joinColumns = {
	@JoinColumn(name="e_Id")},inverseJoinColumns= {
	@JoinColumn(name="p_Id")})
	
	private List<Prj1> project;

	public int getE_Id() {
		return e_Id;
	}

	public void setE_Id(int e_Id) {
		this.e_Id = e_Id;
	}

	public String getE_Name() {
		return e_Name;
	}

	public void setE_Name(String e_Name) {
		this.e_Name = e_Name;
	}

	public List<Prj1> getProject() {
		return project;
	}

	public void setProject(List<Prj1> project) {
		this.project = project;
	}
	
	
	

}
