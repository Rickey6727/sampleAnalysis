function chkSelect() {
    $val = $("select[name='Goods']").val();

    if($val == 'capture'){
        $("#capture").fadeIn(400);
    }else {
        $("#capture").fadeOut(0);
    }

    if($val == 'delivery'){
        $("#delivery").fadeIn(400);
    }else {
        $("#delivery").fadeOut(0);
    }

    if($val == 'guild'){
        $("#guild").fadeIn(400);
    }else {
        $("#guild").fadeOut(0);
    }

    if($val == 'gacha'){
        $("#gacha").fadeIn(400);
    }else {
        $("#gacha").fadeOut(0);
    }

    if($val == 'clothes'){
        $("#clothes").fadeIn(400);
    }else {
        $("#clothes").fadeOut(0);
    }
}
