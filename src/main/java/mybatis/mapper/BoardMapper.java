package mybatis.mapper;

import mybatis.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface BoardMapper {
    Optional<BoardVO> viewAll();
}
