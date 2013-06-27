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
		
		//Criteria criteria = session.createCriteria(UserDetails.class);
		/*criteria.add(Restrictions.eq("userName", "User 4"))
				.add(Restrictions.gt("userID", 34))
				.add(Restrictions.like("userName", "User 1%"))
				.add(Restrictions.between("userID", 30, 35));*/
		
		//criteria.add(Restrictions.or(Restrictions.between("userID", 31, 35), Restrictions.between("userID", 36, 40)));
		
		//Criteria criteria = session.createCriteria(UserDetails.class)
		//		.setProjection(Projections.property("userID"));
		
		//Criteria criteria = session.createCriteria(UserDetails.class)
			//			.setProjection(Projections.max("userID"));
		
		//Criteria criteria = session.createCriteria(UserDetails.class)
			//	.addOrder(Order.desc("userID"));
		
		//Criteria criteria = session.createCriteria(UserDetails.class)
		//	.setProjection(Projections.property("userID"));
		
		/*UserDetails exampleUser = new UserDetails();
		exampleUser.setUserID(5);
		//exampleUser.setUserName("User 5");
		
		Example example = Example.create(exampleUser).excludeProperty("userName");
		//Example example = Example.create(exampleUser);
		
		Criteria criteria = session.createCriteria(UserDetails.class)
				.add(example); */
		
		UserDetails exampleUser = new UserDetails();
		exampleUser.setUserID(5);
		exampleUser.setUserName("User 1%");
		
		//Example example = Example.create(exampleUser).excludeProperty("userName");
		//Example example = Example.create(exampleUser);
		Example example = Example.create(exampleUser).enableLike();
		
		Criteria criteria = session.createCriteria(UserDetails.class)
				.add(example);
		
		
		List <UserDetails> users = (List <UserDetails>) criteria.list();
		

		//System.out.println("Size of list result = "+ users.size());
		
		for (UserDetails u: users)
			System.out.println(u.getUserName());
		
	}

}
