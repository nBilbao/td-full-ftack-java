
$('#AddClass').click(function(){
    $("p").first().addClass("red");

})
document.getElementById("imagen").style.display ="none";
$('#Slidetoggle').click(function(){
    $("#imagen").slideToggle("slow",function(){

    });

})
$('#Append').click(function(){
    $("p").last().append("<strong> Ok! i'm ready!</strong>");

})
$('h1').first().click(function(){
    $("p").first().fadeOut("slow");
    $("p").first().fadeIn("slow");

})
