import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Angebot {

    private double regulearpreis;
    private GregorianCalendar flugdatum;
    private String flugnummer;
    Rabattstrategie rabattstrategie;

    public Angebot(double regulearpreis, GregorianCalendar flugdatum, String flugnummer) {
        this.regulearpreis = regulearpreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;

        rabattstrategieWaehlen();
    }

    private void rabattstrategieWaehlen() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        String str = sdf.format(flugdatum.getTime());

        if (str.equals("Januar") || str.equals("April") || str.equals("Oktober")) {
            this.rabattstrategie = new MaxiDiscount("MaxiDiscount");
        } else if (str.equals("Februar") || str.equals("März")) {
            this.rabattstrategie = new MidiDiscount("MidiDiscount");
        } else {
            this.rabattstrategie = new ZeroDiscount("ZeroDiscount");
        }
    }

    public double getReduzierterPreis(double preis) {
        return rabattstrategie.getReduzierterPreis(preis);
    }

    public double getReduzierterPreis() {
        return rabattstrategie.getReduzierterPreis(regulearpreis);
    }

    public double getRegulearpreis() {
        return regulearpreis;
    }

    public void setRegulearpreis(double regulearpreis) {
        this.regulearpreis = regulearpreis;
    }

    public GregorianCalendar getFlugdatum() {
        return flugdatum;
    }

    public void setFlugdatum(GregorianCalendar flugdatum) {
        this.flugdatum = flugdatum;
    }

    public String getFlugnummer() {
        return flugnummer;
    }

    public void setFlugnummer(String flugnummer) {
        this.flugnummer = flugnummer;
    }

    public void ausgeben() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Angebot{" +
                "regulearpreis= " + regulearpreis +
                "rabattierterpreis= " + rabattstrategie.getReduzierterPreis(regulearpreis) +
                ", flugdatum= " + flugdatum +
                ", flugnummer='" + flugnummer + '\'' +
                ", rabattstrategie= " + rabattstrategie +
                '}';
    }

}
