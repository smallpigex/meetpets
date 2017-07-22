package app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="petDetail")
public class PetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	private String id;
	private String homeId;
	private String name;
	private String address;
	private String description;
	private String picUrl1;
	private String picUrl2;
	private String picUrl3;
	private int type;
	
	public PetDetail(String homeId, String name, String address, String description, String picUrl1,
	    String picUrl2, String picUrl3, int type){
	  this.homeId = homeId;
	  this.name = name;
	  this.address = address;
	  this.description = description;
	  this.picUrl1 = picUrl1;
	  this.picUrl2 = picUrl2;
	  this.picUrl3 = picUrl3;
	  this.type = type;
	  
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHomeId() {
		return homeId;
	}

	public void setHomeId(String homeId) {
		this.homeId = homeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicUrl1() {
		return picUrl1;
	}

	public void setPicUrl1(String picUrl1) {
		this.picUrl1 = picUrl1;
	}

	public String getPicUrl2() {
		return picUrl2;
	}

	public void setPicUrl2(String picUrl2) {
		this.picUrl2 = picUrl2;
	}

	public String getPicUrl3() {
		return picUrl3;
	}

	public void setPicUrl3(String picUrl3) {
		this.picUrl3 = picUrl3;
	}

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }
}
