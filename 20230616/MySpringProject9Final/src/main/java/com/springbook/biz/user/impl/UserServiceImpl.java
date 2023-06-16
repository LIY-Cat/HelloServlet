package com.springbook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAOMybatis userDAO;

	public UserVO getUser(UserVO vo) {//여기 에러는 유저서비스
		return userDAO.getUser(vo);//여기가 에러나는 경우는 userdaomybatis 보기
	}
	
	//추가 안돼면은 에러
	public void insertUser(UserVO vo) {
		userDAO.insertUser(vo);
	}
}
