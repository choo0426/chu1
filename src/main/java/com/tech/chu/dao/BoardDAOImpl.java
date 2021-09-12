package com.tech.chu.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.tech.chu.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	@Inject
	SqlSession sqlSession;

	@Override
	public List<BoardDTO> boardList() throws Exception {
		return sqlSession.selectList("board.boardList");
	}

	// 게시물 글쓰기
	@Override
	public void writerBoard(BoardDTO bdto) throws Exception {
		sqlSession.insert("board.boardWriter", bdto);
	}

	// 게시물 상세내용 불러오기
	@Override
	public BoardDTO boardRead(int bno) throws Exception {
		return sqlSession.selectOne("board.boardRead", bno);
	}
	
	// 게시물 수정
	@Override
	public void boardUpdate(BoardDTO bdto) throws Exception {
		sqlSession.update("board.boardUpdate", bdto);
	}
}
