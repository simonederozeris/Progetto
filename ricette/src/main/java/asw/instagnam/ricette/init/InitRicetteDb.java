package asw.instagnam.ricette.init;

import asw.instagnam.ricette.domain.*; 

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

import org.springframework.beans.factory.annotation.Autowired;

@Component
public class InitRicetteDb implements CommandLineRunner {

	@Autowired 
	private RicetteService ricetteService; 

	public void run(String[] args) {	
		if (ricetteService.checkIfEmpty()) {
			ricetteService.createRicettaInit( "Cristiano", "Panino al prosciutto", "Metti il prosciutto nel panino" );	
			ricetteService.createRicettaInit( "Cristiano", "Pizza e mortazza", "Metti la mortadella nella pizza" );	
			ricetteService.createRicettaInit( "Gennaro", "Tonno e fagioli", "Unisci i fagioli con il tonno" );	
			ricetteService.createRicettaInit( "Antonino", "Pizza margherita", "... e alla fine inforna" );	
			ricetteService.createRicettaInit( "Benedetta", "Tonno e fagioli", "Unisci il tonno con i fagioli" );
		}
	}

}
