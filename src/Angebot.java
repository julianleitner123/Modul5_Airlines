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
    }

    public void rabattstrategieWaehlen() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        String str = sdf.format(flugdatum.getTime());

        if (flugdatum.equals("januar") || flugdatum.equals("april") || flugdatum.equals("oktober")) {
            MaxiDiscount maxiDiscount = new MaxiDiscount("MaxiDiscount");
        } else if (flugdatum.equals("februar") || flugdatum.equals("march")) {
            MidiDiscount midiDiscount = new MidiDiscount("MidiDiscount");
        } else {
            ZeroDiscount zeroDiscount = new ZeroDiscount("ZeroDiscount");
        }

    }

    public double getReduzierterPreis(double preis) {
        return rabattstrategie.getReduzierterPreis(preis);
    }

    public double getReduzierterPreis() {
        return regulearpreis;
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


}
