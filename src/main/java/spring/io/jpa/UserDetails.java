package spring.io.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails")
public class UserDetails {
@Id
private int id;
private String name;
public UserDetails() {
}
public UserDetails(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
}
