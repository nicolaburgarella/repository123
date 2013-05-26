import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Insertr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("States.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx = s.beginTransaction();
		
		States st= new States();
		st.setId(2);
		st.setName("ap");
		
		Cities ct1 = new Cities();
		ct1.setId(4);
		ct1.setName("df");
		
		Cities ct2 = new Cities();
		ct2.setId(5);
		ct2.setName("vbd");
		
		Cities ct3 = new Cities();
		ct3.setId(6);
		ct3.setName("san-sfd");
		
		List <Cities> c = new ArrayList <Cities> ();
		c.add(ct1);
		c.add(ct2);
		c.add(ct3);
		
		st.setCity(c);
		
		s.save(st);
		s.save(ct1);
		s.save(ct2);
		s.save(ct3);
		tx.commit();
		s.close();
		
		

	}

}
