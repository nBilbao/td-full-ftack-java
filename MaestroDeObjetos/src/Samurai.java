public class Samurai extends Human{

    public Samurai(){

        super();
        setHealth(200);
    }

    public void golpeMortal(Human a){

        a.setHealth(0);
        this.setHealth(getHealth()/2);

    }

    public void meditar(){

        this.setHealth(this.getHealth()+(getHealth()/2));

    }

    public Integer cuantos(){

        return this.getHealth();

    }
    @Override
    public String toString() {

        return "Samurai{" +
                "strength=" + getStrength() +
                ", intelligence=" + getIntelligence() +
                ", stealth=" + getStealth() +
                ", health=" + getHealth() +
                '}';
    }

}
