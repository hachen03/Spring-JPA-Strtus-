package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="porder")
public class porder {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String name;
private String[] product;
public porder() {
	super();
}
public porder(Integer id, String name, String[] product) {
	super();
	this.id = id;
	this.name = name;
	this.product = product;
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
public String[] getProduct() {
	return product;
}
public void setProduct(String[] product) {
	this.product = product;
}

}
