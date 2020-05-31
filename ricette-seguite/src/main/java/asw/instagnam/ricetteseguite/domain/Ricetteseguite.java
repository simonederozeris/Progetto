package asw.instagnam.ricetteseguite.domain;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class Ricetteseguite {
	@Id 
	@GeneratedValue
	private Long id;
	private String utenteFollower; 
	private Long idRicetta; 
	private String autoreRicetta;
	private String titoloRicetta;
	
	public Ricetteseguite(String utenteFollower, Long idRicetta, String autoreRicetta, String titoloRicetta) {
		super();
		this.utenteFollower = utenteFollower;
		this.idRicetta = idRicetta;
		this.autoreRicetta = autoreRicetta;
		this.titoloRicetta = titoloRicetta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUtenteFollower() {
		return utenteFollower;
	}

	public void setUtenteFollower(String utenteFollower) {
		this.utenteFollower = utenteFollower;
	}

	public Long getIdRicetta() {
		return idRicetta;
	}

	public void setIdRicetta(Long idRicetta) {
		this.idRicetta = idRicetta;
	}

	public String getAutoreRicetta() {
		return autoreRicetta;
	}

	public void setAutoreRicetta(String autoreRicetta) {
		this.autoreRicetta = autoreRicetta;
	}

	public String getTitoloRicetta() {
		return titoloRicetta;
	}

	public void setTitoloRicetta(String titoloRicetta) {
		this.titoloRicetta = titoloRicetta;
	}
	
	
	
}


