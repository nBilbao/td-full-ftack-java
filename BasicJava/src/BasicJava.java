import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public static void main(String[] args) {
        imprimir();
        impares();
        suma();
        reArray();
        maximo();
        prom();
        arrNum();
        mayor();
        cuadrado();
        negativo();
        mmp();
        cambiar();

    }
    public static void imprimir(){
        int i=1;
        while(i<=255){
            System.out.println(i);
            i++;
        }
    }
    public static void impares(){
        int i=1;
        while(i<=255){
            if(i%2==1){
                System.out.println(i);
            }
            i++;
        }
    }
    //suma de números.
    public static void suma(){
        int i=0;
        int aux =0;
        while(i<=255){
            aux = aux +i;
            System.out.println("Nuevo numero: "+i+"  Suma: "+aux);
            i++;
        }
    }
    //recorrer arreglo.
    public static void reArray(){
        int[] x={1,3,5,7,9,13};
        int i;

        for(i=0;i<x.length;i++) {
            System.out.print(x[i]);
        }
    }
    //Obtener el máximo.
    public static void maximo(){
        int[] x={-3,-5,-7};
        int i;
        int aux=x[0];
        System.out.println(aux);
        for(i=1;i<x.length-1;i++) {
            if((x[i]<x[i+1])&&(x[i+1]!=0)){
                aux=x[i+1];
            }
        }
        System.out.println(aux);
    }
    //Obtener el Promedio.
    public static void prom(){
        int[] x={2,10,3};
        int i;
        int sum=0;
        double prom=0.0;
        System.out.println();
        for(i=0;i<x.length;i++) {
            sum=sum+x[i];
        }
        if(x.length!=0){
            prom = (double)sum/x.length;
            System.out.println("Promedio de "+prom);
        }
        else{
            System.out.println("Largo invalido!");
        }
    }
    //Arreglo con Números Impares.

    public static void arrNum(){
        ArrayList<Integer> array = new ArrayList<Integer>();

        int i =0;
        while(i<=255){
            if(i%2==1){
                array.add(i);
            }
            i++;
        }
        System.out.println(array);
    }
    //Mayor que Y
    public static void mayor(){
        int y=3;
        int contador=0;
        int i;
        int[] array={1,3,5,7};
        for(i=0;i<array.length;i++){
            if(array[i]>y){
                contador=contador+1;
            }
        }
        System.out.println("Cantidad de numeros mayor que "+y+" = "+contador);

    }
    //Valores al Cuadrado
    public static void cuadrado(){
        int i;
        int temp=0;
        int[] array={1,5,10,-2};
        for(i=0;i<array.length;i++){
            temp = (int)Math.pow(array[i],2);
            array[i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
    //Eliminar Números Negativos
    public static void negativo(){
        int[] x ={1,5,10,-2};

        int i;
        for(i=0;i<x.length;i++){
            if(x[i]<0){
                x[i]=0;
            }
        }
        System.out.println(Arrays.toString(x));
    }
    //Mínimo, Máximo y Promedio
    public static void mmp(){
        int[] x ={1,5,10,-2};
        int i;
        int min=x[0];
        int max=x[0];
        int suma=0;
        double prom=0.0;

        for(i=0;i<x.length-1;i++){
            if(x[i]>x[i+1]){
                min = x[i+1];
            }
            else if(x[i]<x[i+1]){
                max = x[i+1];
            }
            suma = suma + x[i] ;
        }
        prom = (double)suma/x.length;

        //Cambiando los Valores del Arreglo

        System.out.println("["+max+","+min+","+prom+"]");
    }
    public static void cambiar(){
        int[] array = {1,5,10,7,-2};
        int i;
        for(i=0;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=0;
        System.out.println(Arrays.toString(array));

    }





















}
