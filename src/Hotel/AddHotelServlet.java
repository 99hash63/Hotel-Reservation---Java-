package Hotel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/AddHotelServlet")
public class AddHotelServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String name = request.getParameter("name");
		String address = request.getParameter("add");
		String contact = request.getParameter("contact");
		String director = request.getParameter("dir");
		String owner = request.getParameter("own");
		String rating = request.getParameter("rate");
		String noOfHalls = request.getParameter("nOh");
		
		
		
		boolean TrueFalse;
		
		TrueFalse = HotelDBUtil.addHotel(name, address, contact, director, owner, rating, noOfHalls);
		
		if(TrueFalse == true) {
			RequestDispatcher dis = request.getRequestDispatcher("AddPackage.jsp");
			dis.forward(request, response);
			System.out.println("true");
		} else {
			
			System.out.println("false");
			out.println("<script type='text/javascript'>");
			out.println("alert('Hotel name already exists');");
			out.println("location='AddHotel.jsp'");
			out.println("</script>");
			
		}
	
	
	}

}
