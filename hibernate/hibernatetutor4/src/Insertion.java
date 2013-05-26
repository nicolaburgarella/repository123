import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Insertion {

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
		
		Country c = new Country();
		c.setId(1);
		c.setName("china");
		c.setPopulation(80);
		
		/*Employee emp = (Employee)s.get(Employee.class, new Integer(1)); //ne sto caricando uno
		System.out.println(emp.getId());
		System.out.println(emp.getEname());
		System.out.println(emp.getMobile());
		System.out.println(emp.getEmail()); */
		
		Student sd = new Student();
		sd.setId(1);
		sd.setName("Nicola2");
		s.save(c);
		s.save(sd);
		s.flush();
		tx.commit();
		s.close();

	}

}
