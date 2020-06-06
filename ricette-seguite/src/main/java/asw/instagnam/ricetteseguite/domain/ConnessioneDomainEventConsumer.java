package asw.instagnam.ricetteseguite.domain;

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
	
	@KafkaListener(topics = ConnessioneServiceEventChannel.channel)
	public void listen(ConsumerRecord<String, ConnessioneCreatedEvent> record) throws Exception {
		ConnessioneCreatedEvent event = record.value();
		System.out.println("E' stata creata una nuova connessione: " + event.toString());
		connessioniService.createConnessione(event.getId(), event.getFollower(), event.getFollowed());
	}
}
