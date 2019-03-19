$(function () {

    function load() {


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

            $('<form action="order" method="post">' +
                '<input type="hidden" name="sid1" id="sid1" value="' + sid + '">' +
                '</form>').appendTo('body').submit();

        });
    }

    load();

    $('#selection').change(function () {

        //alert($(this).val());

        const currentDate = $(this).val();
        const scheduleDate = {date: currentDate};
        $.post('movie', {date: JSON.stringify(scheduleDate)}, processData, "json");

    });

    function processData(data) {
        //data = JSON.parse(data);

        console.log(data);

        $('#container').html("");


        for (let i = 0; i < data.length; i++) {
            $('#container').append("    <div class=\"movie\">\n" +
                "        <div class=\"poster\">\n" +
                "            <img src=\" " + data[i].imageUrl + "\" \" />" +
                " <div class=\"times\" id='mov" + data[i].id + "' >   </div> " +
                "</div>" +
                "    </div>");

            for (let j = 0; j < data[i].times.length; j++) {

                $('#mov' + data[i].id).append(
                    "            <span class=\"time\" ><input type=\"hidden\" name=\"sid\" id=\"sid\"" +
                    " value=\"" + data[i].times[j].id + "\"> " + data[i].times[j].stime + " </span>\n" +
                    " </div>")

            }
        }

        load();
        console.log("load called");

    }

});