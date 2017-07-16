package com.myProject01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateLogin
 */
public class ValidateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("Name");
		String password = request.getParameter("Pass");
        
        if(username.equals("shaukat") && password.equals("pune")) {
        response.getWriter().println("<html><body><Marquee>Welcome to JSP!!!");
        response.getWriter().println("<h1>");        
        response.getWriter().println(username);
        response.getWriter().println("</h1>");        
        response.getWriter().println("</marquee></body></html>");
        
       	
	    	request.setAttribute("message",username);
	        request.getRequestDispatcher("/ValidUser.jsp").forward(request, response);
        } 
        else
        {
        String message = "OOps!!! Invalid Username/Password";
    	request.setAttribute("message", message);
        request.getRequestDispatcher("/InvalidUser.jsp").forward(request, response);
        }
		doGet(request, response);
	}

}
