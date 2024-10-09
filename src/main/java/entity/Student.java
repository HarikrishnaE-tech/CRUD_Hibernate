package entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stdid;
	private String stdname;
	private int stdage;
	private String state;
	private String stdemail;
	private String stdpassword;
	@ManyToOne
	Course course;

	public int getStdid() {
		return stdid;
	}

	

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}



	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public int getStdage() {
		return stdage;
	}

	public void setStdage(int stdage) {
		this.stdage = stdage;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStdemail() {
		return stdemail;
	}

	public void setStdemail(String stdemail) {
		this.stdemail = stdemail;
	}

	public String getStdpassword() {
		return stdpassword;
	}

	public void setStdpassword(String stdpassword) {
		this.stdpassword = stdpassword;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student(int stdid, String stdname, int stdage, String state, String stdemail, String stdpassword,
			Course course) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdage = stdage;
		this.state = state;
		this.stdemail = stdemail;
		this.stdpassword = stdpassword;
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
