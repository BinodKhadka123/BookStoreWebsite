package com.bookstore.controller.admin.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.controller.BaseServlet;
import com.bookstore.entity.Users;
import com.bookstore.service.UserServices;

@WebServlet("/admin/create_user")
public class CreateUserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("exampleInputEmail1");
		String fullName=request.getParameter("exampleFullName1");
		String password=request.getParameter("exampleInputPassword1");
		
		
		
		//response.getWriter().println("Email:"+email);
		//response.getWriter().println("fullName:"+fullName);
		//response.getWriter().println("password:"+password);
		
		//Users user=new Users(email,fullName,password);
	//UserServices userServices=new UserServices)();
		
	//UserServices userServices=new UserServices(request, response);
		UserServices userServices=new UserServices(entityManager,request, response);
	
	
	//userServices.createUser(email,fullName,password);
	//userServices.createUser(request,response);
	userServices.createUser();
	//userServices.listUsers(request, response,"New User has been successfully created");
	userServices.listUsers("New User has been successfully created");
	
	
	
	}

}
