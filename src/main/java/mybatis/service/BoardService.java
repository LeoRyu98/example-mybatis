package mybatis.service;

import mybatis.vo.BoardVO;

import java.util.Optional;

public interface BoardService {
    Optional<BoardVO> viewAll();
}
