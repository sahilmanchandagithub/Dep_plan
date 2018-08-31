$(function() {

    $('#login-form-link').click(function(e) {
		$("#login-form").delay(100).fadeIn(100);
 		$("#register-form").fadeOut(100);
		$('#register-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});
    
	$('#register-form-link').click(function(e) {
		$("#register-form").delay(100).fadeIn(100);
 		$("#login-form").fadeOut(100);
		$('#login-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});

});


/*
$(document).ready(function()

		{


$('#button').click(function(e) {
	
	console.log("clicked");
    e.preventDefault();
    var username = $('input#username').val();
    var password = $('input#password').val();

    if(password == ""){
       alert("Please enter a Password");
       $('#password').focus();
       return false;
    }

    if(username == ""){
       alert("Please enter a Username");
       $('#username').focus();
       return false;
    }

    if(username != '' && password != '') {
        $.ajax({
            url: 'http://localhost:8088/homepage.jsp',
            type: 'POST',
            data: {
                username: username,
                password: password
            },
            success: function(data) {
                console.log(data);
                // It looks like the page that handles the form returns JSON
                // Parse the JSON
                var obj = JSON.parse(data);

                if(obj.result != 'invalid') {
                    alert("Login succeeded");
                    // You should redirect the user too
                    window.location = 'http://redirecturl.com';
                }                    
            }
        });
    } 
}); 

		}

/*

</script>


$(document).ready(function()

		{
			
		$('#button').click(function()
				  		 	

		{
			
		
			console.log("clicked");
			alert("Login is succesfull");
            window.location.replace("/homepage");
			
		})

		})
		

*/