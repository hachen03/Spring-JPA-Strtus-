package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.id.CompositeNestedGeneratedValueGenerator.GenerationContextLocator;

@Entity
@Table(name="member")
public class member {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String name;
private String address;
private String[] interest;
public member() {
	super();
}
public member(String name, String username, String[] interest) {
	super();
	this.name = name;
	this.address = username;
	this.interest = interest;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String username) {
	this.address = username;
}
public String[] getInterest() {
	return interest;
}
public void setInterest(String[] interest) {
	this.interest = interest;
}
}
