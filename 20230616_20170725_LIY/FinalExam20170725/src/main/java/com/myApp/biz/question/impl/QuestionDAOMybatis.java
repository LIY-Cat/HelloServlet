package com.myApp.biz.question.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myApp.biz.question.QuestionVO;

@Repository
public class QuestionDAOMybatis{
	
	@Autowired
	private SqlSessionTemplate mybatis;//pom.xml에서 추가를 안하면은 오류남

	//여기다가 추가하는 거 아니다.?
	//@Transactional("txManager")
	public void insertBoard(QuestionVO vo) {
		System.out.println("===> Mybatis로 insertBoard() 기능 처리");
		mybatis.insert("BoardDAO.insertBoard", vo);//n번 째 성공
		//mybatis.insert("BoardDAO.insertBoard", vo);//에러 발생 트렌잭션
	}

	public void updateBoard(QuestionVO vo) {
		System.out.println("===> Mybatis로 updateBoard() 기능 처리");
		mybatis.update("BoardDAO.updateBoard", vo);
	}

	public void deleteBoard(QuestionVO vo) {
		System.out.println("===> Mybatis로 deleteBoard() 기능 처리");
		mybatis.delete("BoardDAO.deleteBoard", vo);
	}

	public QuestionVO getBoard(QuestionVO vo) {
		System.out.println("===> Mybatis로 getBoard() 기능 처리");
		return (QuestionVO) mybatis.selectOne("BoardDAO.getBoard", vo);
	}

	public List<QuestionVO> getBoardList(QuestionVO vo) {
		System.out.println("===> Mybatis로 getBoardList() 기능 처리");
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}
}