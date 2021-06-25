public class Pokemon {

    private String name;
    private Integer health;
    private String type;
    private static Integer count=0;

    public Pokemon(String name, Integer health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCount(){
        return count;
    }

    public void attackPokemon(Pokemon pokemon){

        pokemon.setHealth(pokemon.getHealth() - 10);

    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='"        + name + '\'' +
                ", health='"    + health + '\'' +
                ", type='"      + type + '\'' +
                '}';
    }
}
