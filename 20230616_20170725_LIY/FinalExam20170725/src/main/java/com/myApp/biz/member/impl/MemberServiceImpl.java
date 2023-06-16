package com.myApp.biz.member.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myApp.biz.member.MemberService;
import com.myApp.biz.member.MemberVO;

@Service("userService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAOMybatis userDAO;

	public MemberVO getUser(MemberVO vo) {//여기 에러는 유저서비스
		return userDAO.getUser(vo);//여기가 에러나는 경우는 userdaomybatis 보기
	}
	
	//추가 안돼면은 에러
	public void insertUser(MemberVO vo) {
		userDAO.insertUser(vo);
	}
}
