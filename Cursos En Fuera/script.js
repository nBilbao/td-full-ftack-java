
$(document).ready(function(){
    $("img").hover(cambiar, restaurar);
  });
  function cambiar(){
    $(this).attr("src", $(this).attr("src").replace("1.png", "2.png") );
  } 
  function restaurar(){
    $(this).attr("src", $(this).attr("src").replace("2.png", "1.png") );
  }