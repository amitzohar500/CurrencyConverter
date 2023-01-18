package Coins;

public interface ICalculate {

    // abstract function that when implemened in a non abstract class that implements this interface
    // gets an amount in one coin and returns the matching amount in another coin.
    double calculate(double amount);

}
