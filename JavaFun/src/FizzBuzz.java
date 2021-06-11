public class FizzBuzz {
    public String fizzBuzz(int number){
        String salida="";
        if(number%3==0 && number%5==0){
            salida="FizzBuzz";
        }else if(number%5==0){
            salida="Buzz";
        }else if(number%3==0){
            salida="Fizz";
        }
        else{
            salida =""+number;
        }
        return salida;
    }
}
