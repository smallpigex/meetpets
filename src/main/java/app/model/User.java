package app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    
    private String firstName;
    private String lastName;
    private String email;
    private String homeID;
    private String description;
    
    public User(String id, String firstName, String lastName, String email, 
        String homeID, String description){
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.homeID = homeID;
      this.description = description;
    }
    
    public String getId() {
      return id;
    }
    public void setId(String id) {
      this.id = id;
    }
    public String getFirstName() {
      return firstName;
    }
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }
    public String getLastName() {
      return lastName;
    }
    public void setLastName(String lastName) {
      this.lastName = lastName;
    }
    public String getEmail() {
      return email;
    }
    public void setEmail(String email) {
      this.email = email;
    }
    public String getHomeID() {
      return homeID;
    }
    public void setHomeID(String homeID) {
      this.homeID = homeID;
    }
    public String getDescription() {
      return description;
    }
    public void setDescription(String description) {
      this.description = description;
    }
    
    


}