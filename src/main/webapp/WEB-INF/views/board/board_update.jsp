<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../include/menu.jsp" %>
    <h2>board_read 페이지입니다.</h2>
    <a href="${path }/board/writer_page">글쓰기</a>
    <form name="updateform" method="post" action="${path }/board//update.do">
    	<div>글번호</div>
    	<div><input name="bno" value="${data.bno }" type="text" readonly="readonly"/></div>
    	<div>작성자</div>
    	<div><input name="writer" value="${data.writer }" type="text" readonly="readonly"/></div>
    	<div>게시글제목 : </div>
    	<div><input name="title" value="${data.title }" type="text" /></div>
    	<div>게시글내용 : </div>
    	<div><textarea name="content" cols="50" rows="5">${data.content }</textarea></div>
    	<div>조회수</div>
    	<div><input name="viewcnt" value="${data.viewcnt }" type="text" readonly="readonly"/></div>
    	<div>작성일자</div>
    	<div><fmt:formatDate value="${data.regdate }" pattern="yyyy-MM-dd HH:mm:ss" /></div>
    	<div>
    		<input type="submit" value="글수정" />
    		<input type="reset" value="리셋" />
    	</div>
    </form>
</body>
</html>