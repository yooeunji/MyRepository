<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> 
	<head> 
		<meta charset="UTF-8">
	</head>
	<body> 
	Exam03
	<hr/>
	[회원 가입 폼]<br/>
	<form action="/myapp2/exam03/join">
			아이디:<input type="text" name="mid" value="fall"/> <br/>    
			이름:<input type="text"name="mname" value="한가을"> <br/>
			비밀번호:<input type="password" name=mpassword" value="12345"> <br/>
			이메일:<input type="email" name="memail" value="fall@naver.com"><br/>
			전화번호:<input type="tel" name="mtel" value=010-4711-1129> <br/>
			직업:<input type="radio" name="mjob" value="대학생">대학생      <!-- 네임이 똑같은값을 가져야 하나의 그룹으로 묶이고 그것중에 하나만 선택가능-->
			     <input type="radio" name="mjob" checked value="회사원">회사원  <!-- 디폴트로 지정 -->
			     <input type="radio" name="mjob" value="공무원">공무원<br/>
			개발분야:<input type="checkbox" name="mskill" value="웹">웹 개발
			         <input type="checkbox" name="mskill" value="시스템" checked>시스템 개발
			         <input type="checkbox" name="mskill" value="빅데이터">빅데이터 개발
			         <input type="checkbox" name="mskill" value="IoT" checked>IoT개발<br/>
			주소:
				<select name="maddress1">
					<option>서울특별시</option>
					<option selected>경기도</option>
					<option>부산광역시</option>
					<option>대구광역시</option>
					<option>제주광역시</option>
				</select> -
				<select name="maddress2">
					<option>인천시</option>
					<option>수원시</option>
					<option selected>용인시</option>
					<option>부천시</option>
					<option>의왕시</option>
				</select> -<br/>
				
			생년월일:<input type="date" name="mbirth" value="2016-09-29">	
			<%--  	<input type="submit" value="가입"/>
				<button>가입</button>        둘 기능 같다. 서버로 전송          --> 서버로 안넘어가는주석(<!-- --!>이건 넘어감) --%>
				<br/>
				<input type="image" src="/myapp2/resources/image/join.png" width="100"/>  <!-- resources는 컨트롤러 쓰지않고 이미지 가져올수있다. -->
		
	</body>
</html>