package asw.instagnam.ricetteseguite.domain;

import java.util.Collection;
import java.util.logging.Logger;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import asw.instagnam.connessioni.api.event.ConnessioneCreatedEvent;
import asw.instagnam.connessioni.api.event.ConnessioneServiceEventChannel;

@Component
public class ConnessioneDomainEventConsumer {
	@Autowired 
	private ConnessioniService connessioniService; 
	
	@Autowired
	private RicetteSeguiteService ricetteSeguiteService; 
	
	@Autowired
	private RicetteService ricetteService; 
	
	private final Logger logger = Logger.getLogger(ConnessioneDomainEventConsumer.class.toString()); 

	@KafkaListener(topics = ConnessioneServiceEventChannel.channel)
	public void listen(ConsumerRecord<String, ConnessioneCreatedEvent> record) throws Exception {
		ConnessioneCreatedEvent event = record.value();
		logger.info("E' stata creata una nuova connessione: " + event.toString());
		Connessione connessione=connessioniService.createConnessione(event.getId(), event.getFollowed(), event.getFollower());
		Collection<Ricetta> listRicetteByAutore=ricetteService.getRicetteByAutore(connessione.getFollowed());
		if(listRicetteByAutore!=null) {
			for(Ricetta ricetta: listRicetteByAutore) {
				RicettaSeguita ricettaSeguita=ricetteSeguiteService.createRicettaSeguita(connessione.getFollower(), ricetta.getId(), ricetta.getAutore(), ricetta.getTitolo());
				logger.info("Da una nuova connessione e' stata creata una nuova ricetta seguita: " + ricettaSeguita.toString());
			}
		}
	}
}
