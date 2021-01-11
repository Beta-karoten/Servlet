package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dzielniki")
public class ServletZadanie extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			String parametr = request.getParameter("num");
			int x = Integer.parseInt(parametr);
			List<Integer> l = new ArrayList<>();
			for(int i=1; i<=x; i++) {
				if(x%i==0) {
					l.add(i);
				}
			}
			request.setAttribute("lista", l);
			request.getRequestDispatcher("/WEB-INF/strona.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
		
	}
}
