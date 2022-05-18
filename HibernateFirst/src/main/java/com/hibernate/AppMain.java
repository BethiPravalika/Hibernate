package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {
	
	public static void main( String[] args )
    {
    	SessionFactory factory= new Configuration().configure().buildSessionFactory();
      	
    	Session ses= factory.openSession();
    	Employee item1=new Employee();
    item1.setId(2);
    item1.setName("Pravalika");
    item1.setCity("Karimnagar");
    
    	/*Employee item2=new Employee();
    	item2.setEid(2);
    	item2.setName("Bhagath");
    	item2.setCity("Chandighar");
    	
    	List<Employee> l1=new ArrayList<Employee>();
    	l1.add(item1);
    	l1.add(item2);*/
    	
    Employee e = (Employee)ses.get(Employee.class, 2);
    e.setCity("India");
    e.setName("Srinu");
    System.out.println("Updated successfully");
    ses.getTransaction().commit();
    
    	
    Transaction tx=ses.beginTransaction();
    	//ses.delete(item1);
   // ses.update(item1);
    ses.save(item1);
    	//ses.save(item2);
    
    	tx.commit();
        ses.close();
    	factory.close();
    	
    	
    }

}
