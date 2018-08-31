


<!DOCTYPE html>
<html lang="en">



<head><title>HomePage</title>

<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="/js/homepage.js"></script>
	
 <meta charset="utf-8"> 
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="new 1.css">
	<!--/*href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">-->
	<!-- Optional theme -->
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">


</head>	


<frameset rows="20%,70%,10%">



<frame id="top" src="/html/top.html">


<frameset cols="15%,85%">
<frame id="left" src="/html/left.html">
<frame id="main" src="/html/main.html">
</frameset>
<frame id="bottom" src="/html/bottom.html">

</frameset>

<body>index




<%

if(session.getAttribute("username")==null){
	
	
	response.sendRedirect("login");
}


%>
</body>

</html>