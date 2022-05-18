package com.manytomany.join;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Prj1 {
	
	@Id
	@Column(name="p_Id")
	private int p_Id;
	@Column(name="p_Title")
	private String p_Title;
	
	@ManyToMany(mappedBy = "proj")
	private List<Emp> em;

	public int getP_Id() {
		return p_Id;
	}

	public void setP_Id(int p_Id) {
		this.p_Id = p_Id;
	}

	public String getP_Title() {
		return p_Title;
	}

	public void setP_Title(String p_Title) {
		this.p_Title = p_Title;
	}

	public List<Emp> getEm() {
		return em;
	}

	public void setEm(List<Emp> em) {
		this.em = em;
	}

	
	
}
