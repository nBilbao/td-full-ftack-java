import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

    public ArrayList<Integer> pregunta1(){
        int[] array = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> arrayMayores = new ArrayList<Integer>();
        int i;
        int sum=0;

        for(i=0;i<array.length;i++){
            sum = sum + array[i];
            if(array[i]>10){
                arrayMayores.add(array[i]);
            }
        }
        return arrayMayores;
    }

    public ArrayList<String> pregunta2(){

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> namesOrdenados = new ArrayList<String>();

        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");

        Collections.shuffle(names);
        System.out.println("\n"+names);
        for(String datos:names){

            if(datos.length()>5){
                namesOrdenados.add(datos);
            }
        }
        return namesOrdenados;
    }
    
    public ArrayList<Character> pregunta3(){
        ArrayList<Character> array = new ArrayList<Character>();

        for(char i='a';i<='z';i++){
            array.add(i);
        }

        Collections.shuffle(array);
        System.out.println("\nLa última letra es: "+array.get(array.size()-1));
        if(array.get(0)== 'a' ||array.get(0)== 'e'||array.get(0)=='i' ||array.get(0)=='o'||array.get(0)=='u'){
            System.out.println("La primera letra es una Vocal");
        }
        else{
            System.out.println("La primera letra es: "+array.get(0));
        }
        return array;

    }

    public ArrayList<Integer> pregunta4(){
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        Random random = new Random();
        int numero=0;

        for(int i=0;i<10;i++){
            numero = random.nextInt(100);

            if(numero<55){
                numero = Math.abs(numero-100);
                numbers.add(numero);
            }
            else{
                numbers.add(numero);
            }
        }
        return numbers;
    }
    public ArrayList<Integer> pregunta5(){
        ArrayList<Integer> array= new ArrayList<Integer>();
        Random random = new Random();
        int numero=0;

        for(int i=0;i<10;i++){
            numero = random.nextInt(100);

            if(numero<55){
                numero = Math.abs(numero-100);
                array.add(numero);
            }
            else{
                array.add(numero);
            }
        }
        // metodo de ordaniemiento mas complejo
        //array.sort(Integer::compareTo);
        Collections.sort(array);
        System.out.println("\nEl valor mínimo del arreglo es: "+array.get(0));
        System.out.println("El valor máximo del arreglo es: "+array.get(array.size()-1));

        return array;
    }

    public String pregunta6(){
        String cadena="";

        for(int i=0;i<5;i++){

            int rnd = (int) (Math.random() * 52); // or use Random or whatever
            char base = (rnd < 26) ? 'A' : 'a';
            char caracter= (char) (base + rnd % 26);
            cadena= cadena+caracter;
        }
        return cadena;
    }
    public ArrayList<String> pregunta7() {
        ArrayList<String> array = new ArrayList<String>();
        String cadena = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {

                int rnd = (int) (Math.random() * 52); // or use Random or whatever
                char base = (rnd < 26) ? 'A' : 'a';
                char caracter = (char) (base + rnd % 26);
                cadena = cadena + caracter;
            }
            array.add(cadena);
            cadena = "";

        }




        return array;
    }





}
