<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> 
	<head> 
		<meta charset="UTF-8">
		<style type="text/css">
			/* *{color:red} */
			div{background-color:yellow;}
			#div2{background-color:aqua;}
			.div3{background-color:olive;}
			
			#div4, #p1, #h1{background-color:orange;}
			
			#div5 p{background-color:blue;}
			#div6 > p{background-color:fuchsia;}
			
			[checked] {color:green;}
			[selected=true]{color:green;}
			#form1[checked]{background-color:green;}
			
			a {color:black; text-decoration:none;}
			a:hover{color:green; text-decoration:underline;}
		</style>
	</head>
	<body> 
	CSS선택자
	
	<hr/>
	
	<div>A</div>
	<div id="div2" class="div3">B</div>
	<div class="div3">C</div>
	<div class="div3">D</div>
	<br/>
	<div id="div4">E</div>
	<p id="p1">F</p>
	<h3 id="h1">G</h3>
	
	<br/>
	
	<div id="div5"></div>
		<p>A</p>
		<p>A</p>
	</div>
	
	<div id="div6"></div>
	<div><p>A</p></div>
	<p>A</p>
	</div>
	
	<div>
		<div checked="true">A</div>
		<div checked="false">B</div>
		<div selected="false">C</div>
		<div selected="true">D</div>
		<div selected="true">E</div>
		
		
	</div>
	
	<div>
		<a href="http://www.naver.com">네이버</a><br/>
		<a href="http://tomcat.apache.org">톰캣</a><br/>
		<a href="http://www.w3c.org">W3C</a>
	</div>
	
	<form id="form1">
		<div checked="true">A</div>
		<div checked="false">B</div>
	</form>
	</body>
</html>