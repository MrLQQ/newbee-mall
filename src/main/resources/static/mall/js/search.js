//$(function () {
//    $('#keyword').keypress(function (e) {
//        var key = e.which; //e.which是按键的值
//        if (key == 13) {
//            var q = $(this).val();
//            if (q && q != '') {
//                window.location.href = '/search?keyword=' + q;
//            }
//        }
//    });
//});

/*搜索按钮的onclick触发方法*/
function search() {
    var q = $('#keyword').val();
    if (q && q != '') {
        window.location.href = '/search?keyword=' + q;  // 发送search请求，跳转到搜索结果页面
    }
}