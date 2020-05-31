package asw.instagnam.connessioni.api.event;

public class ConnessioneCreatedEvent implements DomainEvent {
	private Long id; 
	private String follower; 
	private String followed;
	public ConnessioneCreatedEvent() {
		super();
	}
	public ConnessioneCreatedEvent(Long id, String follower, String followed) {
		super();
		this.id = id;
		this.follower = follower;
		this.followed = followed;
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
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "ConnessioneCreatedEvent [id=" + id + ", follower=" + follower + ", followed=" + followed + "]";
	} 
	
}

