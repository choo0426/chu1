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
}
