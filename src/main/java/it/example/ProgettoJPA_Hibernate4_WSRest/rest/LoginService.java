package it.example.ProgettoJPA_Hibernate4_WSRest.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import it.example.ProgettoJPA_Hibernate4_WSRest.classes.CredenzialiClass;
import it.example.ProgettoJPA_Hibernate4_WSRest.classes.ProfiloClass;
import it.example.ProgettoJPA_Hibernate4_WSRest.classes.TelefonoClass;
import it.example.ProgettoJPA_Hibernate4_WSRest.classes.UtenteClass;
import it.example.ProgettoJPA_Hibernate4_WSRest.dao.UtenteDAO;
import it.example.ProgettoJPA_Hibernate4_WSRest.entity.Telefono;
import it.example.ProgettoJPA_Hibernate4_WSRest.entity.Utente;
 
@Path("/login")
public class LoginService {
 
    // URI:
    // /contextPath/servletPath/employees/{empNo}
    @GET
    @Path("/{username}/{password}")
    @Produces(MediaType.APPLICATION_JSON)
    public UtenteClass getEmployee(@PathParam("username") String username,@PathParam("password") String password) {
        Utente u = UtenteDAO.getUtente(username,password);
        
        CredenzialiClass cred = new CredenzialiClass(u.getCred().getUsername(), u.getCred().getPassword());
        ProfiloClass profilo = new ProfiloClass(u.getProfilo().getRuolo(),u.getProfilo().getSalario());
        
        
        
        List<TelefonoClass> telList = new ArrayList<>();
        for(Telefono tel : u.getTelList()) {
        	TelefonoClass telefonoClass = new TelefonoClass(tel.getModello(),tel.getAnno());
        	telList.add(telefonoClass);
        	System.out.println(telefonoClass.getModello());
        	System.out.println(telefonoClass.getAnno());
        }
        for(TelefonoClass tel : telList) {
        	System.out.println("Modello: " + tel.getModello());
        	System.out.println("Anno: " + tel.getAnno());
        	System.out.println("---------------");
        }
        
        UtenteClass utente = new UtenteClass(u.getIdUtente(),u.getNome(),u.getCognome(),u.getEmail(),cred,profilo,telList);
        return utente;
    }
 
}