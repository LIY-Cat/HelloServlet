package com.myApp.biz.member.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myApp.biz.member.MemberVO;

@Repository
public class MemberDAOMybatis{
	
	@Autowired
	private SqlSessionTemplate mybatis;//pom.xml에서 추가를 안하면은 오류남

	public MemberVO getUser(MemberVO vo) {//여기 메소드 수정하는 거 잊지 말자
		return (MemberVO) mybatis.selectOne("UserDAO.getUser", vo);//쿼리참조는 UserDAO Spring jdbc에서
	}
	
	public void insertUser(MemberVO vo) {
		mybatis.insert("UserDAO.insertUser", vo);
	}
	
}