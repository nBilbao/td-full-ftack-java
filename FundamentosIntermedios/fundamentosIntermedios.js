function sigma(num){
    let suma=0;
    for(let i=1;i<=num;i++){
        suma=suma+i;
    }
    console.log(suma);
}
sigma(5);

function factorial(num){
    let suma=1;
    for(let i=1;i<=num;i++){
        suma=suma*i;
    }
    console.log(suma);
}
factorial(5);

function fibonacci(num){
    let array=[];
    for(let i=0;i<=num;i++){
        array[i]=i;
    }
    for(let i=2;i<=num;i++){
        array[i]=array[i-2]+array[i-1];
    }
    console.log(array[num]);
}
fibonacci(6);

function penultimo(array){
    if(array.length>=2){
        console.log("El penúltimo valor es: "+array[array.length-2]);
    }else {
        return null;
    }
}
penultimo([42,true,4,'Liam', 7]);

function ultimo(array,n){
    if(array.length>=2){
        console.log("El valor es: "+array[n]);
    }else {
        return null;
    }
}
ultimo([5,2,3,6,4,9,7],3);

function segundo(array){
    let temp=0;
    if(array.length>1){
        for(let i=0;i<array.length;i++){
            for(let j=0;j<array.length;j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }else{
        return null;
    }
    console.log(array)
    console.log(array[1]);

}
segundo([42,1,4,3.14,7]);

function par(array){
    array2=[];
    for(let i=0;i<array.length;i++){
        array2.push(array[i]);
        array2.push(array[i]);
    }
    console.log(array2);
}
par([4, 'Ulysses', 42, false]);


function fib(n){
    if(n==0 || n==1){
        return n;
    }
    return fib(n-2)+fib(n-1);

}
console.log(fib(8));











