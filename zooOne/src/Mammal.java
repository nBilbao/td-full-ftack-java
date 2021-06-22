public class Mammal {
    private int energyLevel = 100;

    public void displayEnergy(){
        System.out.println("El nivel de energía es: "+energyLevel);
    }
    public void setEnergyLevel(int energyLevel){
        this.energyLevel = this.energyLevel - energyLevel;
    }

}
