package kr.co.ikosmo.mvc.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ikosmo.mvc.dao.BoardDaoImpl;
import kr.co.ikosmo.mvc.vo.BoardVO;


@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired 
	private BoardDaoImpl boardDao;

	public void insertBoard(BoardVO vo) {
		boardDao.insertBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDao.getBoardList(vo);
	}
}