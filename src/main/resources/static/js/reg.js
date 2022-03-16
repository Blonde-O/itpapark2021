$(function (){
    $('#reg').click(function () {
        let arg1 = $('#arg1').val();
        let arg2 = $('#arg2').val();
        let arg3 = $('#arg3').val();
        $.ajax({
            url: '/registration/reg?arg1=' + arg1 + '&arg2=' + arg2 + '&arg3=' + arg3,
            type: 'POST',
            success: function () {
                $('#result').text('Вы успешно зарегистрированы').style.color='green';
            }
        });
    });
});