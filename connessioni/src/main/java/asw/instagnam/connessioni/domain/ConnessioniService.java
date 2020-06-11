package asw.instagnam.connessioni.domain;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import asw.instagnam.connessioni.api.event.ConnessioneCreatedEvent;
import asw.instagnam.connessioni.api.event.DomainEvent; 

@Service
public class ConnessioniService {

	@Autowired
	private ConnessioniRepository connessioniRepository;
	
	@Autowired
	private ConnessioneDomainEventPublisher domainEventPublisher;
	
	public boolean checkIfEmpty() {
		return connessioniRepository.count() == 0 ? true : false;
	}

 	public Connessione createConnessione(String follower, String followed) {
		Connessione connessione = createConnessioneInit(follower, followed); 
		DomainEvent event = new ConnessioneCreatedEvent(connessione.getId(), connessione.getFollowed(), connessione.getFollower());
		domainEventPublisher.publish(event);
		return connessione;
	}
 	
 	public Connessione createConnessioneInit(String follower, String followed) {
		Connessione connessione = new Connessione(follower, followed); 
		connessione = connessioniRepository.save(connessione);
		return connessione;
	}

 	public Connessione getConnessione(Long id) {
		Connessione connessione = connessioniRepository.findById(id).orElse(null);
		return connessione;
	}

 	public Collection<Connessione> getConnessioni() {
		Collection<Connessione> connessioni = connessioniRepository.findAll();
		return connessioni;
	}

	public Collection<Connessione> getConnessioniByFollower(String follower) {
		Collection<Connessione> connessioni = connessioniRepository.findAllByFollower(follower);
		return connessioni;
	}

}
