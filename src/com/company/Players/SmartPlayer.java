package com.company.Players;

public class SmartPlayer implements Player {
    private final int maxrange;
    private final String name;
    private int number;
    private int number1;
    private int number2;
    private boolean test = false;
    private int score;

    public SmartPlayer(int maxrange, String name) {
      this.name =name;
      this.maxrange = maxrange/2;
      number1 = this.maxrange;
      number2 = this.maxrange;
      score=0;

    }

    @Override
    public void guess() {
        if(number1 < 0)number1=maxrange;
        if(number2 > maxrange)number2=maxrange;
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

    @Override
    public int getScore() {
        return score;
}

    @Override
    public void addScorePoint() {
     ++score;
    }


}
