package Coins;

public class USD extends Coin {

    private final static double value = 3.52;
    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double calculate(double amount) {
        return amount * getValue();
    }
}