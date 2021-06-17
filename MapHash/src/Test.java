public class Test {
    public static void main(String[] args) {

        MapasHash mapa = new MapasHash();


        mapa.addSong("Falling With The Crowd","So I will close my ears to the falling with the crowd\n" +
                "I never thought of her\n" +
                "I listen to your air\n" +
                "Try to shout and I will smile\n");
        mapa.addSong("Agitated","You do it to me sweetly\n" +
                "To my yeah yeah\n" +
                "You do it to me lovely\n" +
                "To my yeah yeah\n");
        mapa.addSong("Coma","Confide in me\n" +
                "Sustain on my apathy\n" +
                "You're such a mess\n" +
                "You can learn not to confess\n");
        mapa.addSong("Balloonatic","You came,\n" +
                "You came, you scorched her\n" +
                "You came, unstained you adore her\n");



        System.out.println("Falling With The Crowd\n");
        System.out.println(mapa.getLyric("Falling With The Crowd"));
        System.out.println("Coma\n");
        System.out.println(mapa.getLyric("Coma"));



    }
}
