public class Samurai extends Human{

    public Samurai(){

        super();
        setHealth(200);
    }

    public void deadBlow(Human a){

        a.setHealth(0);
        this.setHealth(getHealth()/2);

    }

    public void meditate(){

        this.setHealth(this.getHealth()+(getHealth()/2));

    }

    public Integer howMany(){

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
