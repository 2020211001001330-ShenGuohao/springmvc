$(function (){
    $(".btn-danger").click(function (){

        var id   = $(this).parent().siblings("td").eq(0).html();
        var name = $(this).parent().siblings("td").eq(1).html();
        var age  = $(this).parent().siblings("td").eq(2).html();
        var sex  = $(this).parent().siblings("td").eq(3).html();
        var cno  = $(this).parent().siblings("td").eq(4).html();

        if(confirm("确定删除\nid: "+id+ "\nname: "+name+ "\nage: "+age+ "\nsex: "+sex + "\ncno: "+cno+"\n这条信息?")){
            window.location.href="delete_Student?id="+id;
        }

    });
})