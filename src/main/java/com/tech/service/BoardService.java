package com.tech.service;

import java.util.List;

import com.tech.dto.BoardDTO;

public interface BoardService {
	//게시물 목록조회
	public List<BoardDTO> boardList() throws Exception;
}
