import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate1.Product1;
import com.hibernate1.Supplier1;

public class Main {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tr=ses.beginTransaction();
		
		/*Product1 p=new Product1();
		p.setId(104);
		p.setP_Name("Abhi");
		
		Supplier1 s=new Supplier1();
		s.setSid(102);
		s.setSname("Sree");
         p.setP_id(s);*/
         
		//ses.save(p);
		//ses.save(s);
		
		tr.commit();
        ses.close();
		factory.close();
	}

}
