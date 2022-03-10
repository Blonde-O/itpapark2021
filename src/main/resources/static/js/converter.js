$(function () {
    $('#convert').click(function () {
        let arg1 =$('#arg1').val();
        if (!arg1){
            $('#arg1').css("border-color", "red");
        }
        else {
            $('#arg1').css("border-color", "");
        }
        if (!arg1){
            alert('Укажите значение!')
            return;
        }
        $.ajax({
            url:'/converter/convert?arg1='+arg1,
            type: 'POST',
            success: function (result) {
                $('#result').text('Результат конвертации ' +result.value);
            }
        });
    });
    
});