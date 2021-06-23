public class Human {

    private Integer strength;
    private Integer intelligence;
    private Integer stealth;
    private Integer health;


    public Human(){
        this.health = 100;
        this.stealth =3;
        this.intelligence =3;
        this.strength = 3;
    }

    public Human(Integer strength, Integer intelligence, Integer stealth, Integer health) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.stealth = stealth;
        this.health = health;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getStealth() {
        return stealth;
    }

    public void setStealth(Integer stealth) {
        this.stealth = stealth;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public void attack(Human a){

        a.setHealth(a.getHealth()-this.getStrength());

    }

    @Override
    public String toString() {
        return "Human{" +
                "strength=" + getStrength() +
                ", intelligence=" + getIntelligence() +
                ", stealth=" + getStealth() +
                ", health=" + getHealth() +
                '}';
    }
}
