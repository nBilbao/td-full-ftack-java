public class Galaxy extends Phone implements Ringable {

    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }


    @Override
    public String ring() {
        String cadena = ("");

        cadena+="Galaxy "+ this.getVersionNumber();
        cadena+=" says "+ this.getRingTone();

        return cadena;
    }
    @Override
    public String unlock() {
        return "Unlocking via finger print";
    }
    @Override
    public void displayInfo() {
        //galaxy s9 says ring ring
        StringBuilder cadena = new StringBuilder("");

        cadena.append("Galaxy ").append(this.getVersionNumber());
        cadena.append(" from ").append(this.getCarrier());

        System.out.println(cadena);

    }



}
