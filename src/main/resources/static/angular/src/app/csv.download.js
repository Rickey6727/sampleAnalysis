function handleDownloadGacha() {
    var bom = new Uint8Array([0xEF, 0xBB, 0xBF]);
    var table = document.getElementById('csv_gacha');
    var data_csv="";

    for(var i = 0;  i < table.rows.length; i++){
        for(var j = 0; j < table.rows[i].cells.length; j++){
        data_csv += table.rows[i].cells[j].innerText;
        if(j == table.rows[i].cells.length-1) data_csv += "\n";
        else data_csv += ",";
        }
    }

    var blob = new Blob([ bom, data_csv], { "type" : "text/csv" });
    if (window.navigator.msSaveBlob) {
        window.navigator.msSaveBlob(blob, "test.csv"); 
        //window.navigator.msSaveOrOpenBlob(blob, "test.csv");// msSaveOrOpenBlobの場合はファイルを保存せずに開ける
    } else {
        document.getElementById("csv_gacha_download").href = window.URL.createObjectURL(blob);
    }
    delete data_csv;
}
function handleDownloadCapture() {
    var bom = new Uint8Array([0xEF, 0xBB, 0xBF]);
    var table = document.getElementById('csv_capture');
    var data_csv="";

    for(var i = 0;  i < table.rows.length; i++){
        for(var j = 0; j < table.rows[i].cells.length; j++){
        data_csv += table.rows[i].cells[j].innerText;
        if(j == table.rows[i].cells.length-1) data_csv += "\n";
        else data_csv += ",";
        }
    }

    var blob = new Blob([ bom, data_csv], { "type" : "text/csv" });
    if (window.navigator.msSaveBlob) { 
        window.navigator.msSaveBlob(blob, "test.csv"); 
    } else {
        document.getElementById("csv_capture_download").href = window.URL.createObjectURL(blob);
    }

    delete data_csv;
}
function handleDownloadClothes() {
    var bom = new Uint8Array([0xEF, 0xBB, 0xBF]);
    var table = document.getElementById('csv_clothes');
    var data_csv="";

    for(var i = 0;  i < table.rows.length; i++){
        for(var j = 0; j < table.rows[i].cells.length; j++){
        data_csv += table.rows[i].cells[j].innerText;
        if(j == table.rows[i].cells.length-1) data_csv += "\n";
        else data_csv += ",";
        }
    }
    var blob = new Blob([ bom, data_csv], { "type" : "text/csv" });
    if (window.navigator.msSaveBlob) { 
        window.navigator.msSaveBlob(blob, "test.csv"); 
    } else {
        document.getElementById("csv_clothes_download").href = window.URL.createObjectURL(blob);
    }
    delete data_csv;
}
function handleDownloadDelivery() {
    var bom = new Uint8Array([0xEF, 0xBB, 0xBF]);
    var table = document.getElementById('csv_delivery');
    var data_csv="";
    for(var i = 0;  i < table.rows.length; i++){
        for(var j = 0; j < table.rows[i].cells.length; j++){
        data_csv += table.rows[i].cells[j].innerText;
        if(j == table.rows[i].cells.length-1) data_csv += "\n";
        else data_csv += ",";
        }
    }
    var blob = new Blob([ bom, data_csv], { "type" : "text/csv" });
    if (window.navigator.msSaveBlob) { 
        window.navigator.msSaveBlob(blob, "test.csv"); 
    } else {
        document.getElementById("csv_delivery_download").href = window.URL.createObjectURL(blob);
    }
    delete data_csv;
}
function handleDownloadGuild() {
    var bom = new Uint8Array([0xEF, 0xBB, 0xBF]);
    var table = document.getElementById('csv_guild');
    var data_csv="";
    for(var i = 0;  i < table.rows.length; i++){
        for(var j = 0; j < table.rows[i].cells.length; j++){
        data_csv += table.rows[i].cells[j].innerText;
        if(j == table.rows[i].cells.length-1) data_csv += "\n";
        else data_csv += ",";
        }
    }
    var blob = new Blob([ bom, data_csv], { "type" : "text/csv" });
    if (window.navigator.msSaveBlob) { 
        window.navigator.msSaveBlob(blob, "test.csv"); 
    } else {
        document.getElementById("csv_guild_download").href = window.URL.createObjectURL(blob);
    }
    delete data_csv;
}