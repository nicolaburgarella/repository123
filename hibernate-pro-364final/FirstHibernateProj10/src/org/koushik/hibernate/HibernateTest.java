package org.koushik.hibernate;

import java.util.Date;

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
		
		UserDetails user = (UserDetails)session.get(UserDetails.class, 1);
		
		//session.save(user);
		//user.setUserName("Updated User");
		//user.setUserName("Updated User Again");
		
		session.getTransaction().commit();
		session.close();
		
		//user.setUserName("Updated User after session close");
		
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.update(user);
		user.setUserName("Change after update");
		session.getTransaction().commit();
		session.close();
		
		
	}

}
