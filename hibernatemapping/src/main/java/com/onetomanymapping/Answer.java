package com.onetomanymapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
@Id
private int a_id;
private String a_name;


@ManyToOne
private Question que;


public int getA_id() {
	return a_id;
}


public void setA_id(int a_id) {
	this.a_id = a_id;
}


public String getA_name() {
	return a_name;
}


public void setA_name(String a_name) {
	this.a_name = a_name;
}


public Question getQue() {
	return que;
}


public void setQue(Question que) {
	this.que = que;
}


public Answer(int a_id, String a_name, Question que) {
	super();
	this.a_id = a_id;
	this.a_name = a_name;
	this.que = que;
}


public Answer() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Answer [a_id=" + a_id + ", a_name=" + a_name + ", que=" + que + "]";
}




}
