package com.myApp.biz.question.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myApp.biz.question.QuestionService;
import com.myApp.biz.question.QuestionVO;

@Service("boardService")
public class QuestionServiceImpl implements QuestionService {
	@Autowired
	private QuestionDAOMybatis boardDAO;

	@Transactional("txManager")//임포트 안되어 있으면 안된다., 그리고 적용하면은 꼭 서버 재시작
	public void insertBoard(QuestionVO vo) {
//		if (vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//		}
		boardDAO.insertBoard(vo);//n번 째성공
		//throw new RuntimeException("트랜잭션 테스트를 위한 예외");//트렌잭션 에러 성공!!
	}

	public void updateBoard(QuestionVO vo) {
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(QuestionVO vo) {
		boardDAO.deleteBoard(vo);
	}

	public QuestionVO getBoard(QuestionVO vo) {
		return boardDAO.getBoard(vo);
	}

	public List<QuestionVO> getBoardList(QuestionVO vo) {
		return boardDAO.getBoardList(vo);
	}
}