package asw.instagnam.ricetteseguite.domain;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import asw.instagnam.ricetteseguite.api.event.RicettaCreatedEvent;
import asw.instagnam.ricetteseguite.api.event.RicettaServiceEventChannel;

@Component
public class RicetteSeguiteDomainEventConsumer {
	@Autowired 
	private RicetteService ricetteService; 
	
	@KafkaListener(topics = RicettaServiceEventChannel.channel)
	public void listen(ConsumerRecord<String, RicettaCreatedEvent> record) throws Exception {
		RicettaCreatedEvent event = record.value();
		System.out.println("E' stata creata una nuova ricetta: " + event.toString());
		ricetteService.createRicetta(event.getId(), event.getAutore(), event.getTitolo());
	}
}
