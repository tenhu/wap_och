$(function() {

    $('#ticketcount').change(function(){

        let total = parseFloat($(this).val()) * parseFloat($('#price').val());
        $('#totalprice').val(total);
    });

    $('#confirmBtn').click(function(){
         console.log("confirm");

         let tCount = $("#ticketcount").val();
         let tPrice = $("#totalprice").val();

         console.log(tCount + "," + tPrice );

        $('<form action="payment" method="post">' +
            '<input type="hidden" name="tCount" id="tCount" value="' + tCount + '">' +
            '<input type="hidden" name="tPrice" id="tPrice" value="' + tPrice + '">' +
            '</form>').appendTo('body').submit();


    });

    $('#cancelBtn').click(function(){
        console.log("hello cancel ");
        window.open('movie','_self');
    });



});