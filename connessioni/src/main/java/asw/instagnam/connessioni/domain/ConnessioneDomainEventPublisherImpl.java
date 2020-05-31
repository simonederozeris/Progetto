package asw.instagnam.connessioni.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import asw.instagnam.connessioni.api.event.ConnessioneServiceEventChannel;
import asw.instagnam.connessioni.api.event.DomainEvent;

@Component
public class ConnessioneDomainEventPublisherImpl implements ConnessioneDomainEventPublisher {

	@Autowired
	private KafkaTemplate<String, DomainEvent> template;
	private String channel = ConnessioneServiceEventChannel.channel;
	public void publish(DomainEvent event) {
		template.send(channel, event);
	}

}
