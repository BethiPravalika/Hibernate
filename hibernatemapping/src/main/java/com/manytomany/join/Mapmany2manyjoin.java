package com.manytomany.join;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapmany2manyjoin {

	public static void main(String[] args) {

             SessionFactory sf=new Configuration().configure().buildSessionFactory();
             Session ses=sf.openSession();
     		Transaction tx=ses.beginTransaction();
     		
		    Prj1 p1=new Prj1();
		    p1.setP_Id(1);
		    p1.setP_Title("Banking Application");
		
		    Prj1 p2=new Prj1();
		    p2.setP_Id(2);
		    p2.setP_Title("ATM");
		
		   Emp e1=new Emp();
		   e1.setE_Id(121);
		   e1.setE_Name("Pravalika");
		
		   Emp e2=new Emp();
		   e2.setE_Id(122);
		   e2.setE_Name("Srinivas");
		
		   List<Emp> list1=new ArrayList<Emp>();
		   List<Prj1> list2=new ArrayList<Prj1>();
		
		   list1.add(e1);
		   list1.add(e2);
		
		  list2.add(p1);
		  list2.add(p2);
		
		  p2.setEm(list1);
		  e1.setProject(list2);
		
		
		  ses.save(e1);
		  ses.save(e2);
		  ses.save(p1);
		 ses.save(p2);
		
		 tx.commit();
		 ses.close();
		 sf.close();

	}

	}


