package com.company.Players;

public class DummyPlayer extends Player {

    private final String name;
    private int number;
    private int maxrange;
    private int score;

    public DummyPlayer(int maxrange, String name) {
        super(maxrange, name);
        this.name = name;
        this.maxrange = maxrange;
        score = 0;
    }

    @Override
    public void guess() {

        number =  (int) (((Math.random() * maxrange)+(Math.random() /2 * maxrange)+Math.random()*Math.random()*10)+Math.random());
    }

    @Override
    public int getNumber() {

        return number ;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public  int  getScore() {
        return score;
    }

    @Override
    public void addScorePoint() {
        ++score;
    }
}
