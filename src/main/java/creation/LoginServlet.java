package creation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import service.Cours_stud_manag;

import java.io.IOException;
import java.util.List;

import entity.Student;
import entity.Teacher;
@WebServlet("/Loginservlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String stdemail=request.getParameter("stdemail");
		String stdpassword=request.getParameter("stdpassword");
		String person=request.getParameter("person");
		
		
		if(person.equalsIgnoreCase("student")) {
			
			Student std=new Student();
			std.setStdemail(stdemail);
			std.setStdpassword(stdpassword);
		
			Cours_stud_manag csm =new Cours_stud_manag();
			List<Object[]> resultlist=csm.Login(std);
			
			HttpSession session=request.getSession();
			session.setAttribute("resultlist", resultlist);
			
			request.getRequestDispatcher("Display.jsp").forward(request, response);
			
		}
		else {
			
			Teacher t=new Teacher();
			t.setTemail(stdemail);
			t.setTpassword(stdpassword);
			
			Cours_stud_manag csm1=new Cours_stud_manag();
			 
				System.out.println(csm1.Login(t));
				List<Object[]> resultlist=csm1.Login(t);
				HttpSession session=request.getSession();
				session.setAttribute("resultlist", resultlist);
				
				request.getRequestDispatcher("Displayteacher.jsp").forward(request, response);
				
				
			
		
		
		
		
		
	}

}
}