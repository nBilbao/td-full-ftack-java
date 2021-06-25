public class IPhone extends Phone implements Ringable {

    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String cadena = ("");

        cadena+="IPhone "+ this.getVersionNumber();
        cadena+=" says "+ this.getRingTone();

        return cadena;
    }
    @Override
    public String unlock() {
        return "Unloking via facial recognition";
    }
    @Override
    public void displayInfo() {
        StringBuilder string = new StringBuilder("");

        string.append("IPhone ").append(this.getVersionNumber());
        string.append(" from ").append(this.getCarrier());

        System.out.println(string);
    }
}
