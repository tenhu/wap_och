$(function() {

    $('#ticketcount').change(function(){
        var total = parseFloat($(this).val()) * parseFloat($('#price').val());
        $('#totalprice').val(total);
    });

    $('#confirm').click(function(){
         window.open('login.jsp','_blank');
    });
});