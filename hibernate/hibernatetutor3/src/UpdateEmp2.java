import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UpdateEmp2 {

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
		emp.setId(3);
		emp.setEname("Nicola");
		emp.setMobile(11111);
		emp.setEmail("nicola@gmail.com");
		s.saveOrUpdate(emp); //salva qualcosa che non esiste se per es 2 non c'è più non lo carica ma appunto vi è un setiid con quel numero
		s.flush();  //sync to the database
		tx.commit();
		s.close();
		

	}

}
