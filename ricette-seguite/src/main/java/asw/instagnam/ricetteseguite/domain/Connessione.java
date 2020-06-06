package asw.instagnam.ricetteseguite.domain;

import javax.persistence.*;

import lombok.*; 
@Entity
@Data @NoArgsConstructor
public class Connessione {

	@Id 
	private Long id; 
	private String follower; 
	private String followed;
	
	public Connessione(Long id, String follower, String followed) {
		super();
		this.id = id;
		this.follower = follower;
		this.followed = followed;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFollower() {
		return follower;
	}
	public void setFollower(String follower) {
		this.follower = follower;
	}
	public String getFollowed() {
		return followed;
	}
	public void setFollowed(String followed) {
		this.followed = followed;
	} 
}
