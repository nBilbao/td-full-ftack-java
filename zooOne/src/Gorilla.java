public class Gorilla extends Mammal{

    public void throwSomething(){
        setEnergyLevel(-5);
        System.out.println("El gorila ha lanzado algo!");
    }

    public void eatBananas(){
        setEnergyLevel(10);
        System.out.println("El gorila está satisfecho");
    }

    public void climb(){
        setEnergyLevel(-10);
        System.out.println("el gorila ha trepado a la cima de un árbol");
    }

}
