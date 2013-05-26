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
		cfg.configure("games.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Games g = new Games();
		g.setId(1);
		g.setName("nfs");
		g.setSpace(500);
		Rpg r = new Rpg();
		r.setId(2);
		r.setName("ninjagaiden");
		r.setSpace(7000);
		Arcade a = new Arcade();
		a.setId(3);
		a.setName("tekken");
		a.setSpace(600);
		s.save(g);
		s.save(r);
		s.save(a);
		s.flush();
		tx.commit();
		
		

	}

}
