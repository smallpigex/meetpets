package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.repository.HospitalRepository;
import app.repository.PetDetailRepository;
import app.repository.PetHomeRepository;
import app.model.Hospital;
import app.model.PetDetail;
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
  @Autowired
  public HospitalRepository hospitalRepository;
  
  @PostMapping("/signup")
  public @ResponseBody String addNewUser(@RequestParam String fbid, @RequestParam String firstName, @RequestParam String lastName,
      @RequestParam String email, @RequestParam(required=false) String description) {
    User user = new User(fbid, firstName, lastName, email, description);
    
    userRepository.save(user);
    return "Saved";
  }
  
  @PostMapping("/petHome")
  public @ResponseBody String petHome(@RequestParam String name, @RequestParam String lat,
      @RequestParam String lng, @RequestParam(required=false) String description, @RequestParam(required=false) String uid){
    PetHome petHome = new PetHome(name, lat, lng, description, uid);
    petHomeRepository.save(petHome);
    return "pethomeP success.";
  }
  
  @PostMapping("/petDetail")
  public @ResponseBody String petDetail(@RequestParam String phome_id, @RequestParam String name,
      @RequestParam String address, @RequestParam(required=false) String description, 
      @RequestParam(required=false) String pic_url1, @RequestParam(required=false) String pic_url2,
      @RequestParam(required=false) String pic_url3, @RequestParam String type){
    PetDetail petDetail = new PetDetail(phome_id, name, address, description, pic_url1, pic_url2, pic_url3, Integer.valueOf(type));
    petDetailRepository.save(petDetail);
    return "pethomeP success.";
  }
  
  @GetMapping("/hospital")
  public Iterable<Hospital> hospital(){
    return hospitalRepository.findAll();
  }
  
  @GetMapping("/petHome")
  public List<Object> petHome(){
    return petHomeRepository.findAllNoNullName();
  }
  
  @GetMapping("/petDetail")
  public Iterable<PetDetail> petDetail(){
    return petDetailRepository.findAll();
  }
  
}
