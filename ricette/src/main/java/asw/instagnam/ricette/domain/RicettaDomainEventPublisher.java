package asw.instagnam.ricette.domain;

import asw.instagnam.ricette.api.event.DomainEvent;

public interface RicettaDomainEventPublisher {
	public void publish(DomainEvent event);
}
