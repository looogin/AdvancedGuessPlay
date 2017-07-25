package com.company.Players;

public class SmartPlayer implements Player {
    private final int maxrange;
    private final String name;
    private int number;
    private int number1;
    private int number2;
    private boolean test = false;

    public SmartPlayer(int maxrange, String name) {
      this.name =name;
      this.maxrange = maxrange;
      number1 = maxrange/2;
      number2 = maxrange/2;

    }

    @Override
    public void guess() {
        if(number1 < 0)number1=maxrange/2;
        if(number2 > maxrange)number2=maxrange/2;
        if (test) {
            --number1;
            number = number1;
        }
        if (!test) {
            number =number2;
            ++number2;
        }
        test = !test;

    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public String getName() {
        return name;
    }


}
