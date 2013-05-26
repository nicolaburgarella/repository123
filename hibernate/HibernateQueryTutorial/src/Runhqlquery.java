import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Runhqlquery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Query q = s.createQuery("select g from Games g");
		//Query q = s.createQuery("from Games"); equivalente a sopra
		List <Games> g1 = q.list();
		System.out.println("data loaded here");
		for(Games g2:g1){
			System.out.println(g2.getId());
			System.out.println(g2.getName());
			System.out.println(g2.getSpace());
			System.out.println(g2.getType());
		}
		
		//non carico tutta la tabella(utile per tabelle con tante tabelle, ma ne utilizzo solo due)
		System.out.println("this is the second query");
		Query q2 =s.createQuery("select g.id, g.name from Games g");
		List l1 = q2.list();
		Iterator i = l1.iterator();
		while(i.hasNext()){
			
			Object[] obj=(Object[])i.next();
			int id=(Integer)obj[0];
			String name=(String)obj[1];
			System.out.println(id);
			System.out.println(name);
		}
		
		//non carico tutta la tabella(utile per tabelle con tante tabelle, ma solo una relativa al nome)
				System.out.println("this is the third query");
				Query q3 =s.createQuery("select g.name from Games g");
				List l2 = q3.list();
				Iterator i2 = l2.iterator();
				while(i2.hasNext()){
					
					Object obj=(Object)i2.next();
					String name=(String)obj;
					System.out.println(name);
				}
		
		s.flush();
		s.close();
				
	}

}
