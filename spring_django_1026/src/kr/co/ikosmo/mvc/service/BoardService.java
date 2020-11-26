package kr.co.ikosmo.mvc.service;

import java.util.List;

import kr.co.ikosmo.mvc.vo.BoardVO;



public interface BoardService {
	
	void insertBoard(BoardVO vo);

//	// ê¸? ?ˆ˜? •
//	void updateBoard(BoardVO vo);
//
//	// ê¸? ?‚­? œ
//	void deleteBoard(BoardVO vo);
//
//	// ê¸? ?ƒ?„¸ ì¡°íšŒ
//	BoardVO getBoard(BoardVO vo);

	// ê¸? ëª©ë¡ ì¡°íšŒ
	List<BoardVO> getBoardList(BoardVO vo);
}
