package spring.io.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserEntityManagerCommandLineRunner implements CommandLineRunner {
 private static final Logger log = LoggerFactory.getLogger(UserEntityManagerCommandLineRunner.class);
 @Autowired
 private UserService userService;
 @Autowired
 private UserRepository userRepository;
 public void run(String...args) {
  log.info("-------------------------------");
  log.info("Adding Tom as Admin");
  log.info("-------------------------------");
  User tom = new User("Tom", "Admin");
 
  UserDetails us=new UserDetails(1,"Paul Walker");
  List<UserDetails> li=new ArrayList<UserDetails>();
  li.add(us);
  tom.setUserDetails(li);
  userRepository.save(tom);
  
  log.info("Inserted Tom" + tom);
  log.info("-------------------------------");
  log.info("Finding user with id 1");
  log.info("-------------------------------");
  Optional<User> user1 = userRepository.findById(1L);
  User user = user1.get();
  List<UserDetails> lil=new ArrayList<UserDetails>();
  UserDetails us1=new UserDetails(2,"Walker");
  UserDetails us11=new UserDetails(3,"Walker");
  lil.add(us1);
  lil.add(us11);
  user.setUserDetails(lil);
  userRepository.save(user);
  
 // log.info(user.toString());
  log.info("-------------------------------");
  log.info("Finding all users");
  log.info("-------------------------------");
  log.info(userService.findAll().toString());
 }
}