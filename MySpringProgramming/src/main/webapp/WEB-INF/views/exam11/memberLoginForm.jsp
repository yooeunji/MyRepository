<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> 
	<head> 
		<meta charset="UTF-8">
	</head>
	<body> 
		[로그인 폼]<br/>
		<form method="post" action="/myapp2/exam11/memberLogin">
			아이디:<input type="text" name="mid" value="fall"/> <br/>    <%-- <- 파라미터 값 --%>    <%-- name="  " <-파라미터 이름 --%>
			비밀번호:<input type="password" name="mpassword" value="12345"> <br/>
			
		<input type="submit" value="로그인" />  <!-- resources는 컨트롤러 쓰지않고 이미지 가져올수있다. -->
	</body>
</html>