

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class serv1
 */
public class serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int regno=Integer.parseInt(request.getParameter("regno"));
		String name=request.getParameter("name");
		pojo p=new pojo();
		p.setRegno(regno);
		p.setName(name);
		
		Studao dao=new Studao();
		int i=dao.studentDAO(p);
		if(i>0) {
			RequestDispatcher rd=request.getRequestDispatcher("serv2");
			request.setAttribute("student",p);
			rd.forward(request, response);
			
		}else {
			PrintWriter  pw=response.getWriter();
			pw.print("Error");
		}
	}

}
