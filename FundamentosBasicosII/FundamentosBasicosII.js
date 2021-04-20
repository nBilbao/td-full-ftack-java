function a(array){
    for(let i=0;i<array.length;i++){
        if(array[i]>0){
            array[i]="big";
        }
    }
    console.log(array);
}
a([-1,3,5,-5]);

function b(array){
    let min=array[0];
    let max=array[0];
    for(let i =1;i<array.length;i++){
        if(min>array[i]){
            min=array[i];
        }
        else if(max<array[i]){
            max=array[i];
        }
    }
    console.log(min);
    return max;
}

console.log(b([4,2,4,5,-1]))

function c(array){
    console.log(array[array.length-2]);

    for(let i =0;i<array.length;i++){
        if(array[i]%2==1){
            return array[i];
        }
    }

}
console.log(c([-2,4,6,5]));

function d(array){
    let newArray=[];
    for(let i=0;i<array.length;i++){
        newArray[i]=array[i];
        newArray[i]=newArray[i]*2;
    }
    console.log(newArray);
}
d([1,2,3]);

function e(array){
    let temp=0;
    for(let i=0;i<array.length;i++){
        if(array[i]>0){
            temp+=1;
        }
    }
    array[array.length-1]=temp;
    console.log(array);
}
e([-1,1,1,1]);

function j(array){
    for(let i=0;i<array.length;i++){
        if(array[i]%2==1 && array[(i+1)]%2==1 && array[(i+2)]%2==1){
            console.log("¡Que imparcial!");
        }
        else if(array[i]%2==0 && array[(i+1)]%2==0 && array[(i+2)]%2==0){
            console.log("¡Es para bien!");

        }
    }
}
j([2,2,1,2,3,3,3]);

function k(array){
    for(let i=0;i<array.length;i++){
        if(i%2==1){
            array[i]=array[i]+1;
        }
        console.log(array[i]);
    }
    return array;
}
console.log(k([1,2,3,4,5]));

function l(array){

    for (let i=array.length-1;i>0;i--){
        array[i]=array[i-1].length;
    }
    console.log(array);
}
l(["Programar","dojo","genial"]);


function m(array){
    let newArray=[];
    for(let i=0;i<array.length;i++){
        newArray[i]=array[i];
        newArray[i]=newArray[i]+7;
    }
    console.log(newArray);
}
m([1,2,3]);

function n(array){
    let temp= 0;
    let contador=1;
    for (let i=0;i<array.length/2;i++){
        temp=array[array.length-contador];
        array[array.length-contador]=array[i];
        array[i]=temp;
        contador+=1;
    }
    console.log(array);
}
n([2,4,6,1,3]);

function p(array){
    let newArray=[];
    let temp=0;

    for(let i=0;i<array.length;i++){
        temp=Math.abs(array[i]);
        temp= temp-(2*temp);
        newArray[i]=temp;
    }
    console.log(newArray);

}
p([1,-3,5]);

function q(array){
    let count=0;
    for(let i=0;i<array.length;i++){
        if(array[i]=="comida"){
            console.log("Yummy");
        }else{
            count+=1;
        }
    }
    if(count==array.length){
        console.log("tengo hambre");
    }

}
q([1,2,8,4,"comida"]);

function r(array){
    let aux=0;
    let conteo=1;
    for(let i=0;i<=2;i+=2){
        aux= array[i];
        array[i]=array[array.length-conteo];
        array[array.length-conteo]=aux;
        conteo+=2;
    }
    console.log(array);
}
r([1,2,3,4,5,6]);

function s(array,num){
    for(let i=0;i<array.length;i++){
        array[i]= array[i]*num;
    }
    return array;

}

console.log(s([1,2,3],3));
