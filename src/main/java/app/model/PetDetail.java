package app.model;

import javax.persistence.Entity;

@Entity
public class PetDetail {
	private String id;
	private String homeId;
	private String name;
	private String address;
	private String description;
	private String picUrl1;
	private String picUrl2;
	private String picUrl3;

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
}
