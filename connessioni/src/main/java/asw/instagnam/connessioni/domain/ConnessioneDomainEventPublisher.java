package asw.instagnam.connessioni.domain;

import asw.instagnam.connessioni.api.event.DomainEvent;

public interface ConnessioneDomainEventPublisher {
	public void publish(DomainEvent event);
}
