package com.tech.chu.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.tech.chu.dao.BoardDAO;
import com.tech.chu.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	BoardDAO boardDao;

	@Override
	public List<BoardDTO> boardList() throws Exception {
		return boardDao.boardList();
	}

	// 게시물 글 쓰기
	@Override
	public void writerBoard(BoardDTO bdto) throws Exception {
		boardDao.writerBoard(bdto);
	}

	// 게시물 상세내용 불러오기
	@Override
	public BoardDTO boardRead(int bno) throws Exception {
		return boardDao.boardRead(bno);
	}
}
