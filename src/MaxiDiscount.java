public class MaxiDiscount extends Rabattstrategie {
    @Override
    public double getPreis(double preisOhneNachlass) {
        return super.getPreis(preisOhneNachlass) * 0.70;
    }
}
