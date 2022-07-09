package mybatis.service;

import mybatis.mapper.BoardMapper;
import mybatis.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardMapper mapper;

    @Autowired
    public BoardServiceImpl(BoardMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<BoardVO> viewAll() {
        return mapper.viewAll();
    }
}
