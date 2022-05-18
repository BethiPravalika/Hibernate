package com.one2onemapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ans {
	@Id
	private int ans_id;
	private String ans_solution;
	public int getAns_id() {
		return ans_id;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public String getAns_solution() {
		return ans_solution;
	}
	public void setAns_solution(String ans_solution) {
		this.ans_solution = ans_solution;
	}
	
}
