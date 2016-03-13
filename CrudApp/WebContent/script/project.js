/**
 * Created by rezau on 2016-02-19.
 */

$(document).ready(function(){
  

    $(".img_class").on("click", function(e) {
        e.preventDefault();
        var image = $(this).children(".imageresource").attr('src');
        //$(this).attr('href', '#');
        $('#imagepreview').attr("src", image);
        $('#myModal').modal('show');

    });

 


    $('#submit').click(function(){
        var send_name = $('#name').val();
        var send_email = $('#email').val();

        $.ajax({

            type: "POST",
            url: "./server.php",
            data: "name="+send_name+"&email="+send_email,
            datatype:'json',
            success: function(msg){
                var user = JSON.parse(msg);
                $('#user_output').html("Name: "+user.name+" Email: "+user.email+" Age:"+user.age+" Country:"+user.country+ " Profession: "+user.prof);
            }

        });

    });

});