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
	private String lat;
	private String lng;
	private String description;
	private String uid;
	
	public PetHome(String name, String lat, String lng, String description, String uid){
	  this.name = name;
	  this.lat = lat;
	  this.lng = lng;
	  this.description = description;
	  this.uid = uid;
	  
	}
	
	public PetHome(){
	  
	};
	
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

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getLng() {
    return lng;
  }

  public void setLng(String lng) {
    this.lng = lng;
  }
	
}
