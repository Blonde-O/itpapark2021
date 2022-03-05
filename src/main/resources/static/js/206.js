document.addEventListener('DOMContentLoaded', docReady);

function docReady() {
    document.getElementsByTagName('button')[0].addEventListener('click', showCorrectAnswer);
    document.getElementsByTagName('button')[0].addEventListener('click', showCorrectAnswerForCheckbox);
}

function showCorrectAnswer() {
    if (document.querySelector('input[type=radio]:checked').value == 'value2') {
        document.querySelector('input[type=radio]:checked').nextElementSibling.style.backgroundColor = 'green';
    } else {
        document.querySelector('input[type=radio]:checked').nextElementSibling.style.backgroundColor = 'red';
    }

}

function showCorrectAnswerForCheckbox() {
    var checkbox = document.querySelectorAll('input[type=checkbox]:checked');
    var i = 0;
    for (i; i < checkbox.length; i++) {
        var check = checkbox[i];

        if (check.value == 'value2') {
            check.checked = true;
            check.nextElementSibling.style.color = 'green';
        } else {
            check.checked = false;
            check.nextElementSibling.style.color = 'red';
        }
    }

}
