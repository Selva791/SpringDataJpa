package spring.io.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@NamedQuery(query = "select u from User u", name = "query_find_all_users")
@Table(name="user")
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String name; // Not perfect!! Should be a proper object!
 private String role; // Not perfect!! An enum should be a better choice!
 
 @ManyToMany(cascade=CascadeType.ALL)
 List<UserDetails> userDetails;
 

public void setUserDetails(List<UserDetails> userDetails) {
	this.userDetails = userDetails;
}
public List<UserDetails> getUserDetails() {
	return userDetails;
}
protected User() {}
 public User(String name, String role) {
  super();
  this.name = name;
  this.role = role;
 }
 public Long getId() {
  return id;
 }
 public String getName() {
  return name;
 }
 public String getRole() {
  return role;
 }
 @Override
 public String toString() {
  return String.format("User [id=%s, name=%s, role=%s]", id, name, role);
 }
}