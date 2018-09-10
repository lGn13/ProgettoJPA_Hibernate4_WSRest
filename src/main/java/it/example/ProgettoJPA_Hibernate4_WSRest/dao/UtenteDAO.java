package it.example.ProgettoJPA_Hibernate4_WSRest.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import it.example.ProgettoJPA_Hibernate4_WSRest.entity.Utente;


public class UtenteDAO {

	
	//private static final Map<Integer, Utente> empMap = new HashMap<Integer, Utente>();
 
    public static Utente getUtente(String username,String password) {
    	
    	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ProgettoJPA_Hibernate4_WSRest");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		String query1 = "SELECT u FROM Utente u join fetch u.cred c WHERE c.username='" + username + "' and password='" + password + "')";

		List<Utente> utenti = entitymanager.createQuery(query1).getResultList();
		if (!utenti.isEmpty()) {
			
			
			entitymanager.getTransaction().commit();
			entitymanager.close();
			
			return utenti.get(0);
		}
		else {
			return null;
		}
    	
    	
    	
    	
        //return empMap.get(empNo);
    }
 
     
    List<Utente> list;
}
