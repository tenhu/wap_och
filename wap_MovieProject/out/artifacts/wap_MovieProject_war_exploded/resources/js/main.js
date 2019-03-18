$(function() {
    $('.time').mouseover(
        function(){
            $(this).css({'background-color':'lightseagreen'});
        }
    );
    $('.time').mouseout(
        function(){
            $(this).css({'background-color':''});
        }
    );
    $('.time').click(function(){
        window.open('order.jsp','_blank');
    });
});