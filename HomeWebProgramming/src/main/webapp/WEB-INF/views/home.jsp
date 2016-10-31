<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html> 
	<head> 
		<meta charset="UTF-8">
	</head>
	<body> 
		HomeWebProgramming
		<hr/>
	
		1.<c:if test="${login==null}">
			<a href="<%=pageContext.getServletContext().getContextPath()%>/member/login">로그인</a><br/>  <!-- 동적으로 context를 얻어내는방법 : <%=page%> 표현식 -->
		</c:if>
		<c:if test="${login!=null}">
			<a href="<%=pageContext.getServletContext().getContextPath()%>/member/logout">로그아웃</a><br/>  <!-- 동적으로 context를 얻어내는방법 : <%=page%> 표현식 -->
		</c:if>
		2.<a href="${pageContext.servletContext.contextPath}/photoboard/list">포토 게시판</a><br/>
		
	</body>
</html>