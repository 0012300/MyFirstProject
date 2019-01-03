package com.myFirstApp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Authentification
 */
@WebServlet("/Authentification")
public class Authentification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authentification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 this.getServletContext().getRequestDispatcher("/WEB-INF/vue/authentification.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom= request.getParameter("nom");
		String login = request.getParameter("login");
		
		if (nom.equals("fadwa") && login.equals("sallem")){
			HttpSession session= request.getSession();
			
			session.setAttribute("nom", nom);
			session.setAttribute("login", login);
			
			  this.getServletContext().getRequestDispatcher("/WEB-INF/vue/home.jsp").forward(request, response);	
			  
			
		}
		else {
			
			String reponse="accées refusé!!";
			request.setAttribute("reponse", reponse);
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/vue/authentification.jsp").forward(request, response);
			
			
		}
		
		
	}

}
