import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Delemp {

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
		Employee emp = (Employee)s.get(Employee.class, new Integer(2));
		emp.setMobile(0);
		s.delete(emp);
		s.flush();  //sync to the database
		tx.commit();
		s.close();
		
		
	}

}
