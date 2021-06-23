public class HumanTest {

    public static void main(String[] args) {
        Human humano = new Human();
        Human villano = new Human();
        Wizard mago = new Wizard();
        Ninja ninja = new Ninja();
        Samurai samurai = new Samurai();




        humano.attack(villano);


        System.out.println(mago);




        System.out.println(villano.getHealth());
        mago.bolaFuego(villano);
        System.out.println(villano.getHealth());

        ninja.robar(villano);
        System.out.println(villano.getHealth());
        System.out.println(ninja);

        ninja.escapar();
        System.out.println(ninja);

        System.out.println(samurai);

        samurai.golpeMortal(villano);
        System.out.println(villano.getHealth());

        System.out.println(samurai);
        samurai.meditar();
        System.out.println(samurai);






    }
}
