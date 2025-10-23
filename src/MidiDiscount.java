public class MidiDiscount extends Rabattstrategie {
    @Override
    public double getPreis(double preisOhneNachlass) {
        return super.getPreis(preisOhneNachlass) * 0.85;
    }
}
