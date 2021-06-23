public class Ninja extends Human{

    public Ninja(){
        super();
        setStealth(10);
    }

    public void robar(Human a){

        a.setHealth(a.getHealth()-this.getStealth());
        this.setHealth(this.getHealth()+this.getStealth());

    }
    public void escapar(){
        this.setHealth(this.getHealth()-10);
    }
    @Override
    public String toString() {

        return "Ninja{" +
                "strength=" + getStrength() +
                ", intelligence=" + getIntelligence() +
                ", stealth=" + getStealth() +
                ", health=" + getHealth() +
                '}';
    }


}
