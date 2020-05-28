package asw.instagnam.ricette.rest;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateRicettaRequest {

	private String autore; 
	private String titolo; 
	private String preparazione;
	
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

