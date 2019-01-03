package com.myFirstApp.dao;
import java.util.List;
import com.myFirstApp.beans.*;

	
	
	

	public interface UtilisateurDao {
	    void ajouter( Utilisateur utilisateur );
	    List<Utilisateur> lister();
	}


