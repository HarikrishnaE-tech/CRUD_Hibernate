package creation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.Cours_stud_manag;

import java.io.IOException;

import entity.Course;
import entity.Student;

@WebServlet("/Registerservlet")
public class Registerservlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cours_stud_manag csm =new Cours_stud_manag();
		
	String stdname = request.getParameter("stdname");
	int stdage =Integer.parseInt( request.getParameter("stdage"));
	String stdemail = request.getParameter("stdemail");
	String stdpassword = request.getParameter("stdpassword");
	String cname = request.getParameter("cname");
	String state = request.getParameter("state");
	
	
	
	Student std=new Student();
	std.setStdname(stdname);
	std.setStdage(stdage);
	std.setStdemail(stdemail);
	std.setStdpassword(stdpassword);
	std.setState(state);
	Course c=new Course();
	c.setCname(cname);
	
	
	int v=csm.Register(std, c);
	
	if(v==1) {
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}
	else {
		request.getRequestDispatcher("Register.jsp").forward(request, response);
	}
	
	
	}

}
