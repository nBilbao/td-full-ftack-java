import java.util.ArrayList;

public class ListadeExcepciones {
    ArrayList<Object> myList = new ArrayList<Object>();

    public void implementacion(){

        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");

        try {
            for(Object dato: myList){
                int castedValue = (int) dato;
            }

        }catch (Exception e){
            System.out.println("Error "+e.getMessage());

        }





    }



}
