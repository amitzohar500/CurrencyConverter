package Coins;

import Coins.Coins;

public class CoinFactory {

    // gets a coin type, creates and returns a coin object
    // (object of a type of a class that derives from the abstract Coin class) based on that coin type.
    public static Coin getCoin(Coins coinType)throws Exception
    {
        switch (coinType)
        {
            case USD:
                return new USD();

            case ILS:
                return new ILS();

            default:
                throw new Exception("invalid coin type");
        }
    }
}
