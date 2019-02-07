$(document).ready(function () {
    var counter = 0;

    $("#addrow").on("click", function () {
        var newRow = $("<tr>");
        var cols = "";

        cols += '<td><input type="text" class="form-control" name="Date' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="Sequence' + counter + '"/></td>';
       
	    cols += '<td><input type="text" class="form-control" name="Project category' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="Task Type' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="Task' + counter + '"/></td>';
      
	    cols += '<td><input type="text" class="form-control" name="Server Name' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="Owner' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="Status' + counter + '"/></td>';
       
        cols += '<td><input type="text" class="form-control" name="Start' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="End' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="Duration' + counter + '"/></td>';
      
        cols += '<td><input type="text" class="form-control" name="Start' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="End' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="Duration' + counter + '"/></td>';
        
        cols += '<td><input type="text" class="form-control" name="Start' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="End' + counter + '"/></td>';
        cols += '<td><input type="text" class="form-control" name="Duration' + counter + '"/></td>';
         
        
        cols += '<td><input type="button" class="ibtnDel btn btn-md btn-danger "  value="Delete"></td>';
       
        newRow.append(cols);
        $("table.order-list").append(newRow);
        counter++;
    });



    $("table.order-list").on("click", ".ibtnDel", function (event) {
        $(this).closest("tr").remove();       
        counter -= 1
    });


});



function calculateRow(row) {

	var price = +row.find('input[name^="price"]').val();
    
}

function calculateGrandTotal() {
    var grandTotal = 0;
    $("table.order-list").find('input[name^="price"]').each(function () {
        grandTotal += +$(this).val();
    });
    $("#grandtotal").text(grandTotal.toFixed(2));
}