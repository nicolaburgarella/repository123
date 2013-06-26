package org.koushik.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.koushik.javabrains.dto.Address;
import org.koushik.javabrains.dto.UserDetails;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user = new UserDetails();
		//user.setUserID(1);
		
		user.setUserName("First User");
		
		Address addr1 = new Address();
		addr1.setCity("First City");
		addr1.setState("First State");
		addr1.setStreet("First Street");
		addr1.setPincode("100001");
		
		Address addr2 = new Address();
		addr2.setCity("Second City");
		addr2.setState("Second State");
		addr2.setStreet("Second Street");
		addr2.setPincode("200002");
		
		user.getListOfAddresses().add(addr1);
		user.getListOfAddresses().add(addr2);
		
		
		//user.setAddress("First Usr's address");
		//user.setJoinedDate(new Date());
		//user.setDescription("Description of the user goes here");
		
		//UserDetails user2 = new UserDetails();
		//user2.setUserName("Second User");
		
		/*
		Address addr = new Address();
		addr.setCity("Street Name");
		addr.setState("City Name");
		user.setHomeAddress(addr);
		
		Address addr2 = new Address();
		addr2.setCity("Second Street Name");
		addr2.setState("Second City Name");
		user.setOfficeAddress(addr2);
		*/
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		//session.save(user2);
		session.getTransaction().commit();
		session.close();
		user=null;
		
		/*session = sessionFactory.openSession();
		session.beginTransaction();
		user= (UserDetails) session.get(UserDetails.class, 1);
		System.out.println("User name retrieved is "+ user.getUserName());*/
		
		session = sessionFactory.openSession();
		user= (UserDetails) session.get(UserDetails.class, 1);
		session.close();
		System.out.println(user.getListOfAddresses().size());
		
		

	}

}
