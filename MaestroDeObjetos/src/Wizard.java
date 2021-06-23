

public class Wizard extends Human {

    public Wizard() {

        super();
        setHealth(50);
        setIntelligence(8);

    }

    public void curar(Human a) {

        a.setHealth(a.getHealth()+getIntelligence());

    }

    public void bolaFuego(Human a){

        a.setHealth(a.getHealth() - (getIntelligence()*3));

    }

    @Override
    public String toString() {
        return "Wizard{" +
                "strength=" + getStrength() +
                ", intelligence=" + getIntelligence() +
                ", stealth=" + getStealth() +
                ", health=" + getHealth() +
                '}';
    }
}
