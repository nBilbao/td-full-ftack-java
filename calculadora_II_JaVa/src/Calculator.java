import java.util.ArrayList;

public class Calculator {

    private ArrayList<String> almacen= new ArrayList<>();
    private ArrayList<String> almacen2= new ArrayList<>();
    private ArrayList<String> soluciones= new ArrayList<>();
    private Double resultadoFinal=0.0;

    private Double resultado=0.0;



    public Calculator(){

    }

    public void performOperation(String dato){

        almacen.add(dato);

        if(dato=="="){

            for (int i = 0; i<almacen.size()-1;i++) {

                if(almacen.get(i)=="*"){

                    resultado = Double.parseDouble(almacen.get(i-1)) * Double.parseDouble(almacen.get(i+1));
                    almacen2.add(resultado.toString());
                    almacen2.remove(i-1);

                }
                else if(almacen.get(i)=="/"){

                    resultado = Double.parseDouble(almacen.get(i-1)) - Double.parseDouble(almacen.get(i+1));
                    almacen2.add(resultado.toString());
                    almacen2.remove(i-1);

                }
                else {
                    almacen2.add(almacen.get(i));
                }

            }
            for (int j = 1; j<almacen2.size();j+=2) {
                if(almacen2.get(j)!="+" && almacen2.get(j)!="-" && almacen2.get(j)!="*" && almacen2.get(j)!="/"){
                    almacen2.remove(j);
                }
            }
            for (int k = 0; k<almacen2.size()-1;k++) {

                if(almacen2.get(k)=="+"){

                    resultado = Double.parseDouble(almacen2.get(k-1)) + Double.parseDouble(almacen2.get(k+1));
                    soluciones.add(resultado.toString());

                }
                else if(almacen2.get(k)=="/"){

                    resultado = Double.parseDouble(almacen2.get(k-1)) - Double.parseDouble(almacen2.get(k+1));
                    soluciones.add(resultado.toString());

                }

            }

            for(String resultados: soluciones){
                resultadoFinal+= Double.parseDouble(resultados);
            }

        }
    }

    public String getResults(){

        System.out.println(resultadoFinal);
        return almacen.toString();
    }




}
