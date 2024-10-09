package service;

import java.util.List;

import entity.Course;
import entity.Student;
import entity.Teacher;

public interface cours_stud_manag_system {
public int Register(Student s,Course c);
public List<Object[]> Login(Student std);
public  List<Object[]> Login(Teacher t);
public int Register(Teacher teach);
public int update(Student s,Course c);


}
