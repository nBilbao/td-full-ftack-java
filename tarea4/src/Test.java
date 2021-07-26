public class Test {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("juan", (short) 30,'H');
        Persona persona3 = new Persona("juanita","Perez", (short) 31,"17319806k",'M',52.2,1.65);

        System.out.println(persona1);
        System.out.println(persona2);
    }
}
