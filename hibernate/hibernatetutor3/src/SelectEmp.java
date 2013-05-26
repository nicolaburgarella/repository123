import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SelectEmp {

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
		Employee emp = (Employee)s.get(Employee.class, new Integer(1));
		//Employee emp = (Employee)s.load(Employee.class, new Integer(1)); //se non sono certo che c'è meglio usare get
		System.out.println(emp.getId());
		System.out.println(emp.getEmail());
		System.out.println(emp.getEname());
		System.out.println(emp.getMobile());
		s.close();
		
		
		
		
		

	}

}
