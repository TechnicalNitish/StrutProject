package com.struts2.Dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.struts2.hibernateConfig.HibernateUtil;
import com.struts2.pojo.User;

public class UserDaoimpl implements UserDao {

	public void register(User user) {
		SessionFactory sessionFactory = HibernateUtil.getSession();
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();

		session.close();

	}

	public boolean login(String email, String password) {
		
		SessionFactory sessionFactory=HibernateUtil.getSession();
		Session  session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Query query=session.createQuery("from "+User.class.getName()+" where email= :email");
				query.setParameter("email",email);
				User user=(User)query.uniqueResult();
				String password1="";
				if(user!=null)
				{
					password1=user.getPassword();
				}
				else {
					return false;
				}
		
				if(password1!=null)
				{
					if(password1.equals(password))
					{
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			
	}
	
	
	public boolean forget(String email)
	{
		SessionFactory sessionfFactory=HibernateUtil.getSession();
		Session session=sessionfFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Query query=session.createQuery(""+User.class.getName()+"where email=:email");
				query.setParameter("email",email);
				User user=(User)query.uniqueResult();
				if(user!=null)
				{
					return true;
				}
				
				else 
				{
					return false;
				}
	}

}
