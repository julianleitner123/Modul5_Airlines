import java.util.GregorianCalendar;

public class Angebot {

    private double regulearpreis;
    private GregorianCalendar flugdatum;
    private String flugnummer;

    public Angebot(double regulearpreis, GregorianCalendar flugdatum, String flugnummer) {
        this.regulearpreis = regulearpreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;
    }

    public void rabattstrategieWaehlen() {

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
