package com.hibernate121mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {

	@Id
    private int Sid;
	
	private String Sname;
	
	private String address;

	private int ph_no;

	public int getSid() {
		return Sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPh_no() {
		return ph_no;
	}

	public void setPh_no(int ph_no) {
		this.ph_no = ph_no;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	
}
