package hibernate2nd;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class AppMain {

	public static void main(String[] args) {

		/* static Employee userObj;
		    static Session sessionObj;
		    static SessionFactory sessionFactoryObj;
		 
		    private static SessionFactory buildSessionFactory() {
		        // Creating Configuration Instance & Passing Hibernate Configuration File
		        Configuration configObj = new Configuration();
		        configObj.configure("hibernate.cfg.xml");
		 
		        // Since Hibernate Version 4.x, ServiceRegistry Is Being Used
		        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 
		 
		        // Creating Hibernate SessionFactory Instance
		        sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
		        return sessionFactoryObj;
		    }
		 
		    public static void main(String[] args) {
		        System.out.println(".......Hibernate Maven Example.......\n");
		        try {
		            sessionObj = buildSessionFactory().openSession();
		            sessionObj.beginTransaction();
		 
		          //  for(int i = 101; i <= 102; i++) {
		         
		                userObj.setUserid(1);
		                userObj.setUsername("Pravalika");
		                userObj.setUsercity("Hyderabad");
		                		 
		                sessionObj.save(userObj);
		          //  }
		            System.out.println("\n.......Records Saved Successfully To The Database.......\n");
		 
		            // Committing The Transactions To The Database
		            sessionObj.getTransaction().commit();
		        } catch(Exception sqlException) {
		            if(null != sessionObj.getTransaction()) {
		                System.out.println("\n.......Transaction Is Being Rolled Back.......");
		                sessionObj.getTransaction().rollback();
		            }
		            sqlException.printStackTrace();
		        } finally {
		            if(sessionObj != null) {
		                sessionObj.close();
		            }
		        }
		    }
					 
			}*/
				
SessionFactory factory= new Configuration().configure().buildSessionFactory();
      	
    	Session ses= factory.openSession();
    	customers item1=new customers();
    	item1.setUserid(1);
    	item1.setUsername("Pravalika");
    	item1.setUseraddress("Karimnagar");
    	
    	customers item2=new customers();
    	item2.setUserid(2);
    	item2.setUsername("Ayesha");
    	item1.setUseraddress("Hyderabad");

    	
    	List<customers> l1=new ArrayList<customers>();
    	l1.add(item1);
    	l1.add(item2);
    	
         Transaction tx=ses.beginTransaction();
         ses.save(item1);
    	 ses.save(item2);
    	
    	tx.commit();
        ses.close();
    	factory.close();
    	
    	
    }

		
	}


