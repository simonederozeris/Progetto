package asw.instagnam.ricetteseguite.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import asw.instagnam.ricetteseguite.domain.*;

@Component
public class InitRicetteSeguiteDb implements CommandLineRunner {

	@Autowired 
	private ConnessioniService connessioniService; 
	
	@Autowired 
	private RicetteService ricetteService; 
	
	@Autowired 
	private RicetteSeguiteService ricetteSeguiteService; 

	public void run(String[] args) {		
		connessioniService.createConnessione(new Long(1),"Cristiano", "Gennaro");
		connessioniService.createConnessione(new Long(2),"Gennaro", "Cristiano");
		connessioniService.createConnessione(new Long(3),"Paolo", "Cristiano");
		connessioniService.createConnessione(new Long(4),"Paolo", "Gennaro");
		connessioniService.createConnessione(new Long(5),"Anna", "Antonino");
		connessioniService.createConnessione(new Long(6),"Anna", "Benedetta");
		
		ricetteService.createRicetta(new Long(1),"Cristiano", "Panino al prosciutto");
		ricetteService.createRicetta(new Long(2),"Cristiano", "Pizza e mortazza");
		ricetteService.createRicetta(new Long(3),"Gennaro", "Tonno e fagioli");
		ricetteService.createRicetta(new Long(4),"Antonino", "Pizza margherita");
		ricetteService.createRicetta(new Long(5),"Benedetta", "Tonno e fagioli");
		
		ricetteSeguiteService.createRicettaSeguita("Gennaro", new Long(1), "Cristiano", "Panino al prosciutto");
		ricetteSeguiteService.createRicettaSeguita("Paolo", new Long(1), "Cristiano", "Panino al prosciutto");
		ricetteSeguiteService.createRicettaSeguita("Gennaro", new Long(2), "Cristiano", "Pizza e mortazza");
		ricetteSeguiteService.createRicettaSeguita("Paolo", new Long(2), "Cristiano", "Pizza e mortazza");
		ricetteSeguiteService.createRicettaSeguita("Cristiano", new Long(3), "Gennaro", "Tonno e fagioli");
		ricetteSeguiteService.createRicettaSeguita("Paolo", new Long(3), "Gennaro", "Tonno e fagioli");
		ricetteSeguiteService.createRicettaSeguita("Anna", new Long(4), "Antonino", "Pizza margherita");
		ricetteSeguiteService.createRicettaSeguita("Anna", new Long(5), "Benedetta", "Tonno e fagioli");




		
		
		
	}
	
}

