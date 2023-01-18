package Coins;

public abstract class Coin implements ICalculate {


    // abstract function that when implemened in derived classes returns a conversion rate from one coin to the other.
    public abstract double getValue();

    // abstract function that when implemened in derived classes gets an amount in one coin and
    // returns the matching amount in another coin.
    @Override
    public abstract double calculate(double amount);


}
