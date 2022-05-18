package com.one2onemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainone2one {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tr=ses.beginTransaction();
		
		Que q=new Que();
		q.setId(1);
		q.setQue_Name("What is java?");
		
		Ans an=new Ans();
		an.setAns_id(201);
		an.setAns_solution("Java is programming language");
		q.setAnsID(an);
		
		ses.save(q);
		ses.save(an);
		tr.commit();
		
		ses.close();
		factory.close();
		
	}

}
