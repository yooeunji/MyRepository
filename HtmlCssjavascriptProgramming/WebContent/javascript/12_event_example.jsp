<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> 
	<head> 
		<meta charset="UTF-8">
		<script type="text/javascript">
		
			function checkMid(){
				var mid=document.querySelector("#mid");
				mid.value=mid.value.toLowerCase();
			}
			
			window.onload=function(){
				document.querySelector("#mid").addEventListener("keypress", checkMid);
				document.querySelector("#mid").addEventListener("change", changeMid);
			}
			
			function changeImg(img){
				
				if(event.type=="mouseover"){
					img.src="../common/image/photo1.jpg";
				}else if(event.type=="mouseout"){
					img.src="../common/image/photo2.jpg";
				}
			}
			
			function changeImg2(event){
				var img=event.target;
				if(event.type=="mouseover"){
					img.src="../common/image/photo1.jpg";
				}else if(event.type=="mouseout"){
					img.src="../common/image/photo2.jpg";
				}
			}
			
			window.addEventListener("load", function(){
				var img2=document.querySelector("#img2");
				img2.addEventListener("mouseover", changeImg);
				img2.addEventListener("mouseout", changeImg);
			});
			
			function changeColor(div){
				if(event.type=="mouseover"){
					div.style.background="blue";
				}else if(event.type=="mouseout"){
					div.style.background="red";
				}
			}
			
		</script>
	</head>
	<body> 
		다양한 Event처리
			<hr/>
		<h3>[Ex1]</h3>
		<form>
		<!-- 	<input id="mid" type="text" name="mid" onkeypress="checkMid()" onchange="checkMid()"/> -->
			<input id="mid" type="text" name="mid"/>
		</form>
		<br/>
		<h3>[ Ex2 ]</h3>
		<img id="img1" src="../common/image/photo1.jpg" width="200px" onmouseover="changeImg(this)" onmouseout="changeImg(this)"/>
		<br/><br/>
		<img id="img2" src="../common/image/photo2.jpg" width="200px" onmouseover="changeImg(this)" onmouseout="changeImg(this)"/>
		<h3>[ Ex3 ]</h3>
		<div id="div1" style= "width="200px"; height="200px"; background-color=red;"onmouseover="changeColor(this)" onmouseout="changeColor(this)"> </div>
	</body>
	
</html>