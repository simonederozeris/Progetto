package asw.instagnam.ricetteseguite.rest;

import java.util.Collection;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import asw.instagnam.ricetteseguite.domain.RicettaSeguita;
import asw.instagnam.ricetteseguite.domain.RicetteSeguiteService; 

@RestController
public class RicetteSeguiteController {

	private final Logger logger = Logger.getLogger(RicetteSeguiteController.class.toString()); 

	@Autowired 
	private RicetteSeguiteService ricetteSeguiteService;
	

	/* Trova le ricette (in formato breve) degli utenti seguiti da utente. */ 
	@GetMapping("/ricetteseguite/{utente}")
	public Collection<RicettaSeguita> getRicetteSeguite(@PathVariable String utente) {
		logger.info("REST CALL: getRicetteSeguite by "+utente); 
		Collection<RicettaSeguita> ricetteSeguite = ricetteSeguiteService.getRicetteSeguite(utente); 
		return ricetteSeguite;
	}
}
