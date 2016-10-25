<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> 
	<head> 
		<meta charset="UTF-8">
	</head>
	<body> 
		[회원정보]
		<hr/>
		
			아이디:${member.mid}  <br/>    <%-- <- 파라미터 값 --%>    <%-- name="  " <-파라미터 이름 --%>
			이름:${member.mname} <br/>
			비밀번호:${member.mpassword} <br/>
			나이 : ${member.mage} <br/>
			생년월일:${member.mbirth}				
	</body>
</html>