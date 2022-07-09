package mybatis.controller;

import mybatis.service.BoardService;
import mybatis.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class BoardController {

    private final BoardService service;

    @Autowired
    public BoardController(BoardService service) {
        this.service = service;
    }

    @GetMapping("/board")
    public String board(Model model){
        List<BoardVO> boardList = service.viewAll();
        model.addAttribute("viewAll", boardList);
        return "board/all";
    }
}
