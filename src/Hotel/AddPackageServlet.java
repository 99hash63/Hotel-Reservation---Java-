package Hotel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddPackageServlet
 */
@WebServlet("/AddPackageServlet")
public class AddPackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String hName = request.getParameter("Hname");
		String pName = request.getParameter("Pname");
		String bPrice = request.getParameter("BuffetP");
		String noOfMeals = request.getParameter("NoOfM");
		String pCharges = request.getParameter("pCharges");
		String gCharges = request.getParameter("gCharges");
		String liq = request.getParameter("liq");
		String timeDu = request.getParameter("TimeD");
		
		boolean TrueFalse;
		
		try {
			TrueFalse = HotelDBUtil.addPackage(hName, pName, bPrice, noOfMeals, pCharges, gCharges, liq, timeDu);
			
			if(TrueFalse == true) {
				RequestDispatcher dis = request.getRequestDispatcher("AdminInterface.jsp");
				dis.forward(request, response);
//				System.out.println("true");
			} else {
				
				System.out.println("false");
				out.println("<script type='text/javascript'>");
				out.println("alert('There is no such hotel!');");
				out.println("location='AddPackage.jsp'");
				out.println("</script>");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
