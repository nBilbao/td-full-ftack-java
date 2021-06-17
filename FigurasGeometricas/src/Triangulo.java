public class Triangulo {
    private double altura=0.0;
    private double base=0.0;

    public double calcularArea(){
        return (this.altura+this.base)/2;
    }
    public double calcularPerimetro(){
        return base*3;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
