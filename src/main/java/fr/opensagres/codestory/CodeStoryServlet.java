package fr.opensagres.codestory;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CodeStoryServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String param = req.getParameter("q");
		System.out.println(param);
		if ("Quelle est ton adresse email".equals(param)) {

			resp.getWriter().write("pascal.leclercq@gmail.com");
		} else {
			resp.getWriter()
					.write("please read http://code-story.net/2013/01/04/concours-2013.html");
		}

	}
}
