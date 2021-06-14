public class Principal {

    public static void main(String[] args) {

        Computador pc1  = new Computador();
        Computador pc2  = new Computador();
        Computador pc3  = new Computador();

        pc1.setMarca("lenovo");
        pc1.setModelo("ah133");
        pc1.setCantRam("8 GB");
        pc1.setProcesador("Intel Core I5 11500k");
        pc1.setPrecio("$ 100.000");

        System.out.println("\nEnciendo equipo marca: "+pc1.getMarca() );
        pc1.encender(true);
        pc1.conectar();
        pc1.reiniciar();
        pc1.desconectar();
        pc1.encender(false);

        pc2.setMarca("Sony");
        pc2.setModelo("Vaio gfsd1w3");
        pc2.setCantRam("16 GB");
        pc2.setProcesador("AMD Ryzen 5500x");
        pc2.setPrecio("$ 180.000");

        System.out.println("\nEnciendo equipo marca: "+pc2.getMarca() );
        pc2.encender(true);
        pc2.conectar();
        pc2.reiniciar();
        pc2.desconectar();
        pc2.encender(false);

        pc3.setMarca("Asus");
        pc3.setModelo("vivo 43sasd3");
        pc3.setCantRam("4 GB");
        pc3.setProcesador("SnapDragon 860");
        pc3.setPrecio("$ 80.000");

        System.out.println("\nEnciendo equipo marca: "+pc3.getMarca() );
        pc3.encender(true);
        pc3.conectar();
        pc3.reiniciar();
        pc3.desconectar();
        pc3.encender(false);
    }
}
