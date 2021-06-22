public class ProyectoTest {
    public static void main(String[] args) {
        ProyectoClass proyecto = new ProyectoClass("Diseño de Casas","Proyecto para la elavoración de casas");
        ProyectoClass proyecto2 = new ProyectoClass("Base de datos","Diseño de base de datos.");
        ProyectoClass proyecto3 = new ProyectoClass("RR:HH","Contro de RR.HH");
        Portafolio portafolio = new Portafolio();

        portafolio.setPortafolios(proyecto);
        portafolio.setPortafolios(proyecto2);
        portafolio.setPortafolios(proyecto3);



        System.out.println(portafolio.showPortfolio());









    }

}
