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
        mago.fireBall(villano);
        System.out.println(villano.getHealth());

        ninja.steal(villano);
        System.out.println(villano.getHealth());
        System.out.println(ninja);

        ninja.runaWay();
        System.out.println(ninja);

        System.out.println(samurai);

        samurai.deadBlow(villano);
        System.out.println(villano.getHealth());

        System.out.println(samurai);
        samurai.meditate();
        System.out.println(samurai);






    }
}
