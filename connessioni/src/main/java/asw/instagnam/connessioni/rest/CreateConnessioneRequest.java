package asw.instagnam.connessioni.rest;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateConnessioneRequest {

	private String follower; 
	private String followed;
	
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

