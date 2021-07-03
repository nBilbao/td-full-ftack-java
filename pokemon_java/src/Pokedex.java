import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{

    private ArrayList<Pokemon> pokedex = new ArrayList<>();

    public void setPokedex(Pokemon pokemon){
        this.pokedex.add(pokemon);

    }
    

    public void listPokemon(){
        StringBuilder lista= new StringBuilder("");
        for (Pokemon datos : pokedex) {

            lista.append("\n "+datos.toString());

        }
        System.out.println(lista);
    }

}
