package com.myApp.biz.question;

import java.util.List;

public interface QuestionService {

	void insertBoard(QuestionVO vo);

	void updateBoard(QuestionVO vo);

	void deleteBoard(QuestionVO vo);

	QuestionVO getBoard(QuestionVO vo);

	List<QuestionVO> getBoardList(QuestionVO vo);
}
