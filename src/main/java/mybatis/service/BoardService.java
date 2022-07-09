package mybatis.service;

import mybatis.vo.BoardVO;

import java.util.List;

public interface BoardService {
    List<BoardVO> viewAll();
}
