//github test 테스트 깃허브 다른 곳에서 수정후 임퍼트 하기
//pull 해주면 된다.
package com.servlet.step1;

import java.io.IOException;
//import java.io.PrintWriter;//주석 처리해놔서 주의가 뜸.
import java.util.Date;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/hi") // web.xml 추가됨
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloServlet() {
		super();
	}

	/**
	 * service()는 get,post 동시작업을 여기다 쓴다.
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String reqUrl = request.getRequestURI();
		String mappingUrl = request.getServletPath();

		System.out.println("HelloServlet 서블릿 호출");

		System.out.println("요청경로: " + reqUrl + "[]");
		System.out.println("맵핑경로: " + mappingUrl + "[]");
		doPost(request, response);
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
		String op = null;
		// Date d = new java.util.Date();
		Date d = new Date();
		op = d.toString();
		System.out.println("시스템 콘솔: " + op.toString());// 밑 주석 확인용
		/**
		 * response.setContentType("text/html;charset=utf-8"); PrintWriter out =
		 * response.getWriter(); out.println("<html>"); out.println("<body>");
		 * out.println("
		 * <h1>"+ op + "</h1>"); out.println("</body>"); out.println("</html>");
		 **/
	}

}
