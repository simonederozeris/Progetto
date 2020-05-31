package asw.instagnam.ricette.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


import asw.instagnam.ricette.api.event.DomainEvent;
import asw.instagnam.ricette.api.event.RicettaServiceEventChannel;

@Component
public class RicettaDomainEventPublisherImpl implements RicettaDomainEventPublisher {

	@Autowired
	private KafkaTemplate<String, DomainEvent> template;
	private String channel = RicettaServiceEventChannel.channel;
	public void publish(DomainEvent event) {
		template.send(channel, event);
	}

}
