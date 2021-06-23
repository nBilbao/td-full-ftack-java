public class HumanTest {

    public static void main(String[] args) {
        Human humano = new Human();
        Human humano2 = new Human();

        humano.attack(humano2);
        humano.attack(humano2);
        humano.attack(humano2);

        System.out.println(humano.getHealth());
    }
}
