<%@ page cont=
`ype="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> 
	<head> 
		<meta charset="UTF-8">
	</head>
	<body> 
		날짜 얻기
			<hr/>
		<script type="text/javascript">
			var now=new Date();
			console.log(now);
			
			console.log("년 : "+now.getFullYear());
			console.log("월 : "+(now.getMonth()+1));
			console.log("일 : "+now.getDate());
			console.log("요일 : "+now.getDay());
			
			
		
		</script>
			
			

	</body>
	
</html>