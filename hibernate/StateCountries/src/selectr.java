import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class selectr {

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
		
		States st= (States) s.get(States.class,new String("Texas"));
		System.out.println("after here 1 - prove lazy option uguale a true non carica tutto assieme cities comprese: solo quando viene effettivamente chiamato dopo nel for, invece con lazy false fa tutto al primo step");
		List <Cities> city= st.getCity();
		for (Cities c:city){
			System.out.println(c.getName());	
		}
		s.close();
		
				
	}

}
