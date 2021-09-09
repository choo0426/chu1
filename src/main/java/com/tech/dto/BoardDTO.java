package com.tech.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDTO {
	//Field
	private int bno;		//게시물번호
	private String title;		//게시물제목
	private String content;		//게시물내용
	private String writer;		//게시물작성자
	private Date regdate;		//게시물작성일자
	private int viewcnt;		//게시물조회수
}
