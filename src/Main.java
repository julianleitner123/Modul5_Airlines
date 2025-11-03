import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Angebot angebot1 = new Angebot(70, new GregorianCalendar(2020, Calendar.FEBRUARY, 14), "5");
        Angebot angebot2 = new Angebot(50, new GregorianCalendar(1960, Calendar.JANUARY, 20), "56");
        Angebot angebot3 = new Angebot(100, new GregorianCalendar(2000, Calendar.JULY, 1), "9");

        System.out.println("rabattierter Preis: " + angebot1.getReduzierterPreis());

        angebot1.ausgeben();
        angebot2.ausgeben();
        angebot3.ausgeben();

    }
}
