package app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pethome")
public class PetHome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	private String id;
	private String name;
	private String latitude;
	private String logtitude;
	private String description;
	private String uid;
	
	public PetHome(String name, String latitude, String logtitude, String description, String uid){
	  this.name = name;
	  this.latitude = latitude;
	  this.logtitude = logtitude;
	  this.description = description;
	  this.uid = uid;
	  
	}
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
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }
	
}
