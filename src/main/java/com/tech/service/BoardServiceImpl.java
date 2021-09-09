package com.tech.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.tech.dao.BoardDAO;
import com.tech.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	BoardDAO boardDAO;

	@Override
	public List<BoardDTO> boardList() throws Exception {
		return boardDAO.boardList();
	}
	
}
