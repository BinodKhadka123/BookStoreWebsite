package com.bookstore.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bookstore.entity.Category;

class CategoryDAOTest extends BaseDAOTest {
	private static CategoryDAO categoryDAO;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		BaseDAOTest.setUpBeforeClass();
		categoryDAO=new CategoryDAO(entityManager);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	BaseDAOTest.tearDownAfterClass();
	}

	/*@Test
	void testCategoryDAO() {
		fail("Not yet implemented");
	}*/

	/*@Test
	void testCreateCategory() {
	Category category=new Category("Health");
	Category cat=categoryDAO.create(category);
	assertTrue(cat!=null && cat.getCategoryId()>0);
	}*/

	/*@Test
	void testUpdateCategory() {
		Category category=new Category("Java Core");
		category.setCategoryId(1);
		Category cat=categoryDAO.update(category);
		assertEquals(category.getName(), cat.getName());
		
	}

	@Test
	void testGet() {
		Integer categoryId=1;
		Category cat=categoryDAO.get(categoryId);
		assertNotNull(cat);
		
	}*/

	/*@Test
	void testDeleteObject() {
	Integer categoryId=12;
	categoryDAO.delete(categoryId);
	Category cat=categoryDAO.get(categoryId);
	assertNull(cat);
	}*/

	/*@Test
	void testListAll() {
		List<Category>listCat=categoryDAO.listAll();
		assertTrue(listCat.size()>0);
	}*/

	/*@Test
	void testCount() {
	long total=categoryDAO.count();
	assertEquals(total,4);
	
	}*/
	
	@Test
	public void testFindByName() {
		String name="Java Core";
		Category category=categoryDAO.findByName(name);
		assertNotNull(category);
	}
	@Test
	public void testFindByNameNotFound() {
		String name="Java Core1";
		Category category=categoryDAO.findByName(name);
		assertNull(category);
	}
}
