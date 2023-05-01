package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;
import com.springbook.view.controller.Controller;

public class SigninController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("회원가입 처리");
		
		// 1. 사용자 입력 정보 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String role = request.getParameter("role");
		
		id = id.trim();
		password = password.trim();
		name = name.trim();
		role = role.trim();
		
		if(id == null || password == null || name == null || role == null ||
				id.isEmpty() || password.isEmpty() || name.isEmpty() || role.isEmpty()) {
			System.out.println("빈값 또는 null입니다.");
			return "signin";
		}else {
			// 2. DB 연동 처리
			UserVO vo = new UserVO();
			vo.setId(id);
			vo.setPassword(password);
			vo.setName(name);
			vo.setRole(role);

			UserDAO userDAO = new UserDAO();
			int user = userDAO.setUser(vo);
			
			// 3. 화면 네비게이션
			if (user != 1) {
				return "signin";
			} else {
				return "login";
			}
		}
	}

}
