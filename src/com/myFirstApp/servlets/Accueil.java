package com.myFirstApp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.myFirstApp.beans.Utilisateur;
import com.myFirstApp.dao.DaoFactory;
import com.myFirstApp.dao.UtilisateurDao;
import com.myFirstApp.dao.UtilisateurDaoImpl;

/**
 * Servlet implementation class Accueil
 */
@WebServlet("/Accueil")
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	
	 private UtilisateurDao utilisateurDao;

	    public void init() throws ServletException {
	        DaoFactory daoFactory = DaoFactory.getInstance();
	        this.utilisateurDao = daoFactory.getUtilisateurDao();
	    }
	
    
    public Accueil() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		
		request.setAttribute("listUtilisateurs", utilisateurDao.lister());
		
		
		
		
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue/home.jsp").forward(request, response);
		   
		   
		   
		   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		Utilisateur utilisateur=new Utilisateur();
		
		
	
		
		
	String nom= request.getParameter("nom");
	String prenom= request.getParameter("prenom");
	
    utilisateur.setPrenom(prenom);
    utilisateur.setNom(nom);
	
		
	utilisateurDao.ajouter(utilisateur);
		
		
		
     
		
		doGet(request, response);
	}

}
