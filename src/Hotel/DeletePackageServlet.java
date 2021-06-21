package Hotel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeletePackageServlet
 */
@WebServlet("/DeletePackageServlet")
public class DeletePackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
boolean value = false;
		
	int packId = Integer.parseInt(request.getParameter("packId"));
	
		try {
			
			value = HotelDBUtil.deletePackage(packId);
			
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
