<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> 
	<head> 
		<meta charset="UTF-8">
	</head>
	<body> 
		게시물 쓰기
		<hr/>
		<form method="post" action="/myapp2/exam11/boardWrite">
		글쓴이:<input type="text" name="bwriter" value="늦가을"/><br/>
		제목:<input type="text" name="btitle" value="단풍은 왔는가?"/><br/>
		내용:<textarea rows="5"cols="20" content="bcontent" value="단풍이 오기도 전에 겨울이 왔어요."/></textarea>
		<input type="submit" value="글쓰기"/>
	</body>
</html>