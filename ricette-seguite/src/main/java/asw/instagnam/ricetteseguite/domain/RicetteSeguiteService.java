package asw.instagnam.ricetteseguite.domain;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*; 

@Service 
public class RicetteSeguiteService {

	@Autowired
	private RicetteSeguiteRepository ricetteSeguiteRepository;

	public RicettaSeguita createRicettaSeguita(String utenteFollower, Long idRicetta, String autoreRicetta, String titoloRicetta) {
		RicettaSeguita ricettaSeguita = new RicettaSeguita(utenteFollower, idRicetta, autoreRicetta,titoloRicetta); 
		ricettaSeguita = ricetteSeguiteRepository.save(ricettaSeguita);
		
		return ricettaSeguita;
	}
	
	/* Trova le ricette (in formato breve) degli utenti seguiti da utente. */ 
	public Collection<RicettaSeguita> getRicetteSeguite(String utente) {
		return ricetteSeguiteRepository.findAllByUtenteFollower(utente);
	}
	
}
