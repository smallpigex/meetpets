package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.model.User;
import app.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class apiController {
  
  @Autowired
  private UserRepository userRepository;
  
  @PostMapping("/signup")
  public @ResponseBody String addNewUser(@RequestParam String id, @RequestParam String firstName, @RequestParam String lastName,
      @RequestParam String email, @RequestParam(required=false) String homeID, @RequestParam(required=false) String description) {
    User n = new User(id, firstName, lastName, email, homeID, description);
    
    userRepository.save(n);
    return "Saved";
  }
  
//  @GetMapping("/pethome")
//  public 
  
}
