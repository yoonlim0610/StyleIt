<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style>
@charset "UTF-8";

/* container */
.content-wrap-ff{
    margin: 0 auto;
    width: 1201px;
}

.content-wrap-ff .left{

	position: relative;
	float: left;
	width: 600px;
	border-right: 1px solid #808080;
}

.content-wrap-ff .right{
    position: relative;
    margin-left: 600px;
   width: 600px;
   border-left: 1px solid #808080;
}

.content-wrap-ff strong{
	
	color: #797979;

}

.left_content{
   width: 500px;
   margin-top: 50px;   
}

.right_content{
   width: 500px;
   margin-top: 50px;   
}

/*세부 설정*/
.title{
   font-size: 25px;
   position: relative;
   float: left;
   width: 588px;
   text-align: center;   
   padding-bottom: 20px;
    border-bottom: 2px solid #797979;
    margin-left: 5px;
}

.Rimg img{
   width: 100px;
   height: 100px;
}
.left_content .nick{
   font-size: 15px;
   font-weight: bold;
}
.recA{
color:#393939;
font-weight:bold;
text-decoration: none;
font-size: 17px;
}

.recA:hover{
font-style: italic;   
}

.memnick .memA{
color: #393939;
font-weight:bold;
text-decoration: none;
font-size: 17px;
}

.memnick .memA:hover{
font-style: italic;   
}

.left_content span{
    padding-top: 20px;
    padding-bottom: 20px;
    padding-left: 20px;
    font-size: 17px;
    position: relative;
    display: block;
}

.right_content span{
    padding-top: 20px;
    padding-bottom: 20px;
    padding-left: 20px;
    font-size: 17px;
    position: relative;
    display: block;
}

.memfollower, .Rnick {
   font-size: 15px;
}
</style>

<!-- jQuery 2.2.4 -->
<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js"></script>

<!-- 부트스트랩 3.3.2 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>

<body>
<script type="text/javascript">
function doFollow(m_no){
	console.log("m_no는"+m_no);
	$.ajax({
		type:'post',
		url:'/mypage/followinglist',
		data:{'m_no':m_no},
		dataType:'json',
		success:function(data){
			console.log('팔로우성공?'+data.KEY);
			$("#followBtn_"+m_no).prop("disabled", true);
			$("#followBtn_"+m_no).text("팔로우성공");
// 			$("#followBtn_"+memnick).css("width", "200px");
		},error:function(e){
			console.log('팔로우실패');		
		}
	});
}
</script>


<div id="container"><!-- Begin #container -->
	<div class="content-wrap-ff">
		<div class="left_content">
				<table class="recomm">
	                <tbody>
		            <c:forEach items="${followinglist}" var="ad">
	                    <tr>
	                        <td class="Rimg" rowspan="2"><img class="imt_loaded" src="/upload/${mypage.fu_storedName }"></td>
	                        <td class="memnick"><a href="#" class="memA">${m_nick}</a></td>
	                    </tr>
	                    <tr>
	                        <td class="memfollower">팔로워수가 무려 <strong>${countFollower}명!</strong></td>
	                    </tr>
	                        <tr><td><button class="followBtn" id="followBtn_${m_no}" onclick="doFollow('${m_no }')">팔로우</button></td></tr>
		            </c:forEach>
	                </tbody>
		        	</table>
			</div>

</div>
</div>
</body>
</html>

			
			
