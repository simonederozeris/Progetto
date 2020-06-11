package asw.instagnam.ricetteseguite.domain;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

@Service
public class ConnessioniService {
	@Autowired
	private ConnessioniRepository connessioniRepository;
	//public Collection<Connessione> getConnessioniByFollower(String follower); 
	
	public boolean checkIfEmpty() {
		return connessioniRepository.count() == 0 ? true : false;
	}
	
	public Collection<Connessione> getConnessioniByFollowed(String followed){
		return connessioniRepository.findAllByFollowed(followed);
	}
	
	public Connessione createConnessione(Long id, String follower, String followed) {
		Connessione connessione = new Connessione(id, follower, followed); 
		connessione = connessioniRepository.save(connessione);
		return connessione;
	}
}
