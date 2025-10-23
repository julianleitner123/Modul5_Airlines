public class ZeroDiscount extends Rabattstrategie {
    @Override
    public double getPreis(double preisOhneNachlass) {
        return super.getPreis(preisOhneNachlass);
    }
}
