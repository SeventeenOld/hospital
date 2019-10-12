<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<div id="main" style="width: 600px;height:400px;"></div>

</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/Js/jquery-1.11.0.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/Js/echarts.min.js"></script>
<script type="text/javascript">
//页面加载完之后执行的动作
$(document).ready(function(){
	
	//ajax发出请求,获得数据,利用echarts做图表
	$.ajax({
		url:"${pageContext.request.contextPath}/showEcharts2",
		type:"get",
		success:function(data){
			var myChart = echarts.init(document.getElementById("main"))
			var option = {
				    title: {
				        text: '折线图堆叠'
				    },
				    tooltip: {
				        trigger: 'axis'
				    },
				    legend: {
				        data:['邮件营销','联盟广告','视频广告','直接访问','搜索引擎']
				    },
				    grid: {
				        left: '3%',
				        right: '4%',
				        bottom: '3%',
				        containLabel: true
				    },
				    toolbox: {
				        feature: {
				            saveAsImage: {}
				        }
				    },
				    xAxis: {
				        type: 'category',
				        boundaryGap: false,
				        data: ['周一','周二','周三','周四','周五','周六','周日']
				    },
				    yAxis: {
				        type: 'value'
				    },
				    series: [
				        {
				            name:'邮件营销',
				            type:'line',
				            //stack: '总量',
				            data:data[0]
				        },
				        {
				            name:'联盟广告',
				            type:'line',
				           // stack: '总量',
				            data:data[1]
				        },
				        {
				            name:'视频广告',
				            type:'line',
				           // stack: '总量',
				            data:data[2]
				        },
				        {
				            name:'直接访问',
				            type:'line',
				          //  stack: '总量',
				            data:data[3]
				        }
				    ]
				};
			myChart.setOption(option);
		}
	})
})
</script>
</html>