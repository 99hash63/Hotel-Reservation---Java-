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
 * Servlet implementation class GetUpdatePackServlet
 */
@WebServlet("/GetUpdatePackServlet")
public class GetUpdatePackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int search = Integer.parseInt(request.getParameter("search"));
		System.out.println(search);
		
		
		 try {
			 
			 List<Packages> p = HotelDBUtil.getPackByID(search);
			 request.setAttribute("pack", p);
			 
			 System.out.println(p);
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
		RequestDispatcher dis = request.getRequestDispatcher("UpdatePackage.jsp");
		dis.forward(request, response);
		
	}

}
