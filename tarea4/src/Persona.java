import java.util.Random;

public class Persona {

    private String nombre="";
    private String apellido="";
    private short edad=0;
    private String rut;
    private char sexo='h';
    private Double peso=0.0;
    private Double altura=0.0;

    public Persona() {
        generRUT();
    }

    public Persona(String nombre, short edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generRUT();
    }

    public Persona(String nombre, String apellido, short edad, String rut, char sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rut = rut;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    public short calcularMC(){
        Double imc = peso/(altura*altura);
        if(imc<20){
            return -1;
        }
        else if(20<=imc && imc<=25){
            return 0;
        }
        else{
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        if (edad<18){
            return false;
        }
        else{
            return true;
        }
    }
    public void comprobarSexo(char sexo){

        if(sexo == 'm' || sexo =='M'){
            setSexo(sexo);
        }
        else{
            setSexo('H');
        }

    }

    public void generRUT(){
        rut="";
        Random random = new Random();
        String dig ="-";
        String comienzo ="";

        for(int i=0;i<1;i++){

            comienzo+=""+ random.nextInt((2 - 1) +1);
        }
        for(int i=0;i<3;i++){

            rut+=""+ random.nextInt((10 - 1) + 1) + 1;
        }
        dig +=  random.nextInt((10 - 1) + 1) ;;

        if (dig.equals("11")){
            dig="k";
        }
        rut= comienzo+rut+dig;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", rut=" + rut +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
