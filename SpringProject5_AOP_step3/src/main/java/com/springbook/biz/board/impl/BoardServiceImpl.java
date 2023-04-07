package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.LogAdvice;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
	public void insertBoard(BoardVO vo) {
		//After Throwing Advice �떎�뒿�뿉�꽌 �삁�쇅媛� �븘�슂�빐 �궫�엯�븿.
		
		
		  if(vo.getSeq() == 0) { throw new
		  IllegalArgumentException("0踰� 湲��� �벑濡앺븷 �닔 �뾾�뒿�땲�떎. "); }
		 		  
		 		 		 		
		boardDAO.insertBoard(vo); 
	}

	public void updateBoard(BoardVO vo) {
	    boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}
}