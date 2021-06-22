public class Mammal {
    private int energyLevel = 100;

    public Mammal(){

    }

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public void displayEnergy(){
        System.out.println("El nivel de energía es: "+energyLevel);
    }

    public void setEnergyLevel(int energiaGastada){
        energyLevel = energyLevel + energiaGastada;
    }

}
