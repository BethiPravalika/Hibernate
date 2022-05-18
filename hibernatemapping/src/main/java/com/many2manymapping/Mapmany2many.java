package com.many2manymapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapmany2many {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Project p1=new Project();
		p1.setP_id(101);
		p1.setName("Management");
		
		Project p2=new Project();
		p2.setP_id(102);
		p2.setName("Finance");
		
		Emp2 e1=new Emp2();
		e1.setE_id(1);
		e1.setE_name("Nithin");
		
		Emp2 e2=new Emp2();
		e2.setE_id(2);
		e2.setE_name("Ram");
		
		List<Emp2> list1=new ArrayList<Emp2>();
		List<Project> list2=new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		p2.setEmp2(list1);
		e1.setProject(list2);
		
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(e1);
		ses.save(e2);
		ses.save(p1);
		ses.save(p2);
		
		tx.commit();
		ses.close();
		factory.close();

	}

}
