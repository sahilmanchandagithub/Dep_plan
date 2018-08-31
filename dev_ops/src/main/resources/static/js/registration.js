$(document).ready(function()

{
	
$('#button').click(function()
		  		 	

{
	console.log("clicked");
	
	validate();

	
})

})    
    
    
    
function adduser() {
	
	
regObj={};
regObj["name"]=$("#name").val();
regObj["email"]=$("#email").val();
regObj["username"]=$("#username").val();
regObj["password"]=$("#password").val();
	
$.ajax
                    ({

                        type: "POST",
                        data: JSON.stringify(regObj),
                        url: '/registration',
                        async: true,contentType: "application/json",
                        timeout: 8000,
                        success: function (response) {

                            //if (response == 1) {
                        	
                        	
                                alert("Registrtion is succesfull");
                                window.location.replace("login");
                            //}
                           // else {
                           //     alert("Update Failed");
                            //}

                       },

                        error: function (x, textStatus, m) {
							alert(response);
                            alert("error"+ x, textStatus,m);
                        }

                    });

    }


function validate()

{	
console.log("hello1");	

var x = document.forms["formname"]["name"].value;

if (x == "") 
{
alert("Name must be filled out");
console.log("hello2");
return false;   
}

var a = document.forms["formname"]["email"].value;

if (a == "") {
alert("Email must be filled out");
console.log("hello3");
return false;
}

var b = document.forms["formname"]["username"].value;
if (b == "") {
alert("Username must be filled out");
return false;
}

var c = document.forms["formname"]["password"].value;
if (c == "") {
alert("Passsword must be filled out");
return false;
}

var d = document.forms["formname"]["confirm"].value;
if (d == "") {
alert("Password must be filled out");
return false;
}


if ( c!=d )

{
alert("password not matched");	
return false;	
}


if  ( a!="" && b!="" && c!="" && d!="" && x!="" )

{
	
adduser();
return true;	

}
	

}
					
					
					
					
				
					