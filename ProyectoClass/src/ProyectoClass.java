public class ProyectoClass {

    private String name;
    private String description;
    private Double initialCost;

    public ProyectoClass(){

    }

    public ProyectoClass(String name) {
        this.name = name;
    }

    public ProyectoClass(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInitialCost(Double initialCost){
        this.initialCost= initialCost;
    }

    public Double getInitialCost(){
        return initialCost;
    }

    public String elevatorPitch(){
        return getName()+"("+getInitialCost()+"):"+getDescription();
    }




    @Override
    public String toString() {
        return " ProyectoClass.\n" +
                " Nombre: " + getName() +
                " Descripción: " + getDescription();
    }

}
