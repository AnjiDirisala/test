package test2;
import javax.servlet.*;
import java.io.*;
@SuppressWarnings("serial")
public class ServletProgram3 extends GenericServlet {

		public void inti() throws ServletException{
			
			
		}
		@Override
		public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
	       PrintWriter pw=res.getWriter();
	     	res.setContentType("text/html");
		String pcode=req.getParameter("pcode");
		String pname=req.getParameter("pname");
		float pprice=Float.parseFloat(req.getParameter("pprice"));
		int pqty=Integer.parseInt(req.getParameter("pqty"));
		
		pw.println("==product details==");
		pw.println("<br>ProductCode:"+pcode);
		pw.println("<br>ProductName:"+pname);
		pw.println("<br>Productprice:"+pprice);
		pw.println("<br>ProductQuantity:"+pqty);
		
		}

	   public void destroy() {
		   
	   }
	}


