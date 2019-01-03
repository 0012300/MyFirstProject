package com.myFirstApp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myFirstApp.beans.Personne;

/**
 * Servlet implementation class Inscription
 */
@WebServlet("/Inscription")
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name[]= {"nebra","mathieu","john"};
		request.setAttribute("listeName",name);
		
		Personne personne= new Personne();
		personne.setNom("Mathieu");
		personne.setPrenom("Nicole");
		
		request.setAttribute("personne", personne);
		
		
		
		
		
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue/inscription.jsp").forward(request, response);
		 
		 
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String nom=request.getParameter("nom");
	System.out.println(nom);	
		request.setAttribute("nom", nom);
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue/inscription.jsp").forward(request, response);
		
	}

}
