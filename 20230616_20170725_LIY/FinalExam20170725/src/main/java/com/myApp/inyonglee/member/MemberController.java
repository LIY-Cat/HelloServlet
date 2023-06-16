﻿package com.myApp.inyonglee.member;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.myApp.biz.member.MemberService;
import com.myApp.biz.member.MemberVO;


@Controller
//@SessionAttributes("board")//지우자 필요할때만
//여기서 homecontroll 수정 안하면은 404 에러난다.
public class MemberController {
	@Autowired
	private MemberService userService;
	
	@RequestMapping(value = "/singin.do", method = RequestMethod.GET)
	public String singinView() {
		return "singin";
	}
	
	@RequestMapping(value = "/singin.do", method = RequestMethod.POST)
	public String insertSingin(MemberVO vo) {
			userService.insertUser(vo);
			return "login";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String loginView() {
		return "login";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(MemberVO vo, HttpSession session) {
		MemberVO user = userService.getUser(vo);
		if (user != null) {
			session.setAttribute("userName", user.getName());
			return "redirect:getBoardList.do";//redirect: *.do는 꼭 붙이기, /WEB-INF/views/getBoardList.do.jsp 이런 에러 발생
			//그다음에 이런 에러가 나며은 /WEB-INF/views/getBoardList.jsp.jsp 보드컨틀롤러로 가기
		} else
			return "login";
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
	
}
