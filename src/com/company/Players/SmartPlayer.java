package com.company.Players;

public class SmartPlayer extends Player {
    private int maxrange;
    private int iterator;
    private int number;
    private int number1;
    private int number2;
    private boolean test = false;
    private int score;

    public SmartPlayer(int maxrange, String name) {
        super(maxrange, name);
        this.maxrange = maxrange / 2;
        number1 = this.maxrange;
        number2 = this.maxrange;
        score = 0;
        iterator = (int) (Math.random() * 1) + 2;

    }

    @Override
    public void guess() {
        if (number1 <= 0) number1 = maxrange;
        if (number2 >= maxrange * 2) number2 = maxrange;
        if (test) {
            number = number1;
            number1 = number1 - iterator;

        }
        if (!test) {
            number2 = number2 + iterator;
            number = number2;

        }
        test = !test;

    }

    @Override
    public int getNumber() {
        return (int) (number+Math.random());
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
