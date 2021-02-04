package day1.lab3;

import java.lang.annotation.Target;

public class Account {

    private static int tradeCount = 0;


    public static int getTradeCount() {
        setTradeCount();
        return tradeCount;
    }

    public static  void setTradeCount() {

        tradeCount = Trade.getCounter();
    }
}
