package kr.co.ikosmo.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ikosmo.mvc.dao.BoardDao;
import kr.co.ikosmo.mvc.vo.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardDao dao;
	
	@GetMapping(value="/boardList")
	public String boardList(Model m){
		List<BoardVO> listv = dao.getBoardList();
		m.addAttribute("listv",listv);
		return "boardList";
	}
}
