import java.util.ArrayList;

public class Portafolio {
    private ArrayList<Object> portafolios = new ArrayList<Object>();

    public Portafolio() {
    }

    public Portafolio(ArrayList<Object> portafolios) {
        this.portafolios = portafolios;
    }

    public ArrayList<Object> getPortafolios() {
        return portafolios;
    }

    public void setPortafolios(ProyectoClass portafolios) {
        this.portafolios.add(portafolios);
    }

    public String showPortfolio(){
        String salida="";

        for(Object dato:portafolios){
            salida = salida+dato.toString();
        }

        return salida;
    }
}
