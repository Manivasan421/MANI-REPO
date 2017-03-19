package com.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate.support.HibernateDaoSupport;

import com.UserBean;
import com.bean.bean;


public class daoclass {
	
	private SessionFactory mySessionFactory;
	public void saveUser(bean user){
		Session session = getSessionFactory().openSession();
		try
		{
			Transaction tx = session.beginTransaction();
			session.save(user);
			tx.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}

	}
	
	public void updateUser(bean user){
		Session session = getSessionFactory().openSession();
		try
		{
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(user);
			tx.commit();
			System.out.println("update success");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}

	}
	
	public void deleteUser(bean user){
		Session session = getSessionFactory().openSession();
		try
		{
			Transaction tx = session.beginTransaction();
			
			bean employee = (bean) session.load(bean.class, user.userId);
			session.delete(employee);
			tx.commit();
			System.out.println("delete");
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}

	}
	
	public String listNames(String user){
		Session session = getSessionFactory().openSession();
		String s=user.substring(0, 7);
		System.out.println(s);
		String a=new String();
		try
		{
			Transaction tx = session.beginTransaction();
			Criteria cr = session.createCriteria(bean.class);
			cr.add(Restrictions.ilike("month", s+"%"));
			cr.setProjection(Projections.property("projectname"));
			List results = cr.list();
			
			Iterator r=results.iterator();
			
			while(r.hasNext())
	        {
	            a+=(String) r.next()+",";

	        }
			System.out.println(a);
			//System.out.println(results.size());
			 
			tx.commit();
			return a;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return a;

	}
	
	
	public bean details(String user){
		Session session = getSessionFactory().openSession();
		String a=new String();
		 List results=new ArrayList<String>();
		try
		{
			Transaction tx = session.beginTransaction();
			
			  Criteria criteria = session.createCriteria(bean.class);
			              criteria.add(Restrictions.eq("projectname", user));
			              bean employee = (bean) criteria.uniqueResult();
			              tx.commit();
			return employee;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;

	}
	
	

	public SessionFactory getSessionFactory() {
		return mySessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.mySessionFactory = sessionFactory;
	}
}
