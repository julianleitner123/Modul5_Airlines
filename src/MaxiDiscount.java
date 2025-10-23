public class MaxiDiscount extends Rabattstrategie {

    private String bezeichnung;
    private double rabatt = 0.30;

    public MaxiDiscount(String bezeichnung) {
        super(bezeichnung);
    }

    @Override
    public double getReduzierterPreis(double preis) {
        return preis * (1 - rabatt);
    }

    @Override
    public String getBezeichnung() {
        return bezeichnung;
    }

    @Override
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
