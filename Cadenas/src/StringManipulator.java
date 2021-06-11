public class StringManipulator {
    public String trimAndConcat(String cadena1, String cadena2){

        String salida = cadena1.trim()+cadena2.trim();
        return salida;
    }
    public int getIndexOrNull(String cadena, char letra){

        int salida= cadena.indexOf(letra);
        return salida;
    }
    public int getIndexOrNull(String cadena1, String cadena2){
        int salida = cadena1.indexOf(cadena2);

        return salida;
    }

    String concatSubstring(String cadena1, int num1, int num2, String cadena2){
        String salida = cadena1.substring(num1,num2)+cadena2;

        return salida;

    }

}
