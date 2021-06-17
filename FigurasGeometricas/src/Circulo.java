public class Circulo {
    private final double pi = 3.141592;
    private double diametro=0.0;

    public double calcularArea(){
        return Math.pow((this.diametro)/2,2)*pi;
    }
    public double calcularPerimetro(){
        return 2*pi*(diametro/2);
    }

    public double getPi() {
        return pi;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}
