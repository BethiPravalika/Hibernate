package com.hibernate.name;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Appmain {

	public static void main(String[] args) {
		
    SessionFactory factory=new Configuration().configure().buildSessionFactory();
    Session ses=factory.openSession();
    Transaction tx=ses.beginTransaction();

			
     Query query=ses.getNamedQuery("findemployeeByID");
     query.setInteger("ID", 2);
     List<Employee> list=query.list();
     for(int i=0; i<list.size(); i++) {
    	 System.out.println("Name:" +list.get(i).getE_Name());
    	 }
     System.out.println(">>>>>>>"+list.size());
     if(!list.isEmpty()) {
    	 Employee e =(Employee) list.get(0);
    	 System.out.println(e);
     }




		
	}

}
