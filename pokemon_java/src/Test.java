public class Test {

    public static void main(String[] args) {

        Pokedex dex = new Pokedex();

        Pokemon picachu     = dex.createPokemon("Picachu",100,"dasda");
        Pokemon rockruff    = dex.createPokemon("Rockruff",100,"daRockruffsda");
        Pokemon lycanroc    = dex.createPokemon("Lycanroc",100,"dLycanrocffsda");
        Pokemon wishiwashi  = dex.createPokemon("Wishiwashi",100,"daWishiwckruffsda");
        Pokemon Mareanie    = dex.createPokemon("Mareanie",100,"daRockrufeaniea");
        
        dex.setPokedex(picachu);
        dex.setPokedex(rockruff);
        dex.setPokedex(lycanroc);
        dex.setPokedex(wishiwashi);
        dex.setPokedex(Mareanie);

        System.out.println(dex.pokemonInfo(picachu));

        dex.listPokemon();


        System.out.println(picachu.getCount());


    }


}
