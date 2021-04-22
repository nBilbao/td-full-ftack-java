//Devuelve la suma de 1 a N. Por ejemplo,  Sum1toN(3) devolverá la suma de 1+2+3, la cual es 6
//sum1toN(255) devuelve la suma de todos los números de 1 a 255
function Sum1toN(n){
    let aux=0;
    for(let i=0;i<=n;i++){
        aux+=i;
    }
    return aux;
}

console.log(""+Sum1toN(2));
console.log(""+Sum1toN(3));
console.log(""+Sum1toN(4));
//devuelve la suma del primer y último número en el array
function sumFirstLast(arr){
    return arr[0]+arr[arr.length-1];
}
console.log(""+sumFirstLast([1,2]));
console.log(""+sumFirstLast([2,3,8]));
console.log(""+sumFirstLast([-6,23,3,-4]));


function ordenarArray(array){
    let aux=0;
    for(let i=0;i<array.length;i++){
        for(let j=0;j<array.length;j++){
            if(array[i]<array[j]){
                aux=array[i];
                array[i]=array[j];
                array[j]=aux;
            }
        }
    }
    return array;
}
console.log(ordenarArray([5,4,3,2,1]));
console.log(ordenarArray([3,2,1]));


describe("Sum1toN", function() {
    it("should return 3 when we pass 2 as an argument", function() {
        expect(Sum1toN(2)).toEqual(3);
    });
    it("should return 6 when we pass 3 as an argument", function() {
        expect(Sum1toN(3)).toEqual(6);
    });
    it("should return 10 when we pass 4 as an argument", function() {
        expect(Sum1toN(4)).toEqual(10);
    });
});

describe("sumFirstLast", function() {
    it("should return 3 when we pass [1,2] as an argument", function() {
        expect(sumFirstLast([1,2])).toEqual(3);
    });
    it("should return 10 when we pass [2,3,8] as an argument", function() {
        expect(sumFirstLast([2,3,8])).toEqual(10);
    });
    it("should return -10 when we pass [-6,23,3,-4] as an argument", function() {
        expect(sumFirstLast([-6,23,3,-4])).toEqual(-10);
    });
});

describe("ordenarArray", function(){
    it("should return [1,2,3,4,5] when [5,4,3,2,1] as an argument", function(){
        expect(ordenarArray([5,4,3,2,1])).toEqual([1,2,3,4,5]);
    });
    it("should return [1,2,3] when [3,2,1] as an argument", function() {
        expect(ordenarArray([3,2,1])).toEqual([1,2,3]);

    });
}); 