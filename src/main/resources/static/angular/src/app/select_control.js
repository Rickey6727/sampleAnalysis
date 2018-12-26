//送信ボタン
function selectChangeCapture() {
    if($('#select_form_capture').val()){
        $("#submit_button_capture").fadeIn(400);
    } else {
        $("#submit_button_capture").fadeIn(400);
    }
}

function selectChangeClothes() {
    if($('#select_form_clothes').val()){
        $("#submit_button_clothes").fadeIn(400);
    } else {
        $("#submit_button_clothes").fadeIn(400);
    }
}

function selectChangeDelivery() {
    if($('#select_form_delivery').val()){
        $("#submit_button_delivery").fadeIn(400);
    } else {
        $("#submit_button_delivery").fadeIn(400);
    }

}


function selectChangeGacha() {
    if($('#select_form_gacha').val()){
        $("#submit_button_gacha").fadeIn(400);
    } else {
        $("#submit_button_gacha").fadeIn(400);
    }
}


function selectChangeGuild() {
    if($('#select_form_guild').val()){
        $("#submit_button_guild").fadeIn(400);
    } else {
        $("#submit_button_guild").fadeIn(400);
    }
}


//検索結果
function submitCapture() {
    $("#submit_capture").fadeIn(400);
}

function submitDelivery() {
    $("#submit_delivery").fadeIn(400);
}

function submitGuild() {
    $("#submit_guild").fadeIn(400);
}

function submitGacha() {
    $("#submit_gacha").fadeIn(400);
}

function submitClothes() {
    $('li').remove();
    $("#submit_clothes").fadeIn(400);
    document.getElementById("loading_clothes_owners").style.display="block";
}


//CSV書き出し
function downloadCapture() {
    $("#download_capture").fadeIn(400);
}

function downloadDelivery() {
    $("#download_delivery").fadeIn(400);
}

function downloadGuild() {
    $("#download_guild").fadeIn(400);
}

function downloadGacha() {
    $("#download_gacha").fadeIn(400);
}

function downloadClothes() {
    $("#download_clothes").fadeIn(400);
}
