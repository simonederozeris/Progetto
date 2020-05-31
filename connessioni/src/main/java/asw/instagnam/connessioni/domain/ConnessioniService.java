package asw.instagnam.connessioni.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import asw.instagnam.connessioni.api.event.ConnessioneCreatedEvent;
import asw.instagnam.connessioni.api.event.DomainEvent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.logging.Logger; 
import java.util.*; 

@Service
public class ConnessioniService {

	@Autowired
	private ConnessioniRepository connessioniRepository;
	
	@Autowired
	private ConnessioneDomainEventPublisher domainEventPublisher;

 	public Connessione createConnessione(String follower, String followed) {
		Connessione connessione = new Connessione(follower, followed); 
		connessione = connessioniRepository.save(connessione);
		//DomainEvent event = new ConnessioneCreatedEvent(connessione.getId(), connessione.getFollowed(), connessione.getFollower());
		//domainEventPublisher.publish(event);
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
