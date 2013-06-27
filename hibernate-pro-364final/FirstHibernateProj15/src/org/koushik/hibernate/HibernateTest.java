package org.koushik.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
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
		
		Query query = session.createQuery("from UserDetails user where user.userID=35");
		query.setCacheable(true);
		List users = query.list();
		
		//UserDetails user = (UserDetails)session.get(UserDetails.class, 35);
		//user.setUserName("Updated User");
		//UserDetails user2 = (UserDetails)session.get(UserDetails.class, 35);
		
		session.getTransaction().commit();
		session.close();
		
		
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		
		Query query2 = session2.createQuery("from UserDetails user where user.userID=35");
		query2.setCacheable(true);
		users = query2.list();
		
		//UserDetails user2 = (UserDetails)session2.get(UserDetails.class, 35);
		
		session2.getTransaction().commit();
		session2.close();
		
		
	
	}

}
