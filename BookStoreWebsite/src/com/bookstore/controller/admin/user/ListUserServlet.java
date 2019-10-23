package com.bookstore.controller.admin.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.controller.BaseServlet;
import com.bookstore.entity.Users;
import com.bookstore.service.UserServices;

@WebServlet("/admin/list_users")
public class ListUserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    public ListUserServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//UserServices userServices=new UserServices();
		UserServices userServices=new UserServices(entityManager,request,response);

		
		
		//List<Users>users=userServices.listUsers();
		//request.setAttribute("listUsers", users);
		//RequestDispatcher requestDispatcher=request.getRequestDispatcher("user_list.jsp");
		//requestDispatcher.forward(request, response);//
		//userServices.listUsers(request, response,null);//bad pratice
		
		
		//userServices.listUsers(request, response);
		userServices.listUsers();
		
	}


}
