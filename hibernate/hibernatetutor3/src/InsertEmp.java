import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class InsertEmp {

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
		Employee emp = new Employee();
		emp.setId(1);
		emp.setEname("nicola");
		emp.setMobile(4456);
		emp.setEmail("nicola@ciao.it");
		s.save(emp);  // used for insert
		s.flush();
		tx.commit();
		s.close();

	}

}
