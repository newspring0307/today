package kr.co.ikosmo.mvc.service;

import java.util.List;

import kr.co.ikosmo.mvc.vo.BoardVO;



public interface BoardService {
	
	void insertBoard(BoardVO vo);

//	// �? ?��?��
//	void updateBoard(BoardVO vo);
//
//	// �? ?��?��
//	void deleteBoard(BoardVO vo);
//
//	// �? ?��?�� 조회
//	BoardVO getBoard(BoardVO vo);

	// �? 목록 조회
	List<BoardVO> getBoardList(BoardVO vo);
}
