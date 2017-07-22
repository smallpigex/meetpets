package app.model;

import javax.persistence.Entity;

@Entity
public class PetHome {
	private String id;
	private String name;
	private String latitude;
	private String logtitude;
	private String description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLogtitude() {
		return logtitude;
	}
	public void setLogtitude(String logtitude) {
		this.logtitude = logtitude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
