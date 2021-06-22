public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // su codigo aqui
        head = null;
    }
    //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(){
        //Falta implementar

    }

    public void printValues(){


        Node newNode = new Node();
        if(head == null) {
            System.out.println("Lista vacia!");

        } else {
            Node runner = head;
            while(runner.next != null) {
                System.out.println(""+runner.value);
                runner = runner.next;
            }
            System.out.println(""+runner.value);
        }
    }


}