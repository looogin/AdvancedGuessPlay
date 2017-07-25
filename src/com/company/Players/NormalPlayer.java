package com.company.Players;

public class NormalPlayer implements Player {
    private final String name;
    private int number;
    private int maxrange;
    private int score;

    public NormalPlayer(int maxrange, String name) {
        this.name = name;
        this.maxrange = maxrange;
        score = 0;
    }

    @Override
    public void guess() {
        number = (int) ((Math.random() * maxrange)+Math.random()*10);
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    @Override
    public void addScorePoint() {
        ++score;
    }


}
