package com.parvez;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ListenerTest
 */
@WebServlet("/ListenerTest")
public class ListenerTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListenerTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
		Car aCar=(Car)getServletContext().getAttribute("toyota");
		if(aCar!=null)
			response.getWriter().append(aCar.getBrand());
		else
			response.getWriter().append("Object is null");
	
		
		HttpSession session=request.getSession(); //creating a new session
		session.setAttribute("a", 10);
		int totalUser= MyHttpSessionListener.getTotalUserCounter();
		response.getWriter().append("Total User : "+totalUser);
		
		
		session.invalidate(); // destroying a session
		
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
