package com.company.Players;

public class DummyPlayer implements Player {

    private final String name;
    private int number;
    private int maxrange;

    public DummyPlayer(int maxrange, String name) {
        this.name = name;
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

    @Override
    public String getName() {
        return name;
    }
}
