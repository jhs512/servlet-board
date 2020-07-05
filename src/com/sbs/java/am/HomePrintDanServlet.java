package com.sbs.java.am;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:8081/AM/home/printDan?dan=4&limit=5
@WebServlet("/home/printDan")
public class HomePrintDanServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

		String inputedDan = request.getParameter("dan");
		if (inputedDan == null) {
			inputedDan = "1";
		}

		String inputedLimit = request.getParameter("limit");
		if (inputedLimit == null) {
			inputedLimit = "9";
		}
		
		int dan = Integer.parseInt(inputedDan);
		int limit = Integer.parseInt(inputedLimit);
		String color = request.getParameter("color");
		
		if ( color == null ) {
			color = "";
		}
		
		response.getWriter().append(String.format("<div style=\"color:%s;\">%d단</div>", color, dan));
		for (int i = 1; i <= limit; i++) {
			response.getWriter()
					.append(String.format("<div style=\"color:%s;\">%d * %d = %d</div>", color, dan, i, dan * i));
		}
	}
}
