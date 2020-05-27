package asw.instagnam.ricette.domain;

import javax.persistence.*; 

import lombok.*; 

/* Ricetta, in formato completo. */ 
@Entity 
@Data @NoArgsConstructor
public class RicettaCompleta {

	@Id 
	@GeneratedValue
	private Long id; 
	private String autore; 
	private String titolo; 
	private String preparazione; 
	
	public RicettaCompleta(String autore, String titolo, String preparazione) {
		this.autore = autore; 
		this.titolo = titolo; 
		this.preparazione = preparazione; 
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

	public String getPreparazione() {
		return preparazione;
	}

	public void setPreparazione(String preparazione) {
		this.preparazione = preparazione;
	}
}
