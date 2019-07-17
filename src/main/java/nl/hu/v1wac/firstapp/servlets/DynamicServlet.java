package nl.hu.v1wac.firstapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/DynamicServlet.do")
public class DynamicServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		double number1 = Integer.parseInt(req.getParameter("n1"));
		double number2 = Integer.parseInt(req.getParameter("n2"));
		String operator = req.getParameter("operator");

		out.println("<html><body>");
		if (operator.equals("add")) {
			out.println("" + number1 + " + " + number2 + " = " + (number1 + number2));
		} else if (operator.equals("sub")) {
			out.println("" + number1 + " - " + number2 + " = " + (number1 - number2));
		}

		else if (operator.equals("mul")) {
			out.println("" + number1 + " * " + number2 + " = " + (number1 * number2));
		}

		else if (operator.equals("div")) {
			out.println("" + number1 + " / " + number2 + " = " + (number1 / number2));
		}

		out.println("</body></html>");
		out.close();
	}
}