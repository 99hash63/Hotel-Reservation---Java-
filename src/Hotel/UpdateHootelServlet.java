package Hotel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateHootelServlet
 */
@WebServlet("/UpdateHootelServlet")
public class UpdateHootelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean value = false;
		
		String name = request.getParameter("name");
		String address = request.getParameter("add");
		String contact = request.getParameter("contact");
		String director = request.getParameter("dir");
		String owner = request.getParameter("own");
		String rating = request.getParameter("rate");
		String noOfHalls = request.getParameter("nOh");
		
		try {
			
			value = HotelDBUtil.updatetHotel(name, address, contact, director, owner, rating, noOfHalls);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(value==true) {
			RequestDispatcher dis = request.getRequestDispatcher("AdminInterface.jsp");
			dis.forward(request, response);
		}
		else {
			System.out.println("error");
		}
		
	}

}
