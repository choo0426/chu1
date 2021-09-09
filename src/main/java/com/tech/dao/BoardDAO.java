package com.tech.dao;

import java.util.List;

import com.tech.dto.BoardDTO;

public interface BoardDAO {
	//게시물 목록
	public List<BoardDTO> boardList() throws Exception;
}
