public class Circulo extends Punto{
    private double radio;

    public Circulo(Integer cordenadaX, Integer cordenadaY, double radio) {
        super(cordenadaX, cordenadaY);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = (Math.max(radio, 0.0));
    }

    public double getDiametro(){
        return 2*getRadio();
    }

    public double getArea(){
        return Math.PI*getRadio()*getRadio();
    }

    @Override
    public String toString() {
        return "Circulo  : " +
                " Radio: " + getRadio()+
                " Coordenadas: "+
                "[" + getCordenadaX()+
                ","+getCordenadaY() +
                "] "+
                " Diametro: "+getDiametro()+
                " Área: "+getArea();
    }
}
