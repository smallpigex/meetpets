package app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="petdetail")
public class PetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	private String id;
	private String phome_id;
	private String name;
	private String address;
	private String description;
	private String pic_url1;
	private String pic_url2;
	private String pic_url3;
	private int type;
	
	public PetDetail(String homeId, String name, String address, String description, String picUrl1,
	    String picUrl2, String picUrl3, int type){
	  this.phome_id = homeId;
	  this.name = name;
	  this.address = address;
	  this.description = description;
	  this.pic_url1 = picUrl1;
	  this.pic_url2 = picUrl2;
	  this.pic_url3 = picUrl3;
	  this.type = type;
	  
	}
	
	public PetDetail(){
	  
	};

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPhome_id() {
    return phome_id;
  }

  public void setPhome_id(String phome_id) {
    this.phome_id = phome_id;
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

  public String getPic_url1() {
    return pic_url1;
  }

  public void setPic_url1(String pic_url1) {
    this.pic_url1 = pic_url1;
  }

  public String getPic_url2() {
    return pic_url2;
  }

  public void setPic_url2(String pic_url2) {
    this.pic_url2 = pic_url2;
  }

  public String getPic_url3() {
    return pic_url3;
  }

  public void setPic_url3(String pic_url3) {
    this.pic_url3 = pic_url3;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }
	
	
	
}
