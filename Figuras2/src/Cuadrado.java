public class Cuadrado {
    private Integer ladoA;
    private Integer ladoB;

    public Cuadrado(Integer ladoA, Integer ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public Integer getLadoA() {
        return ladoA;
    }

    public void setLadoA(Integer ladoA) {
        this.ladoA = ladoA;
    }

    public Integer getLadoB() {
        return ladoB;
    }

    public void setLadoB(Integer ladoB) {
        this.ladoB = ladoB;
    }

    public double getArea(){
        return getLadoA()*getLadoB();
    }

    @Override
    public String toString() {
        return "Cuadrado :" +
                "  ladoA: " + getLadoA() +
                " ladoB: " + getLadoB() +
                " Área: "+getArea();
    }
}
