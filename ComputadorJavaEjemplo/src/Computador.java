public class Computador {

     private String marca;
     private String modelo;
     private String procesador;
     private String cantRam;
     private String Precio;

     public void encender(boolean estado){
          if(estado){
               System.out.println("Encendiendo...");
               System.out.println("Equipo encendido.");
          }else{
               System.out.println("Apagando...");
               System.out.println("Equipo apagado.\n ");
          }
     }
     public void conectar(){
          System.out.println("Conectado.");
     }
     public void desconectar(){
          System.out.println("Desconectado.");
     }
     public void reiniciar(){
          System.out.println("Reiniciando");
     }
     public String getMarca() {
          return marca;
     }
     public String getModelo() {
          return modelo;
     }
     public String getProcesador() {
          return procesador;
     }
     public String getPrecio() {
          return Precio;
     }
     public String getCantRam() {
          return cantRam;
     }
     public void setMarca(String marca) {
          this.marca = marca;
     }
     public void setModelo(String modelo) {
          this.modelo = modelo;
     }
     public void setProcesador(String procesador) {
          this.procesador = procesador;
     }
     public void setCantRam(String cantRam) {
          this.cantRam = cantRam;
     }
     public void setPrecio(String precio) {
          Precio = precio;
     }
}
