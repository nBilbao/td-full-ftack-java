public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(2));

    }
    public static String fizzBuzz(int number){
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
