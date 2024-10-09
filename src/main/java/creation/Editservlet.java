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

import entity.Course;
import entity.Student;

@WebServlet("/Editservlet")
public class Editservlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		request.getRequestDispatcher("editform.jsp").forward(request, response);
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int stdid=Integer.parseInt(request.getParameter("stdid"));
     String stdname=request.getParameter("stdname");
     int stdage=Integer.parseInt(request.getParameter("stdage"));
     String stdemail=request.getParameter("stdemail");
     String stdpassword=request.getParameter("stdpassword");
     String cname=request.getParameter("cname");
     String state=request.getParameter("state");
     
     
     Student std=new Student();
     std.setStdid(stdid);
     std.setStdname(stdname);
     std.setStdage(stdage);
     std.setStdemail(stdemail);
     std.setStdpassword(stdpassword);
     std.setState(state);
     
     Course c= new Course();
     c.setCname(cname);
     
     Cours_stud_manag csm=new Cours_stud_manag();
    int result= csm.update(std, c);
     
     if(result==1) {
    	 request.getRequestDispatcher("Login.jsp").forward(request, response);
     }
     else {
    	 System.out.println("error ");
     }
     
}
}