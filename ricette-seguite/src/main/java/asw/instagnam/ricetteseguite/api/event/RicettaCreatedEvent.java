package asw.instagnam.ricetteseguite.api.event;

import asw.instagnam.ricetteseguite.api.event.DomainEvent;

public class RicettaCreatedEvent implements DomainEvent {
	private Long id;
	private String autore;
	private String titolo;
	public RicettaCreatedEvent() {
		super();
	}
	public RicettaCreatedEvent(Long id, String autore, String titolo) {
		super();
		this.id = id;
		this.autore = autore;
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "RicettaCreatedEvent [id=" + id + ", autore=" + autore + ", titolo=" + titolo + "]";
	}
	
}
