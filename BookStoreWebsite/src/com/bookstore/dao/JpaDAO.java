package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bookstore.entity.Users;

public class JpaDAO<T> {
	// create session factory
	/*SessionFactory factory = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Users.class)
							.buildSessionFactory();
	
	// create session
	Session session = factory.getCurrentSession();*/
	protected EntityManager entityManager;
	public JpaDAO(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	public T create(T t) {
		entityManager.getTransaction().begin();
		entityManager.persist(t);
		entityManager.flush();
		entityManager.refresh(t);
		entityManager.getTransaction().commit();
		return t;
	}
	public T update(T t) {
		entityManager.getTransaction().begin();
		entityManager.merge(t);
		entityManager.getTransaction().commit();
		return t;
		
	}
	public T find(Class<T>type,Object id)
	{
		// start a transaction
		//session.beginTransaction();
		//T t=session.get(type, id);

		// commit transaction
		//session.getTransaction().commit();
		T entity=entityManager.find(type, id);
		entityManager.refresh(entity);
		
		return entity;
	}
	
	public void delete(Class<T>type,Object id) {

		entityManager.getTransaction().begin();
		Object reference=entityManager.getReference(type, id);
		entityManager.remove(reference);
		entityManager.getTransaction().commit();
	}
	public List<T> findWithNamedQuery(String queryNamed)
	{
		Query query=entityManager.createNamedQuery(queryNamed);
		return query.getResultList();
	}
	public List<T> findWithNamedQuery(String queryNamed,String paramName,Object paramValue){
		Query query=entityManager.createNamedQuery(queryNamed);
		query.setParameter(paramName, paramValue);
		return query.getResultList();
		
	}
	public long countWithNamedQuery(String queryNamed) {
		Query query=entityManager.createNamedQuery(queryNamed);
		return (long) query.getSingleResult();
		
	}
	

}
