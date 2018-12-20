/* global$ */

$(function () {
    $("img").on('error', function(){$(this).attr({src:'http://sozai.7gates.net/img/icon/loading/loading01_r3_c3.gif'});
      });
  });
