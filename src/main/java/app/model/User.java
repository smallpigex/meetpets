package app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    
    @Id
    private String fbid;
    
    private String firstName;
    private String lastName;
    private String email;
    private String description;
    
    public User(String fbid,String firstName, String lastName, String email, String description){
      this.fbid = fbid;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.description = description;
    }
    
    public User(){
      
    }
    
    public String getFbid() {
      return fbid;
    }

    public void setFbid(String fbid) {
      this.fbid = fbid;
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
    public String getDescription() {
      return description;
    }
    public void setDescription(String description) {
      this.description = description;
    }
    
    


}