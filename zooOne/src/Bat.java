public class Bat extends Mammal{

    public Bat(){
        super(300);
    }

    public void fly(){

        setEnergyLevel(-100);
        System.out.println("buuuum!");

    }

    public void eatHumans(){

        setEnergyLevel(25);
        System.out.println("bueno, no importa");

    }

    public void attackTown(){

        setEnergyLevel(-50);
        System.out.println("gouuuuszdjj");

    }


}
