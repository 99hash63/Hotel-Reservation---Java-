package Hotel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdatePackageServlet
 */
@WebServlet("/UpdatePackageServlet")
public class UpdatePackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean value = false;
		
		String packId = request.getParameter("packId");
		 String packageName = request.getParameter("packageName");
		 String buffetPrice =request.getParameter("buffetPrice");
		 String numberOfMeals =request.getParameter("numberOfMeals"); 
		 String poolCharges = request.getParameter("poolCharges"); 
		 String gymCharges = request.getParameter("gymCharges");
		 String liquor = request.getParameter("liquor"); 
		 String timeDuration = request.getParameter("timeDuration");
		 
		 System.out.println(packId);
		
		try {
			
			value = HotelDBUtil.updatePackage(packId, packageName, buffetPrice, numberOfMeals, poolCharges, gymCharges, liquor, timeDuration);
			
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
