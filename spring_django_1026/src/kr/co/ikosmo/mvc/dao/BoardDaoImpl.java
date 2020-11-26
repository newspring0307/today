package kr.co.ikosmo.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kr.co.ikosmo.mvc.vo.BoardVO;


@Repository("boardDao")
public class BoardDaoImpl {
	
	@Autowired
	private SqlSessionTemplate ss;
	
	public List<BoardVO> getBoardList(BoardVO vo){
		return ss.selectList("boardDao.getBoardList", vo);
	}
	public void insertBoard(BoardVO vo){
		ss.insert("boardDao.insertBoard", vo);
	}
}
