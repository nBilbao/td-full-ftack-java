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

describe("ordenarArray", function(){
    it("should return [1,2,3,4,5] when [5,4,3,2,1] is passed", function(){
        expect(ordenarArray([1,2,3,4,5])).toEqual([5,4,3,2,1]);
    });
    it("should return [1,2,3,] when [3,2,1] is passed", function() {
        expect(ordenarArray([3,2,1,])).toEqual([1,2,3]);

    });
});