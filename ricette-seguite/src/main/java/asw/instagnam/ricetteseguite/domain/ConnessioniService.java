package asw.instagnam.ricetteseguite.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

@Service
public class ConnessioniService {
	@Autowired
	private ConnessioniRepository connessioniRepository;
	//public Collection<Connessione> getConnessioniByFollower(String follower); 
	
	public Connessione createConnessione(Long id, String follower, String followed) {
		Connessione connessione = new Connessione(id, follower, followed); 
		connessione = connessioniRepository.save(connessione);
		return connessione;
	}
}
