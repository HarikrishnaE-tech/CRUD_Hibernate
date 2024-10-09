package entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cname;
	@Column(columnDefinition = "integer default 4")
	private int cyear = 4;
	@OneToMany(fetch = FetchType.EAGER)
	List<Student> lstudent;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCyear() {
		return cyear;
	}

	public void setCyear(int cyear) {
		this.cyear = cyear;
	}

	public List<Student> getLstudent() {
		return lstudent;
	}

	public void setLstudent(List<Student> lstudent) {
		this.lstudent = lstudent;
	}

	public Course(int cid, String cname, int cyear, List<Student> lstudent) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cyear = cyear;
		this.lstudent = lstudent;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cyear=" + cyear + ", lstudent=" + lstudent + "]";
	}

}
