public class Punto {

    private Integer cordenadaX;
    private Integer cordenadaY;


    public Punto(Integer cordenadaX, Integer cordenadaY) {
        this.cordenadaX = cordenadaX;
        this.cordenadaY = cordenadaY;
    }

    public Integer getCordenadaX() {
        return cordenadaX;
    }

    public void setCordenadaX(Integer cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public Integer getCordenadaY() {
        return cordenadaY;
    }

    public void setCordenadaY(Integer cordenadaY) {
        this.cordenadaY = cordenadaY;
    }

    @Override
    public String toString() {
        return "Coordenadas Punto: [" + getCordenadaX()
                +","+getCordenadaY() +
                "]";
    }
}
