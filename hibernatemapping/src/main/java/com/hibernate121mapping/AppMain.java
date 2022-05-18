package com.hibernate121mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tr=ses.beginTransaction();
		
		Product p=new Product();
		p.setPid(104);
		p.setPname("Abhi");
		p.setPrice(30000);
		
		Supplier s=new Supplier();
		s.setSid(102);
		s.setSname("Sree");
		s.setAddress("Hyderabad");
		s.setPh_no(98789678);
        p.setSupplierid(s);

		ses.save(p);
		ses.save(s);
		
		tr.commit();
        ses.close();
		factory.close();
	}

}
