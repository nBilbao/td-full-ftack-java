function a(){
    let array=[];
    for(let i=1; i<=255; i++){
        array.push(i);
    }
    console.log(array);
}
a();

function b(){
    let suma=0;
    for(let i=1; i<=1000; i++){
        if(i%2==0){
            suma+=i;
        }
    }
    console.log(suma);
}
b();

function c(){
    let suma=0;
    for(let i=1; i<=5000; i++){
        if(i%2==1){
            suma+=i;
        }
    }
    console.log(suma);
}
c();

function d(array){
    let suma=0;
    for(let i=0;i<array.length;i++){
        suma+=array[i];
    }
    console.log(suma);
}
d([2,4,4]);


function e(array){
    let maxNum=array[0];
    for(let i=1;i<array.length;i++){
        if(maxNum<array[i]){
            maxNum=array[i];
        }
    }
    console.log(maxNum);
}
e([-3,3,5,7]);

function f(array){
    let sum=0;
    let prom=0.00;
    if(array.length>0){
        for(let i=0;i<array.length;i++) {
            sum+=array[i];
        }
        prom=sum/array.length
    }else{
        console.log("El array no debe estar vacio!");
    }
    console.log(prom);
}
f([1,3,5,7,20]);

function g(){
    let arrayB = [];
    for(let i=1;i<=50;i++) {
        if(i%2==1){
            arrayB.push(i);
        }
    }
    console.log(arrayB);
}
g();

function h(array,y){
    let conteo=0;
    let arrayB=[];
    for(let i=0;i<array.length;i++){
        if(array[i]>y){
            conteo+=1;
            arrayB.push(array[i]);
        }
    }
    console.log("Existen "+conteo+" mayores que "+y+" y estos son: "+arrayB);
}
h([1,3,5,7],3);

function y(array){
    for(let i=0;i<array.length;i++){
        array[i]=array[i]*array[i];
    }
    console.log(array)
}
y([1,5,10,-2]);

function j(array){
    for(let i=0;i<array.length;i++){
        if(array[i]<0){
            array[i]=0;
        }
    }
    console.log(array);
}
j([1,5,10,-2]);

function k(array){
    let min=array[0], max=array[0], prom=0.0, sum=0;
    for(let i=0;i<array.length;i++){
        sum+=array[i];
        if(min>array[i]){
            min=array[i];
        }
        else if(max<array[i]){
            max=array[i];
        }
    }
    prom=sum/array.length;
    let arrayB=[max,min,prom];
    console.log(arrayB);
}
k([1,5,10,-2]);

function l(array){
    let temp=array[array.length-1];
    array[array.length-1]=array[0];
    array[0]=temp;
    console.log(array);
}
l([1,5,10,-2]);

function m(array){
    for(let i=0;i<array.length;i++){
        if(array[i]<0){
            array[i]="Dojo";
        }
    }
    console.log(array);
}

m([-1,-3,2]);


