$(function () {
    $('#convert').click(function () {
        let arg1 = $('#arg1').val();
        let arg2 = $('#arg2').val();
        let arg3 = $('#arg3').val();
        if (!arg1) {
            $('#arg1').css("border-color", "red");
        } else {
            $('#arg1').css("border-color", "");
        }
        if (!arg1) {
            alert('Укажите значение!')
            return;
        }
        if (arg1 < 0) {
            alert('Укажите неотрицательное значение!')
            return;
        }
        $.ajax({
            url: 'converter/convert?arg1=' + arg1 + '&arg3=' + arg3 + '&arg2=' + arg2,
            type: 'POST',
            success: function (result) {
                $('#result').text(arg1 + ' ' + arg3 + ' = ' + result.resultedValue + ' ' + arg2)
                    .css("color", "green")
                    .css("font-weight", "bold");
            }
        });
    });
});