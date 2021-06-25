import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{

    private ArrayList<Pokemon> pokedex = new ArrayList<>();

    public void setPokedex(Pokemon pokemon){
        this.pokedex.add(pokemon);

    }

    public void listPokemon(){
        StringBuilder lista= new StringBuilder("\n ");
        for (Pokemon datos : pokedex) {

            lista.append(datos.toString());

        }
        System.out.println(lista);
    }

}
