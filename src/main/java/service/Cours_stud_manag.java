package service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entity.Course;
import entity.Student;
import entity.Teacher;
import jakarta.servlet.http.HttpSession;

public class Cours_stud_manag implements cours_stud_manag_system {


		@Override
		public int Register(Student s, Course c) {
			
			List<Student>lstudent=new ArrayList<Student>();
			lstudent.add(s);
			c.setLstudent(lstudent);
			
			s.setCourse(c);
			
			int v=1;
			Configuration cfg=new Configuration()
					.configure()
					.addAnnotatedClass(Student.class)
					.addAnnotatedClass(Course.class);
			
			SessionFactory sf = cfg.buildSessionFactory();
			
			Session sess = sf.openSession();
			Transaction bt = sess.beginTransaction();
			
			sess.save(c);
			sess.save(s);
			bt.commit();
			sf.close();
			sess.close();
		return v;
			
		}

		@Override
		public List<Object[]> Login(Student std) {
			
		
			Configuration cfg=new Configuration()
					.configure()
					.addAnnotatedClass(Student.class)
					.addAnnotatedClass(Course.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session sess = sf.openSession();
			Transaction bt = sess.beginTransaction();
			  String hql = "SELECT s.stdid, s.stdname, s.stdage, s.state, c.cname " +
	                     "FROM Student s JOIN s.course c " +
	                     "WHERE s.stdemail = :x AND s.stdpassword = :y";

//			  String hql = "FROM Student s WHERE s.stdemail = :x AND s.stdpassword = :y";
		        Query<Object[]> q = sess.createQuery(hql, Object[].class);
		        q.setParameter("x", std.getStdemail());
		        q.setParameter("y", std.getStdpassword());

	    List<Object[]>  resultList = q.getResultList();

//	        if (resultList.isEmpty()) {
//	            System.out.println("No results found for the given email and password.");
//	        } else {
	            System.out.println(resultList);
	        

	        bt.commit();
	        sess.close();
	        sf.close();
	   
	    return resultList;
	}

		@Override
		public List<Object[]> Login(Teacher t) {
			List<Object[]> resultList = null;
			Configuration cfg=new Configuration()
					.configure()
					.addAnnotatedClass(Teacher.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session sess = sf.openSession();
		
			String hql="from Teacher t where t.temail=:x and t.tpassword=:y";
			Query<Teacher> query=  sess.createQuery(hql,Teacher.class);
			query.setParameter("x",t.getTemail());
			query.setParameter("y", t.getTpassword());
			Teacher teach= query.getSingleResult();
			 teach = query.uniqueResult();
			 if(teach!=null){
				
				String sql="select s.stdid,s.stdname,s.stdage,s.stdemail,s.stdpassword,state,c.cname from course c inner join student s  on c.cid=s.course_cid";


				Query<Object[]> query1 = sess.createNativeQuery(sql);
						 resultList = query1.getResultList();
						
						 sess.close();
						 sf.close();
			}
			return resultList;
		
			
		}

		@Override
		public int Register(Teacher teach) {
			int v=1;
			
			
			Configuration cfg=new Configuration()
					.configure()
					.addAnnotatedClass(Teacher.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session sess = sf.openSession();
			Transaction bt = sess.beginTransaction();
			sess.save(teach);
			bt.commit();
			sess.close();
			sf.close();
			
			return v;
			
		}

		@Override
		public int update(Student s, Course c) {
			int val=1;
			Configuration cfg=new Configuration()
					.configure()
					.addAnnotatedClass(Student.class)
					.addAnnotatedClass(Course.class);
			
			SessionFactory sf = cfg.buildSessionFactory();
			Session sess = sf.openSession();
			Transaction bt = sess.beginTransaction();
			Course merge = sess
					.merge(c); /*
								 * here we have two table to update so we need to update the course which is the
								 * child class beacuse cid column comes inside the student table,after updating
								 * ,we need to set that result to the s.setcourse then student need to update
								 */
		      s.setCourse(merge);
		  
		    sess.merge(s);
		    

		
			bt.commit();
			sess.clear();
			sf.close();
			
			
			
			
			return val;
		}
		}


		
	
	
	
	
	
	
	


