package creation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.Cours_stud_manag;

import java.io.IOException;

import entity.Teacher;

@WebServlet("/Adminregister_Servlet")
public class Adminregister_Servlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	String person=request.getParameter("person");
	 
	System.out.println(password);
	if(person.equalsIgnoreCase("teacher")) {
		Teacher teach=new Teacher();
		teach.setTemail(email);
		teach.setTpassword(password);
		
		Cours_stud_manag cm=new Cours_stud_manag();
		int c=cm.Register(teach);
		if(c==1) {
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		
	}
	}

}
