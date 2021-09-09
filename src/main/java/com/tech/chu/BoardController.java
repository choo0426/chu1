package com.tech.chu;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.dto.BoardDTO;
import com.tech.service.BoardService;

@Controller	// 컨트롤러 어노테이션(선언)
@RequestMapping("/board/*") // /board/ 이하 주소는 모두 이쪽으로 
public class BoardController {
	@Inject
	BoardService boardService;
	
	// 현재 자주 쓰이는 Model 클래스를 DI 하는 방법
	@RequestMapping("list.do")
	public String boardList(Model model) throws Exception {
		List<BoardDTO> list = boardService.boardList();	// list 변수에 결과 값을 담는다.
		model.addAttribute("list",list);	// model에 데이터 값을 담는다. (JSP파일에서 VIEW 역할로 활용)
		return "board/board_list";	// board/board_list.jsp로 이동
	}
}
