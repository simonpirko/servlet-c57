package by.tms.web.servlet;

import by.tms.entity.Operation;
import by.tms.service.CalculatorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Simon Pirko on 21.07.22
 */

@WebServlet(value = "/calculator", loadOnStartup = 1, name = "CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private CalculatorService calculatorService = new CalculatorService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/pages/calc.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Operation operation = new Operation();
		operation.setNum1(Double.parseDouble(req.getParameter("num1")));
		operation.setNum2(Double.parseDouble(req.getParameter("num2")));
		operation.setOperation(req.getParameter("operation"));
		operation = calculatorService.calculate(operation);
		req.setAttribute("result", operation);
		getServletContext().getRequestDispatcher("/pages/calc.jsp").forward(req, resp);
	}
}
