package asw.instagnam.ricetteseguite.domain;

import java.util.Collection;
import java.util.logging.Logger;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import asw.instagnam.ricette.api.event.RicettaCreatedEvent;
import asw.instagnam.ricette.api.event.RicettaServiceEventChannel;

@Component
public class RicettaDomainEventConsumer {
	@Autowired 
	private RicetteService ricetteService; 
	@Autowired
	private RicetteSeguiteService ricetteSeguiteService; 
	@Autowired
	private ConnessioniService connessioniService; 
	
	private final Logger logger = Logger.getLogger(RicettaDomainEventConsumer.class.toString()); 
	
	@KafkaListener(topics = RicettaServiceEventChannel.channel)
	public void listen(ConsumerRecord<String, RicettaCreatedEvent> record) throws Exception {
		RicettaCreatedEvent event = record.value();
		logger.info("E' stata creata una nuova ricetta: " + event.toString());
		Ricetta ricetta=ricetteService.createRicetta(event.getId(), event.getAutore(), event.getTitolo());

		Collection<Connessione> listFollowersByAutore=connessioniService.getConnessioniByFollowed(ricetta.getAutore());
		if(listFollowersByAutore!=null) {
			for(Connessione connessione: listFollowersByAutore) {
				RicettaSeguita ricettaSeguita=ricetteSeguiteService.createRicettaSeguita(connessione.getFollower(), ricetta.getId(), ricetta.getAutore(), ricetta.getTitolo());
				logger.info("Da una nuova ricetta e' stata creata una nuova ricetta seguita: " + ricettaSeguita.toString());
			}
		}
	}
}
