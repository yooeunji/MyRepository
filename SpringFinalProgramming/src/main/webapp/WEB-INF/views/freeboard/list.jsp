<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html> 
	<head> 
		<meta charset="UTF-8">
		<style type="text/css">
			a{
				text_decoration:none;
				color:black;
			}
			a:HOVER{
				color:green;
			}
		</style>
	</head>
	<body> 
		자유게시판
		<hr/>
		<table>
		<c:if test="${login!=null}">
			<a href="write">[글쓰기]</a>
		</c:if>
		
				<table style="border-collapse: collapse; border: 1px solid black; width:600px">
			<tr style="background-color:#ffcc00">
				
				<td style="border:1px solid black;">번호</td>
				<td style="border:1px solid black;">제목</td>
				<td style="border:1px solid black;">글쓴이</td> 
				<td style="border:1px solid black;">조회수</td> 
				<td style="border:1px solid black;">날짜</td>
			</tr>
			
			
			<c:forEach var="freeboard" items="${list}">
				<tr>
					<td style="border:1px solid black;">${freeboard.bno}<br/></td>
					<td style="border: 1px solid black;">
						<a href="info?bno=${freeboard.bno}">${freeboard.btitle}</a></td>
				
					<td style="border:1px solid black;">${freeboard.bwriter}<br/></td>
					<td style="border:1px solid black;">${freeboard.bhitcount}<br/></td>
					<td style="border:1px solid black;">${freeboard.bdate}<br/></td>
				</tr>
			</c:forEach>
		</table>
		
		
		
				
		<div style="width:600px">
			<a href="list?pageNo=1">[처음]</a>
			<c:if test="${groupNo>1}">
				<a href="list?pageNo=${startPageNo-1}">[이전]</a>
			</c:if>
			
			<c:forEach var="i" begin="${startPageNo}" end="${endPageNo}">
			&nbsp;
				<a href="list?pageNo=${i}"
				<c:if test="${pageNo==i}">
				style="color:red"</c:if>>${i}</a>
			&nbsp;
			</c:forEach>
	
			<c:if test="${groupNo<totalGroupNo}">
				<a href="list?pageNo=${endPageNo+1}">[다음]</a>
				<a href="list?pageNo=${totalPageNo}">[맨끝]</a>
			</c:if>
		
		
		</div>		
		</table>
	</body>
</html>