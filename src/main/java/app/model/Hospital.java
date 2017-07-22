package app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospital")
public class Hospital {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String name;
  private String city;
  private String status;
  private String doctor_name;
  private String address;
  private String tel;
  private String certi_date;
  private String certi;
  private String lat;
  private String lng;
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
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  public String getDoctor_name() {
    return doctor_name;
  }
  public void setDoctor_name(String doctor_name) {
    this.doctor_name = doctor_name;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public String getCerti_date() {
    return certi_date;
  }
  public void setCerti_date(String certi_date) {
    this.certi_date = certi_date;
  }
  public String getCerti() {
    return certi;
  }
  public void setCerti(String certi) {
    this.certi = certi;
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
