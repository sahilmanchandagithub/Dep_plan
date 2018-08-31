$(document).ready(function()

{
	
$('#submit').click(function()
		  		 	

{
	console.log("clicked");
	 alert("Log out is Succesfull" +
	 		"  Please close the browser to fully logout");
	
	window.parent.location.href = "http://localhost:8088/login";
	
	
     
	
})

})    
    
    
    
					