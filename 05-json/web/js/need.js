$(function (){
    $.ajax({
        url: 'json_2',
        type: 'post',
        data: {},
        success: function (res) {
            console.log(res);
            var html="";
            for (let i in res) {
                // $("table").append("<tr>"+"<td>"+res[i].name+"</td>"+"<td>"+res[i].age+"</td>"+"<td>"+res[i].sex+"</td>"+"</tr>")
                html=html+"<tr>";
                html=html+"<td>"+res[i].name+"</td>";
                html=html+"<td>"+res[i].age+"</td>";
                html=html+"<td>"+res[i].sex+"</td>";
                $("#test").html(html);


            }

        }
    });
})