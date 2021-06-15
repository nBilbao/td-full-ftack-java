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

        int i;

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> namesOrdenados = new ArrayList<String>();

        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");

        Collections.shuffle(names);
        System.out.println("\n"+names);
        for(i=0;i<names.size();i++){

            if(names.get(i).length()>5){
                namesOrdenados.add(names.get(i));
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




}
