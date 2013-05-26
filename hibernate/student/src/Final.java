import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Final {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("Student.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Student st = new Student();
		st.setId(8);
		st.setName("george");
		StudentAddress sa = new StudentAddress();
		sa.setId(9);
		sa.setAddress("london");
		sa.setName("brad");
		s.save(st);
		s.save(sa);
		tx.commit();
		s.close();
		

	}

}
