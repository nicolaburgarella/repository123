package org.koushik.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.koushik.javabrains.dto.Address;
import org.koushik.javabrains.dto.FourWheeler;
import org.koushik.javabrains.dto.TwoWheeler;
import org.koushik.javabrains.dto.UserDetails;
import org.koushik.javabrains.dto.Vehicle;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		/*Query query = session.createQuery("from UserDetails");
		query.setFirstResult(3);
		query.setMaxResults(2);
		List <UserDetails> users = (List <UserDetails>) query.list();
		*/
		
		Query query = session.createQuery("select userName from UserDetails");
		List <String> userNames = (List <String>) query.list();
		session.getTransaction().commit();
		session.close();
		//System.out.println("Size of list result = "+ users.size());
		
		/*for (UserDetails u: users)
			System.out.println(u.getUserName());*/
		
		for (String u: userNames)
			System.out.println(u);
		
		
	}

}
