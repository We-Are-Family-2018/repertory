function validInteger(text) {
    var exp = /^[0-9]+$/;

    if (text == null || text.length == 0) {
        return;
    }

    if (!exp.test(text)) {
        return '必须为整数';
    }
}

function validNumber(text) {
    var exp = /^[0-9]+\.?[0-9]*$/;

    if (text == null || text.length == 0) {
        return;
    }

    if (!exp.test(text)) {
        return '必须为数字';
    }

    var c = text.charAt(text.length - 1);
    if (c == '.') {
        return '必须为数字';
    }
}
