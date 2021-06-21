package Hotel;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewHotelServlet
 */
@WebServlet("/ViewHotelServlet")
public class ViewHotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String search = request.getParameter("search");
		 
		
		List<Hotel> h = HotelDBUtil.getHotel(search);
		
		request.setAttribute("hotel", h);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("HotelDetails.jsp");
		dis.forward(request, response);
		
		
	}

}
