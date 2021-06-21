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
 * Servlet implementation class ViewPackageServlet
 */
@WebServlet("/ViewPackageServlet")
public class ViewPackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String search = request.getParameter("search");
		
		
		 try {
			 
			 List<Packages> p = HotelDBUtil.getPackage(search);
			 request.setAttribute("pack", p);
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
		RequestDispatcher dis = request.getRequestDispatcher("PackageDetails.jsp");
		dis.forward(request, response);
		
		
	}

}
