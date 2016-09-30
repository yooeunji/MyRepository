<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> 
	<head> 
		<meta charset="UTF-8">
	</head>
	<body> 
		[게시물 등록 폼]<br/>
		<form method="post" action="/myapp2/board/write">
		이름:<input type="text"name="mname" value="유은지"> <br/>
		내용:<input type="text"content="mcontent" value="내용을 입력하세요."> <br/>
		<input type="image" src="/myapp2/resources/image/ok.jpg" width="100"/>
	</body>
</html>