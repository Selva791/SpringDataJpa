package spring.io.jpa;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
 private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
 @Autowired
 private UserRepository userRepository;
 public void run(String...args) {
/*  User harry = new User("Harry", "Admin");
  userRepository.save(harry);*/

  log.info("-------------------------------");
  log.info("Finding all users");
  log.info("-------------------------------");
  for (User user: userRepository.findAll()) {
   log.info(user.toString());
  }
 }
}
