public class Test {
    public static void main(String[] args) {
        Calculator calculadora = new Calculator();

        calculadora.setOperandOne(10.5);
        calculadora.setOperation("+");
        calculadora.setOperandTwo(5.2);
        calculadora.performOperation();
        calculadora.getResult();




    }
}
