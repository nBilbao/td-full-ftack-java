function f(array,y){
    var conteo=0;
    var mayores=[];
    for(var i=0;i<array.length;i++){
        if(array[i]>y){
            conteo = conteo+1;
            mayores.push(i);
        }
        

    }
    console.log("Los numeros mayores que "+y+" son: "+conteo+" y estos son: "+mayores );
}
f([1,4,3,80,6,45,5,2],30);

function g(array){
    let max=array[0],min=array[0],suma=0;
    let prom=0.0;


    for(var i=0; i<array.length;i++){
        suma+=array[i];
        if(array[i]<array[i+1]){
            min=array[i];
        }
        else{
            max=array[i];
        }

    }
    prom=suma/array.length;
    console.log("El valor mínimo es: "+min+" el valor máximo es: "+max+" y el promedio: "+prom );
}
g([5,5,3,5,90,1]);

function h(array){
    for(let i=0;i<array.length;i++){
        if (array[i]<0){
            array[i]="Dojo";
        }
    }
    console.log(array);
}

h([2,1,-3,4,-1]);

function i(array,x,y){

    if(x>=0 & x<=array.length){
        if(y>=0 & y<=array.length){
            if(x<y) {
                array.splice(x,y-x+1);
            }
            else console.log("El valor de x debe ser menor al de y!");
        }
        else console.log("rango para y: invalido!");
    }
    else console.log("rango para x: invalido!");
    console.log(array);
}
i([20,30,40,50,60,70],2,4);


