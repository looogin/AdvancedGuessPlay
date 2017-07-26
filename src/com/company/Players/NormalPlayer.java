package com.company.Players;

public class NormalPlayer extends Player {
    private final String name;
    private int number;
    private int maxrange;
    private int score;

    public NormalPlayer(int maxrange, String name) {
        super(maxrange,name);
        this.name = name;
        this.maxrange = maxrange;
        score = 0;
    }

    @Override
    public void guess() {
        number = (int) ((Math.random() * maxrange));
    }

    @Override
    public int getNumber() {
        return number;
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
