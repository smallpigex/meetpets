package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.repository.PetDetailRepository;
import app.repository.PetHomeRepository;
import app.model.PetHome;
import app.model.User;
import app.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class apiController {
  
  @Autowired
  public UserRepository userRepository;
  
  @Autowired
  public PetDetailRepository petDetailRepository;
  
  @Autowired
  public PetHomeRepository petHomeRepository;
  
  @PostMapping("/signup")
  public @ResponseBody String addNewUser(@RequestParam String firstName, @RequestParam String lastName,
      @RequestParam String email, @RequestParam(required=false) String homeID, @RequestParam(required=false) String description) {
    User user = new User(firstName, lastName, email, homeID, description);
    
    userRepository.save(user);
    return "Saved";
  }
  
  @PostMapping("/petHome")
  public @ResponseBody String petHomeP(@RequestParam String name, @RequestParam String latitude,
      @RequestParam String logtitude, @RequestParam(required=false) String description, @RequestParam(required=false) String uid){
    PetHome petHome = new PetHome(name, latitude, logtitude, description, uid);
    petHomeRepository.save(petHome);
    return "pethomeP success.";
  }
  
  @PostMapping("/petDetail")
  public @ResponseBody String petDetailP(@RequestParam String name, @RequestParam String latitude,
      @RequestParam String logtitude, @RequestParam(required=false) String description, @RequestParam(required=false) String uid){
    PetHome petHome = new PetHome(name, latitude, logtitude, description, uid);
    petHomeRepository.save(petHome);
    return "pethomeP success.";
  }
  
}
