package Coins;


public class ILS extends Coin {

    private final static double value = 0.28;

    // gets the ILS to USD conversion rate
    @Override
    public double getValue() {

        return value;
    }

    // gets an amount in ILS and returns the matching amount in USD.
    @Override
    public double calculate(double amount) {
        return amount * getValue();
    }
}
