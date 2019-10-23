package com.bookstore.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseDAOTest {

	protected static 	EntityManagerFactory entityManagerFactory;
	protected static 	EntityManager entityManager;
	static void setUpBeforeClass() throws Exception {
		entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
		 entityManager=entityManagerFactory.createEntityManager();
	}
	static void tearDownAfterClass() throws Exception {
		entityManager.close();
		entityManagerFactory.close();
		
	}
}
