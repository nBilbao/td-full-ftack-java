import java.util.ArrayList;

public class Calculator implements java.io.Serializable{

    private double operandOne =0;
    private double operandTwo =0;
    private String operation="";
    private final ArrayList<Double> resultado = new ArrayList<>();;

    public Calculator(){

    }

    public void performOperation(){


        if(getOperation().equals("+")){

            resultado.add(getOperandOne() + getOperandTwo());

        }
        else if(getOperation().equals("-")){

            resultado.add(getOperandOne() - getOperandTwo());

        }
        else{
            System.out.println("Operación no adminitida!");

        }

    };
    public void getResult(){
        System.out.println(resultado.get(resultado.size()-1));
    };

    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    public ArrayList<Double> getResultado(){
        return resultado;
    }

    @Override
    public String toString() {
        return "Calculator= "+getResultado() ;
    }
}
