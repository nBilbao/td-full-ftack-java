public class Rectangulo {
    private double ladoA=0.0;
    private double ladoB=0.0;

    public  double calcularArea(){
        return this.ladoA*this.ladoB;

    }
    public double calcularPerimetro(){
        return (this.ladoB*2)+(this.ladoB*2);
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

}
