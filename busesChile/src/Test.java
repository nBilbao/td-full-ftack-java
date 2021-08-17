import com.busesChile.controlllers.VentaController;
import com.busesChile.models.Ciudad;

import java.util.Scanner;

public class Test {

    static VentaController controlador = new VentaController();

    public static void main(String[] args) {

        /*Declaramos las variables de tipo boolean, entera, double y String*/
        boolean salir = false;
        int opcion;
        double num1, num2;
        String nom, ape;

        Scanner sc = new Scanner(System.in);
        /*Bucle que permite repetir el menu*/
        while (!salir) {
            System.out.print("\nMenú Buses Chile \n 1. Realizar Reserva \n 2. Opcion 2 \n 3. Ver Destinos \n 7. Salir \n");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            /*Switch con cada uno de los casos para las diferentes opciones del menu*/
            switch (opcion) {
                case 1:
                    System.out.print("Crear Reserva de Pasaje \nEn esta opcion podras sumar dos numeros. \n");

                    break;
                case 2:
                    System.out.print("Bienvenido estas en la Opcion 2! \nEn esta opcion podras ingresar tu nombre y apellido. \n");
                    System.out.print("Ingresa tu nombre: ");
                    nom = sc.next();
                    System.out.print("Ingresa tu apellido: ");
                    ape = sc.next();
                    System.out.print("Tu nombre completo es: \n");//Invocacion del metodo nombreCompleto que recibe dos parametros
                    break;
                case 3:
                    System.out.print("\nVista de ciudades\n");
                    System.out.print(controlador.mostrarCiudades());
                    break;



                case 7:
                    System.out.print("Hasta luego!");
                    salir = true;//Se pone la variable salir en verdadero para salir del Bucle
                    break;
                default:
                    System.out.print("Opcion no valida!");
            }
        }
    }
}
