package Hotel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteHotelServlet
 */
@WebServlet("/DeleteHotelServlet")
public class DeleteHotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		boolean value = false;
		
		String hName = request.getParameter("hn");
	
		try {
			
			value = HotelDBUtil.deleteHotel(hName);
			
			if(value==true) {
				RequestDispatcher dis = request.getRequestDispatcher("AdminInterface.jsp");
				dis.forward(request, response);
			}
			else {
				System.out.println("Unsuccess");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
