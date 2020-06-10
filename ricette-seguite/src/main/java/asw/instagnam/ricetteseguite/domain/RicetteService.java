package asw.instagnam.ricetteseguite.domain;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

@Service
public class RicetteService {
	@Autowired
	private RicetteRepository ricetteRepository;
	public Collection<Ricetta> getRicetteByAutore(String autore){
		return ricetteRepository.findAllByAutore(autore);
	}
	
	public Ricetta createRicetta(Long id, String autore, String titolo) {
		Ricetta ricetta = new Ricetta(id, autore, titolo); 
		ricetta = ricetteRepository.save(ricetta);
		
		return ricetta;
	}
}
