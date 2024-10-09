package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * 
 */
@Entity
public class Teacher {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int tid;
private String temail;
private String tpassword;
public String getTemail() {
	return temail;
}
public void setTemail(String temail) {
	this.temail = temail;
}
public String getTpassword() {
	return tpassword;
}
public void setTpassword(String tpassword) {
	this.tpassword = tpassword;
}
public Teacher(String temail, String tpassword) {
	super();
	this.temail = temail;
	this.tpassword = tpassword;
}
public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Teacher [temail=" + temail + ", tpassword=" + tpassword + "]";
}


}
