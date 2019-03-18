$(function() {

    function  load() {


        $('.time').mouseover(
            function () {
                $(this).css({'background-color': 'lightseagreen'});
            }
        );
        $('.time').mouseout(
            function () {
                $(this).css({'background-color': ''});
            }
        );
        $('.time').click(function () {

            let sid = $(this).find("#sid").val();
            //alert(sid);

            $('<form action="order" method="post">' +
                '<input type="hidden" name="sid1" id="sid1" value="' + sid + '">' +
                '' +
                '</form>').appendTo('body').submit();

            //window.open('order', '_self');
        });



    }

    load();

    $('#selection').change(function () {

        //alert($(this).val());

        const currentDate = $(this).val();
        const scheduleDate = {date: currentDate};
        $.post('movie', {date: JSON.stringify(scheduleDate)}, processData, "json");

    });

    function processData(data){
        //data = JSON.parse(data);

        console.log(data);

        $('#container').html("");


        for (let i = 0; i < data.length; i++  ) {
            $('#container').append("    <div class=\"movie\">\n" +
                "        <div class=\"poster\">\n" +
                "            <img src=\" " +data[i].imageUrl+"\" \" />" +
                " <div class=\"times\" id='mov"+data[i].id+"' >   </div> " +
                "</div>" +
                "    </div>");


            for (let j=0; j< data[i].times.length; j++ )  {

                //console.log(data[i].times[j].stime);

                $('#mov'+ data[i].id).append(" \n" +
                    "\n" +
                    "            <span class=\"time\" ><input type=\"hidden\" name=\"sid\" id=\"sid\"" +
                    " value=\""+data[i].times[j].id+"\"> "+ data[i].times[j].stime +" </span>\n" +
                    "\n" +
                    "                </div>")

            }

        }


        load();
        console.log("load called");

        // var td0=$('<td>').text(data.id);
        // var td1 = $('<td>').text(data.name);
        // var td2 = $('<td>').text(data.price);
        // var tr = $('<tr>').append(td0).append(td1).append(td2);

    }

});