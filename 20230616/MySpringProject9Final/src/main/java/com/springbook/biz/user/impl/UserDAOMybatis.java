package com.springbook.biz.user.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;

@Repository
public class UserDAOMybatis{
	
	@Autowired
	private SqlSessionTemplate mybatis;//pom.xml에서 추가를 안하면은 오류남

	public UserVO getUser(UserVO vo) {//여기 메소드 수정하는 거 잊지 말자
		return (UserVO) mybatis.selectOne("UserDAO.getUser", vo);//쿼리참조는 UserDAO Spring jdbc에서
	}
	
	public void insertUser(UserVO vo) {
		mybatis.insert("UserDAO.insertUser", vo);
	}
	
}