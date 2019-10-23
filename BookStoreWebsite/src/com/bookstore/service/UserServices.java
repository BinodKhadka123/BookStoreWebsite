package com.bookstore.service;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.bookstore.controller.admin.userDAO;
import com.bookstore.dao.UserDAO;
import com.bookstore.entity.Users;

public class UserServices {
	//private EntityManagerFactory  entityManagerFactory;
	private EntityManager entityManager;
	private UserDAO userDAO;
	private HttpServletRequest request;
	private HttpServletResponse response;
	/*public UserServices() {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		userDAO=new UserDAO(entityManager);
	}*/
	/*public UserServices(HttpServletRequest request,HttpServletResponse response) {
		this.request=request;
		this.response=response;
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		userDAO=new UserDAO(entityManager);
	}*/

	public UserServices(EntityManager entityManager,HttpServletRequest request,HttpServletResponse response) {
		this.request=request;
		this.response=response;
		this.entityManager=entityManager;
		userDAO=new UserDAO(entityManager);
	}
	
	
	
	/*public 	void  listUsers(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		listUsers(request, response,null);
	}*/

	public 	void  listUsers()throws ServletException, IOException {
		listUsers(null);
	}
	
	
	/*public 	void  listUsers(HttpServletRequest request,HttpServletResponse response,String message)throws ServletException, IOException {
		List<Users>listUsers=userDAO.listAll();
		request.setAttribute("listUsers", listUsers);
		//request.setAttribute("message", "New Users has been created sucessfully");
		if(message!=null) {
		request.setAttribute("message", message);
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("user_list.jsp");
		requestDispatcher.forward(request, response);
		
		//return listUsers;
		

	}*/
	public 	void  listUsers(String message)throws ServletException, IOException {
	List<Users>listUsers=userDAO.listAll();
	request.setAttribute("listUsers", listUsers);
	//request.setAttribute("message", "New Users has been created sucessfully");
	if(message!=null) {
	request.setAttribute("message", message);
	}
	RequestDispatcher requestDispatcher=request.getRequestDispatcher("user_list.jsp");
	requestDispatcher.forward(request, response);
	
	//return listUsers;
	

}
	/*public void createUser(String email,String fullName,String password) {
		Users newUsers=new Users(email,fullName,password);
		userDAO.create(newUsers);
	}*/
	//public void createUser(Users user) {
	
	/*public void createUser(HttpServletRequest request,HttpServletResponse response) {
		String email=request.getParameter("exampleInputEmail1");
		String fullName=request.getParameter("exampleFullName1");
		String password=request.getParameter("exampleInputPassword1");
		Users newUsers=new Users(email,fullName,password);
		userDAO.create(newUsers);
		
		//need to check user having two email or not
		/*Users existUser=userDAO.findWithNamedQuery(email);
		if(existUser!=null) {
			String message="Couldn't create user with email"+email+"already exists";
			request.setAttribute("message",message);
			RequestDispatcher rd=request.getRequestDispatcher("message.jsp");
			rd.forward(request,response);
			
		}
		else {
			
			userDAO.create(newUsers);
		
	}*/
		
	//}
	
/*public void createUser() {
	String email=request.getParameter("exampleInputEmail1");
	String fullName=request.getParameter("exampleFullName1");
	String password=request.getParameter("exampleInputPassword1");
	Users newUsers=new Users(email,fullName,password);
	userDAO.create(newUsers);
}*/
public void createUser() throws ServletException, IOException {
	String email=request.getParameter("exampleInputEmail1");
	String fullName=request.getParameter("exampleFullName1");
	String password=request.getParameter("exampleInputPassword1");
	

	//need to check user having two email or not
	Users existUser=userDAO.findByEmail(email);
	if(existUser!=null) {
		String message="Couldn't create user with email"+email+"already exists";
		request.setAttribute("message",message);
		RequestDispatcher rd=request.getRequestDispatcher("message.jsp");
		rd.forward(request,response);
	}
	else {
	Users newUsers=new Users(email,fullName,password);
	userDAO.create(newUsers);
	}
}


public void editUser() throws ServletException, IOException {
	int userId=Integer.parseInt(request.getParameter("id"));
	Users users=userDAO.get(userId);
	//System.out.println(users.getFullName());//output printed in the console
	request.setAttribute("user", users);
	RequestDispatcher rd=request.getRequestDispatcher("user_form.jsp");
	rd.forward(request,response);
	
	
}


public void updateUser() throws ServletException, IOException {
	int userId=Integer.parseInt(request.getParameter("userId"));//from the hidden field that is specified in user_form
	String email=request.getParameter("exampleInputEmail1");
	String fullName=request.getParameter("exampleFullName1");
	String password=request.getParameter("exampleInputPassword1");
	
	Users userById=userDAO.get(userId);
	Users userByEmail=userDAO.findByEmail(email);
	if(userByEmail!=null && userByEmail.getUserId()!=userById.getUserId())
	{
		System.out.println(userByEmail.getUserId());
		System.out.println(userById.getUserId());
		String message="Couldn't update users.User with email"+email+ "already exists.";
		request.setAttribute("message",message);
		RequestDispatcher rd=request.getRequestDispatcher("message.jsp");
		rd.forward(request,response);
	}
	//System.out.println(userId+","+email+","+fullName+","+password);
	else {
	Users user =new Users(userId,email,fullName,password);
	userDAO.update(user);
	listUsers("User has been sucessfully updated");
	
}
}


public void deleteUser() throws ServletException, IOException {
	int userId=Integer.parseInt(request.getParameter("id"));//embedded in the url
	userDAO.delete(userId);
	listUsers("User has been deleted sucessfully");
}
}
