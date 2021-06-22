public class Triangulo {

    private Integer lado;
    private Integer altura;

    public Triangulo(Integer lado, Integer altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public Integer getLado() {
        return lado;
    }

    public void setLado(Integer lado) {
        this.lado = lado;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public double getArea(){
        return (getAltura()*getLado())/2;
    }

    @Override
    public String toString() {
        return "Triangulo: " +
                " lado : " + getLado() +
                " altura: " + getAltura() +
                " Área: " + getArea();
    }
}
