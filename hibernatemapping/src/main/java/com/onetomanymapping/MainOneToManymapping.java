package com.onetomanymapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainOneToManymapping {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		
		Question que=new Question();
		que.setQname("Features of Java");
		
		Answer ans= new Answer();
		ans.setA_id(101);
		ans.setA_name("Platform Independent");
		ans.setQue(que);
		
		Answer ans1= new Answer();
		ans1.setA_id(102);
		ans1.setA_name("Simple");
		ans1.setQue(que);
		
		Answer ans2= new Answer();
		ans2.setA_id(103);
		ans2.setA_name("secure");
		ans2.setQue(que);
		
		Answer ans3= new Answer();
		ans3.setA_id(104);
		ans3.setA_name("Portable");
		ans3.setQue(que);
		
		List<Answer> li=new ArrayList<Answer>();
		li.add(ans);
		li.add(ans1);
		li.add(ans2);
		li.add(ans3);
		que.setAns(li);
		
		ses.save(que);
		ses.save(ans);
		ses.save(ans1);
		ses.save(ans2);
		ses.save(ans3);
		
		tx.commit();
		ses.close();
		factory.close();
		
		
		
			}

}
