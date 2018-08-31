<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New table</title>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="/js/table.js"></script>

<!------ Include the above in your HEAD tag ---------->
</head>




<body>
<div class="container">
    <table id="myTable" class=" table order-list">
    <thead>
        <tr>
            <td>Date</td>
            <td>Sequence</td>
            <td>Project category</td>
            <td>Task Type</td>
            <td>Task</td>
            <td>Server Name</td>
            <td>Owner</td>
            <td>Start</td>
            <td>End</td>
            <td>Duration</td>
            <td>Start</td>
            <td>End</td>
            <td>Duration</td>
            <td>Start</td>
            <td>End</td>
            <td>Duration</td>
            
            
            
        </tr>
    </thead>
    <tbody>
        <tr>
        
        
        
        
        
        
        
        
        
        
            <td class="col-sm-4">
                <input type="text" name="Date" class="form-control" />
            </td>
            <td class="col-sm-4">
                <input type="text" name="Sequence"  class="form-control"/>
            </td>
            <td class="col-sm-3">
                <input type="text" name="Project Category"  class="form-control"/>
            </td>
            <td class="col-sm-4">
                <input type="text" name="Task Type" class="form-control" />
            </td>
            <td class="col-sm-4">
                <input type="text" name="Task"  class="form-control"/>
            </td>
            <td class="col-sm-3">
                <input type="text" name="Server Name"  class="form-control"/>
            </td>
            <td class="col-sm-4">
                <input type="text" name="Owner" class="form-control" />
            </td>
            
            <td class="col-sm-4">
                <input type="text" name="Start"  class="form-control"/>
            </td>
           
             <td class="col-sm-4">
                <input type="text" name="End"  class="form-control"/>
            </td>
            
             <td class="col-sm-4">
                <input type="text" name="Duration"  class="form-control"/>
            </td>
            
            <td class="col-sm-4">
                <input type="text" name="Start"  class="form-control"/>
            </td>
           
             <td class="col-sm-4">
                <input type="text" name="End"  class="form-control"/>
            </td>
            
             <td class="col-sm-4">
                <input type="text" name="Duration"  class="form-control"/>
            </td>
            
            <td class="col-sm-4">
                <input type="text" name="Start"  class="form-control"/>
            </td>
           
             <td class="col-sm-4">
                <input type="text" name="End"  class="form-control"/>
            </td>
            
             <td class="col-sm-4">
                <input type="text" name="Duration"  class="form-control"/>
            </td>
            
           
           
           
            
            <td class="col-sm-2"><a class="deleteRow"></a>
            </td>
            
            
            
        </tr>
    </tbody>
    <tfoot>
        <tr>
            <td colspan="5" style="text-align: left;">
                <input type="button" class="btn btn-lg btn-block " id="addrow" value="Add Row" />
            </td>
        </tr>
        <tr>
        </tr>
    </tfoot>
</table>
</div>
 
</body>
</html>