function resetNegativos(array){
    for (let i=0;i<array.length;i++){
        if(array[i]<0){
            array[i]=0;
        }
    }
    console.log(array);
}
resetNegativos([1,-3,4,-2,100]);



function moverAdelante(array){
    array.push(0);
    for (let i=0;i<array.length-1;i++){
        array[i]=array[i+1];
    }
    array.pop();
    console.log(array)
}
moverAdelante([1,2,3]);



function returnReverso(array){
    let temp=0,contador=array.length-1;
    for (let i=0;i<array.length/2;i++){
        temp= array[i];
        array[i]=array[contador];
        array[contador]=temp;
        contador-=1;
    }
    console.log(array);
}
returnReverso([1,2,3,4,5]);


function repetirValores(array){
    array2=[];
    for (let i=0;i<array.length;i++) {
        array2.push(array[i]);
        array2.push(array[i]);
    }
    console.log(array2);
}

repetirValores([4,'Ulysses', 42, false]);