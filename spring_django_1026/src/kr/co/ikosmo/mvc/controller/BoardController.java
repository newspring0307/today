package kr.co.ikosmo.mvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.ikosmo.mvc.dao.BoardDao;
import kr.co.ikosmo.mvc.service.BoardService;
import kr.co.ikosmo.mvc.vo.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService; //�옄�룞�쑝濡� 二쇱엯

	@RequestMapping("/boardList")
	public void getBoardList(BoardVO vo, Model m) {
		
		//boardService.getBoardList(BoardVO vo, Model m);瑜� ���떊�븯�뒗寃� �쐞�쓽 留ㅺ컻蹂��닔..?�옒 紐⑤Ⅴ寃좎쓬
		//BoardVO vo : �씠�쟾 �솕硫댁뿉�꽌 �꽆�뼱�삤�뒗 �뙆�씪誘명꽣 ���옣(�쁽�옱�뒗 �뜲�씠�꽣 �뾾�쓬)
		//Model m : 酉곕떒�쑝濡� �뜲�씠�꽣 �쟾�넚�븷 �븣 �븘�슂�븳 媛앹껜
		List<BoardVO> result = boardService.getBoardList(vo);
		m.addAttribute("boardList",result); //�씠�젃寃뚰븯嫄곕굹 result���떊 boardService.getBoardList(vo)�꽔嫄곕굹.(�븳踰덉벝�븣)
	}	

	
	@RequestMapping("/boardSave")
	public String saveBoard(BoardVO vo) {
		boardService.insertBoard(vo);
		return "redirect:/boardList";
	}
	
	@GetMapping(value="/boardInsert")
	public void boardInsert(){
	}
	
	@RequestMapping(value="/post",method=RequestMethod.POST)
	public String testInsert(Model m){
		
		
		return "redirect:boardList";
	}
	@Controller
	@RequestMapping("/api/abandom")
	public class Api {
	 
	    @RequestMapping(value = "/province", method = RequestMethod.GET, produces = "application/json")
	    @ResponseBody
	    public FileSystemResource getProvinceList(HttpServletRequest request) throws IOException {
	        String path = request.getSession().getServletContext().getRealPath("/WEB-INF/resources") + "/mytest3.json";
	        return new FileSystemResource(new File(path));
	    }
	}
}
