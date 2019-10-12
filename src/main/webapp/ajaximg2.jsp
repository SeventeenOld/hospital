<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- éè¿new Fromè¡¨åå¯¹è±¡,ä»è¡¨åå¯¹è±¡ä¸­è·å¾ä¸ä¼ çæä»¶å¯¹è±¡
	å°è¿ä¸ªå¯¹è±¡éè¿ajaxåéå°åå°
	 -->

<!-- 文件上传 -->
<form action="" id="formId">
<input type="file" name="img">
<input type="button" value="上传" onclick="doUpload()">
<input type="button" value="下载" onclick="download()">
<input type="hidden" value="" id="hid">
</form>
<div >
	<img alt="" src="" id="i1">
</div>

</body>
<script type="text/javascript" src="Js/jquery-1.11.0.js"></script>
<script type="text/javascript">
 function doUpload(){
	 //åå»ºfromè¡¨åå¯¹è±¡
	 var formData = new FormData($("#formId")[0]);
	 //ajaxåéè¯·æ±,è¿åå¾çå°å,èµå¼ç»imgæ ç­¾
	 $.ajax({
		 url:"${pageContext.request.contextPath }/uploadFastDFS",
		 type:"post",
		 data:formData,
		 async:false,
		 contentType:false,
		 processData:false,
		 success:function(data){
			 alert(data.obj);
			 $("#i1").attr("src",data.obj.path);
			 $("#hid").val(data.obj.fid);
		 }
	 })
 }
 
 function download(){
	 //获得id
	 var fid = $("#hid").val();
	 window.open("http://localhost:8080/hospital/download?fid="+fid)
	 
	 
 }
</script>

</html>