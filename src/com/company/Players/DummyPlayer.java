package com.company.Players;

public class DummyPlayer implements Player {
    private int number;
    private int maxrange;

    public DummyPlayer(int maxrange) {
        this.maxrange = maxrange;
    }

    @Override
    public void guess() {

        number = (int) ((Math.random() * maxrange)+(Math.random() /2 * maxrange));
    }

    @Override
    public int getNumber() {

        return number ;
    }
}
