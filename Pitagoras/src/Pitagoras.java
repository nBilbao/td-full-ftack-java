public class Pitagoras {
    public static void main(String[] args) {
        System.out.println(calcularHipotenusa(2,3));
    }
    public static double calcularHipotenusa(int catetoA, int catetoB){
        double hip = Math.sqrt(Math.pow(catetoA,2)+Math.pow(catetoB,2));
        return hip;
    }
}
