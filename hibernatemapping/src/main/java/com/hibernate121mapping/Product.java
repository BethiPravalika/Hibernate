package com.hibernate121mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Product {

	@Id
	   private int Pid;
	
		private String Pname;
		
		private int Price;

		@OneToOne
		@JoinColumn(name="S_id")
		private  Supplier Supplierid;

		public int getPid() {
			return Pid;
		}

		public void setPid(int pid) {
			Pid = pid;
		}

		public String getPname() {
			return Pname;
		}

		public void setPname(String pname) {
			Pname = pname;
		}

		public int getPrice() {
			return Price;
		}

		public void setPrice(int price) {
			Price = price;
		}

		public Supplier getSupplierid() {
			return Supplierid;
		}

		public void setSupplierid(Supplier supplierid) {
			Supplierid = supplierid;
		}

		
		
}
