package asw.instagnam.ricette.domain;

import lombok.*; 

/* Ricetta, in formato breve. */ 
@Data @NoArgsConstructor
public class Ricetta {

	private Long id; 
	private String autore; 
	private String titolo; 
	
	
	public Ricetta(RicettaCompleta r) {
		this.id = r.getId(); 
		this.autore = r.getAutore(); 
		this.titolo = r.getTitolo(); 
	}

	public Ricetta() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
}

