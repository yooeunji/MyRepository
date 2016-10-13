<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> 
	<head> 
		<meta charset="UTF-8">
	</head>
	<body> 
	게시물 상세보기
		<hr/>
	제목 : ${board.btitle} <br/>    <!-- 리퀘스트 또는 세션에서 board라는 객체를 가지고와서 btitle의 변수값을 여기다 저장하겠다~  -->
	내용 : ${board.bcontent} <br/>
	글쓴이 : ${board.bwriter} <br/>
	</body>
</html>