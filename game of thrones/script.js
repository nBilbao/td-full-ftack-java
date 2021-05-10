$(document).ready(function () {
    var link="https://anapioficeandfire.com/api/houses/";
    var casa =0;

    $('.casa').click(function(e){
        $(this).fadeOut("fast");
        $(this).fadeIn("fast");
        
        switch(e.target.id){
            case "stark":
                casa = 362;
                break;
            case "targaryen":
                casa = 378;
                break;
            case "lannister":
                casa=229;
                break;
            case "baratheon":
                casa=285;
                break;

        }
        
        $.get("https://anapioficeandfire.com/api/houses/"+casa, function (res) {

        console.log(res.name)
            var titulos="";

            $('#name').html('Name:  '+res.name);
            $('#words').html('<br>Words:  '+res.words);
            for(let i=0;i<res.titles.length;i++){
                titulos+=" "+res.titles+" ";
            }
            $('#titles').html('Titles:  '+titulos);    
            },"JSON");






    });
    
});