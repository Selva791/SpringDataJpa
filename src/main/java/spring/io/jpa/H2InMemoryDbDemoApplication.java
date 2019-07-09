package spring.io.jpa;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("spring.io.jpa")
public class H2InMemoryDbDemoApplication {
	@Autowired
	DataSource datasource;
 public static void main(String[] args) {
	 
  SpringApplication.run(H2InMemoryDbDemoApplication.class, args);
 }
}